"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

class Symbol():

    def __init__(self, kind, id, line, column, value):
        self.kind = str(kind)
        self.id = str(id)
        self.line = line
        self.column = column
        self.value = value

    def toString(self):
        return "Id: {id}, Kind: {kind}, Line: {line}, Column: {column}, Value: {value}".format(
            kind=self.kind,
            id=self.id,
            line=self.line,
            column=self.column,
            value=self.value
        )


class SymbolTable():

    def __init__(self):
        self.records = []

    def add(self, kind, id, line=None, column=None, value=None, is_array=False):
        if not is_array:
            self.records.append(Symbol(kind, id, line, column, value))

    def find(self, kind, id):
        for symbol in self.records:
            if symbol.kind == str(kind) and symbol.id == str(id):
                return symbol
