"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

class Terceto():

    def __init__(self, o=None, x=None, y=None, l=None):
        self.o = o
        self.x = x
        self.y = y
        self.l = l

    def keys(self):
        return ["l", "o", "x", "y"]

    def values(self):
        y = self.y if self.y != None else ""

        return [self.l, self.o, self.x, y]


class ThreeAddressCode():

    def __init__(self):
        self.tercetos = []

    def add(self, o=None, x=None, y=None, l=None):

        if type(o) not in [type(None), int, str]:
            o = str(o)

        if type(x) not in [type(None), int, str]:
            x = str(x)

        if type(y) not in [type(None), int, str]:
            y = str(y)

        if type(l) not in [type(None), int, str]:
            l = str(l)

        if not l:
            # Compiler Three Address Code Index
            l = "_{i}".format(i=len(self.tercetos))

        terceto = Terceto(o, x, y, l)
        self.tercetos.append(terceto)

        return l

    def generate_code(self):
        with open("output/code.tac", "w") as f:
            for terceto in self.tercetos:
                l = terceto.l
                o = terceto.o
                x = terceto.x
                y = terceto.y

                if o == "<-" and not y:
                    # Save value in memory
                    f.write("{l} := {x}\n".format(l=l, x=x))
                elif o == "<-" and y:
                    f.write("{l} := {x} <- {y}\n".format(l=l, x=x, y=y))
                elif o == "goto" and not y:
                    # Goto
                    f.write("{l} := goto {x}\n".format(l=l, x=x))
                elif o == "goto" and y:
                    # Conditional goto
                    f.write("{l} := goto {x} if {y}\n".format(l=l, x=x, y=y))
                elif not y:
                    # Unary operation
                    f.write("{l} := {o} {x}\n".format(
                        l=l,
                        x=x,
                        o=o,
                    ))
                else:
                    f.write("{l} := {x} {o} {y}\n".format(
                        l=l,
                        x=x,
                        o=o,
                        y=y,
                    ))
