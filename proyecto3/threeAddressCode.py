"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

class Terceto():

    def __init__(self, o=None, x=None, y=None, r=None, l=None, t=None):
        self.o = o
        self.x = x
        self.y = y
        # self.r = r
        self.l = l
        self.t = t

    def keys(self):
        return ["l", "o", "x", "y"]
        return ["l", "r", "o", "x", "y"]

    def values(self):
        l = self.l if self.l != None else ""
        y = self.y if self.y != None else ""

        return [l, self.o, self.x, y]
        return [l, self.r, self.o, self.x, y]


class ThreeAddressCode():

    def __init__(self, symbol_table):
        self.tercetos = []
        self.symbol_table = symbol_table

    def add(self, o=None, x=None, y=None, r=None, l=None, t=None):

        if type(o) not in [type(None), int, str]:
            o = str(o)

        if type(x) not in [type(None), int, str]:
            x = str(x)

        if type(y) not in [type(None), int, str]:
            y = str(y)

        if type(r) not in [type(None), int, str]:
            r = str(r)

        if type(l) not in [type(None), int, str]:
            l = str(l)

        if type(t) not in [type(None), int, str]:
            t = str(t)

        if not r:
            # Compiler Three Address Code Reference
            r = "_t{i}".format(i=len(self.tercetos))

        # if not l:
        #     # Compiler Three Address Code Label
        #     l = "l_{i}".format(i=len(self.tercetos))

        terceto = Terceto(o, x, y, r, l, t)
        self.tercetos.append(terceto)

        return terceto, r

    def generate_intermediate_code(self):
        with open("output/code.tac", "w") as f:
            for terceto in self.tercetos:
                l = terceto.l
                # r = terceto.r
                r = "_t{i}".format(i=self.tercetos.index(terceto))
                o = terceto.o
                x = terceto.x
                y = terceto.y

                line_init = "{l} := \n\t".format(l=l) if l else "\t"

                if o == "<-" and not y:
                    # Save value in memory
                    f.write(line_init + "{r} <- {x}\n".format(l=l, r=r, x=x))
                elif o == "<-" and y:
                    f.write(line_init + "{r} <- {y} @ {x}\n".format(l=l, r=r, x=x, y=y))
                elif o == "call":
                    # Goto
                    f.write(line_init + "{r} <- call {x}, {y}\n".format(l=l, r=r, x=x, y=y))
                elif o == "goto" and not y:
                    # Goto
                    f.write(line_init + "goto {x}\n".format(l=l, r=r, x=x))
                elif o == "goto" and y:
                    # Conditional goto
                    f.write(line_init + "goto {x} if {y}\n".format(l=l, r=r, x=x, y=y))
                elif not y:
                    # Unary operation
                    f.write(line_init + "{r} <- {o} {x}\n".format(
                        l=l,
                        r=r,
                        x=x,
                        o=o,
                    ))
                else:
                    f.write(line_init + "{r} <- {x} {o} {y}\n".format(
                        l=l,
                        r=r,
                        x=x,
                        o=o,
                        y=y,
                    ))

    def generate_assembly_code(self):
        with open("output/code.s", "w") as f:
            # Writing data first
            f.write(".data\n")
            for terceto in self.tercetos:
                l = terceto.l
                # r = terceto.r
                r = "_t{i}".format(i=self.tercetos.index(terceto))
                o = terceto.o
                x = terceto.x
                y = terceto.y
                t = terceto.t

                if t in ["int", "str"]:
                    if o == "<-" and not y:
                        # Save value in memory
                        if t == "int":
                            f.write("\t{r}: .word {x}\n".format(r=r, x=x))
                        elif t == "str":
                            f.write("\t{r}: .asciiz {x}\n".format(r=r, x=x))
                    elif o == "<-" and y:
                        f.write("\t{r}: .word {y} @ {x}\n".format(r=r, x=x, y=y))
                elif o in ["+", "-", "*", "/", "==", "!=", ">", "<", ">=", "<="]:
                    # Save value in memory
                    f.write("\t{r}: .word 0\n".format(r=r))

            f.write("\n")
            for terceto in self.tercetos:
                l = terceto.l
                # r = terceto.r
                r = "_t{i}".format(i=self.tercetos.index(terceto))
                o = terceto.o
                x = terceto.x
                y = terceto.y
                t = terceto.t

                if t not in ["int", "str"]:
                    if l:
                        symbol = self.symbol_table.get_from_addr(l)
                        f.write("\n.text\n.globl {id}\n{id}:\n".format(id=symbol.id))

                    if o == "<-" and not y:
                        # Save value in memory
                        # f.write("\t#" + "{r} <- {x}\n".format(l=l, r=r, x=x))
                        f.write("\tlw $t0, {x}\n".format(l=l, r=r, x=x))
                    elif o == "<-" and y:
                        f.write("\t#" + "{r} <- {y} @ {x}\n".format(l=l, r=r, x=x, y=y))
                    elif o == "call":
                        # Goto
                        # f.write("\t#" + "{r} <- call {x}, {y}\n".format(l=l, r=r, x=x, y=y))
                        if x == 'out_int':
                            f.write("\n")
                            f.write("\tlw $a0, {y}\n".format(y=y))
                            f.write("\tli $v0, 1\n")
                            f.write("\tsyscall\n")
                        elif x == 'out_string':
                            f.write("\n")
                            f.write("\tla $a0, {y}\n".format(y=y))
                            f.write("\tli $v0, 4\n")
                            f.write("\tsyscall\n")
                    elif o == "goto" and not y:
                        # Goto
                        f.write("\t#" + "goto {x}\n".format(l=l, r=r, x=x))
                    elif o == "goto" and y:
                        # Conditional goto
                        f.write("\t#" + "goto {x} if {y}\n".format(l=l, r=r, x=x, y=y))
                    elif not y:
                        # Unary operation
                        f.write("\t#" + "{r} <- {o} {x}\n".format(
                            l=l,
                            r=r,
                            x=x,
                            o=o,
                        ))
                    else:
                        if o == '+':
                            f.write("\tlw $t1, {x}\n".format(x=x))
                            f.write("\tlw $t2, {y}\n".format(y=y))
                            f.write("\tadd $t0, $t1, $t2\n")
                            f.write("\tsw $t0, {r}\n".format(r=r))
                        elif o == '-':
                            f.write("\tlw $t1, {x}\n".format(x=x))
                            f.write("\tlw $t2, {y}\n".format(y=y))
                            f.write("\tsub $t0, $t1, $t2\n")
                            f.write("\tsw $t0, {r}\n".format(r=r))
                        elif o == '*':
                            f.write("\tlw $t1, {x}\n".format(x=x))
                            f.write("\tlw $t2, {y}\n".format(y=y))
                            f.write("\tmul $t0, $t1, $t2\n")
                            f.write("\tsw $t0, {r}\n".format(r=r))
                        elif o == '/':
                            f.write("\tlw $t1, {x}\n".format(x=x))
                            f.write("\tlw $t2, {y}\n".format(y=y))
                            f.write("\tdiv $t0, $t1, $t2\n")
                            f.write("\tsw $t0, {r}\n".format(r=r))
                        elif o == '==':
                            f.write("\tlw $t1, {x}\n".format(x=x))
                            f.write("\tlw $t2, {y}\n".format(y=y))
                            f.write("\tbeq $t1, $t2, {x}\n".format(x=x))
                            f.write("\tsw $t1, {r}\n".format(r=r))
                        elif o == '!=':
                            f.write("\tlw $t1, {x}\n".format(x=x))
                            f.write("\tlw $t2, {y}\n".format(y=y))
                            f.write("\tbne $t1, $t2, {x}\n".format(x=x))
                            f.write("\tsw $t1, {r}\n".format(r=r))
                        elif o == '>':
                            f.write("\tlw $t1, {x}\n".format(x=x))
                            f.write("\tlw $t2, {y}\n".format(y=y))
                            f.write("\tbgt $t1, $t2, {x}\n".format(x=x))
                            f.write("\tsw $t1, {r}\n".format(r=r))
                        elif o == '<':
                            f.write("\tlw $t1, {x}\n".format(x=x))
                            f.write("\tlw $t2, {y}\n".format(y=y))
                            f.write("\tblt $t1, $t2, {x}\n".format(x=x))
                            f.write("\tsw $t1, {r}\n".format(r=r))
                        elif o == '>=':
                            f.write("\tlw $t1, {x}\n".format(x=x))
                            f.write("\tlw $t2, {y}\n".format(y=y))
                            f.write("\tbge $t1, $t2, {x}\n".format(x=x))
                            f.write("\tsw $t1, {r}\n".format(r=r))
                        elif o == '<=':
                            f.write("\tlw $t1, {x}\n".format(x=x))
                            f.write("\tlw $t2, {y}\n".format(y=y))
                            f.write("\tble $t1, $t2, {x}\n".format(x=x))
                            f.write("\tsw $t1, {r}\n".format(r=r))
                        else:
                            f.write("\t#" + "{r} <- {x} {o} {y}\n".format(
                                l=l,
                                r=r,
                                x=x,
                                o=o,
                                y=y,
                            ))
                        # f.write("\tsw $t0, {r}\n".format(r=r))
                        # f.write("\n")
