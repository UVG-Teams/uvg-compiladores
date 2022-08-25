"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

class Symbol():

    def __init__(self, kind, id, line, column, value, numParams, typeParams):
        self.kind = str(kind)
        self.id = str(id)
        self.line = line
        self.column = column
        self.value = value
        self.numParams = numParams
        self.typeParams = typeParams

    def toString(self):
        return "Id: {id}, Kind: {kind}, Line: {line}, Column: {column}, Value: {value}, Number of Parameters: {numParams}, Type of Parameters: {typeParams}".format(
            kind = self.kind,
            id = self.id,
            line = self.line,
            column = self.column,
            value = self.value,
            numParams = self.numParams,
            typeParams = self.typeParams
        )


class SymbolTable():

    def __init__(self):
        self.records = []

    def add(self, kind, id, line=None, column=None, value=None, is_array=False, numParams=None, typeParams=None):
        if not is_array:
            self.records.append(Symbol(kind, id, line, column, value, numParams, typeParams))

    def find(self, kind, id):
        for symbol in self.records:
            if symbol.kind == str(kind) and symbol.id == str(id):
                return symbol
