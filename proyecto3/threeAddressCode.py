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
                    symbol = self.symbol_table.get_from_addr(r)

                    if symbol:
                        f.write("\t{r}: .word 0\n".format(r="_" + symbol.id))
                    else:
                        f.write("\t{r}: .word 0\n".format(r=r))
                elif t == "mv":
                    f.write("\t{r}: .word 0\n".format(r=r))

            # Writing code
            f.write("\n")
            f.write("\n.text\n.globl {id}\n{id}:\n".format(id="main"))
            indent = "\t"
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
                        # f.write("\n.text\n.globl {id}\n{id}:\n".format(id=symbol.id))
                        indent = "\t"
                    if t == "mv":
                        f.write(indent + "lw $t1, {x}\n".format(x=x))
                        f.write(indent + "sw $t1, {r}\n".format(r=r))

                    if o == "<-" and not y:
                        # Save value in memory
                        # f.write(indent + "#" + "{r} <- {x}\n".format(l=l, r=r, x=x))
                        f.write(indent + "#lw $t0, {x}\n".format(l=l, r=r, x=x))
                    elif o == "<-" and y:
                        f.write(indent + "#" + "{r} <- {y} @ {x}\n".format(l=l, r=r, x=x, y=y))
                    elif o == "call":
                        # Goto
                        # f.write(indent + "#" + "{r} <- call {x}, {y}\n".format(l=l, r=r, x=x, y=y))

                        temp_y = "_" + y.replace("_", "")

                        if x == 'out_int':
                            f.write("\n")
                            f.write(indent + "lw $a0, {y}\n".format(y=temp_y))
                            f.write(indent + "li $v0, 1\n")
                            f.write(indent + "syscall\n")
                        elif x == 'out_string':
                            f.write("\n")
                            f.write(indent + "la $a0, {y}\n".format(y=temp_y))
                            f.write(indent + "li $v0, 4\n")
                            f.write(indent + "syscall\n")
                    elif o == "goto" and not y:
                        # Goto
                        f.write(indent + "#" + "goto {x}\n".format(l=l, r=r, x=x))
                    elif o == "goto" and y:
                        # Conditional goto
                        f.write(indent + "#" + "goto {x} if {y}\n".format(l=l, r=r, x=x, y=y))
                    elif not y:
                        # Unary operation
                        f.write(indent + "#" + "{r} <- {o} {x}\n".format(
                            l=l,
                            r=r,
                            x=x,
                            o=o,
                        ))
                    else:
                        if o in ["+", "-", "*", "/", "==", "!=", ">", "<", ">=", "<="]:
                            f.write(indent + "lw $t1, {x}\n".format(x=x))
                            f.write(indent + "lw $t2, {y}\n".format(y=y))

                            if o == '+':
                                f.write(indent + "add $t0, $t1, $t2\n")
                            elif o == '-':
                                f.write(indent + "sub $t0, $t1, $t2\n")
                            elif o == '*':
                                f.write(indent + "mul $t0, $t1, $t2\n")
                            elif o == '/':
                                f.write(indent + "div $t0, $t1, $t2\n")
                            elif o == '==':
                                f.write(indent + "beq $t0, $t1, {x}\n".format(x=x))
                            elif o == '!=':
                                f.write(indent + "bne $t0, $t1, {x}\n".format(x=x))
                            elif o == '>':
                                f.write(indent + "bgt $t0, $t1, {x}\n".format(x=x))
                            elif o == '<':
                                f.write(indent + "blt $t0, $t1, {x}\n".format(x=x))
                            elif o == '>=':
                                f.write(indent + "bge $t0, $t1, {x}\n".format(x=x))
                            elif o == '<=':
                                f.write(indent + "ble $t0, $t1, {x}\n".format(x=x))

                            symbol = self.symbol_table.get_from_addr(r)

                            if symbol:
                                f.write(indent + "sw $t0, {r}\n".format(r="_" + symbol.id))
                            else:
                                f.write(indent + "sw $t0, {r}\n".format(r=r))
                        else:
                            f.write(indent + "#" + "{r} <- {x} {o} {y}\n".format(
                                l=l,
                                r=r,
                                x=x,
                                o=o,
                                y=y,
                            ))

                        # f.write(indent + "sw $t0, {r}\n".format(r=r))
                        # f.write("\n")
