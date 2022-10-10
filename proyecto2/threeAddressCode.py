"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

class Terceto():

    def __init__(self, o=None, x=None, y=None):
        self.o = o
        self.x = x
        self.y = y

    def keys(self):
        return ["o", "x", "y"]

    def values(self):
        return [self.o, self.x, self.y]

class Cuarteto():

    def __init__(self, o=None, x=None, y=None, r=None):
        self.o = o
        self.x = x
        self.y = y
        self.r = r

    def keys(self):
        return ["o", "x", "y", "r"]

    def values(self):
        return [self.o, self.x, self.y, self.r]


class ThreeAddressCode():

    def __init__(self):
        self.tercetos = []
        self.cuartetos = []

    def add(self, o=None, x=None, y=None, r=None):

        if type(o) not in [type(None), int, str]:
            o = str(o)

        if type(x) not in [type(None), int, str]:
            x = str(x)

        if type(y) not in [type(None), int, str]:
            y = str(y)

        if type(r) not in [type(None), int, str]:
            r = str(r)

        terceto = Terceto(o, x, y)
        self.tercetos.append(terceto)

        if not r:
            # ctaci - Compiler Three Address Code Index
            r = "ctaci{i}".format(i=self.tercetos.index(terceto))

        cuarteto = Cuarteto(o, x, y, r)
        self.cuartetos.append(cuarteto)

        return r
