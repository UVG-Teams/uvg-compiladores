"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

class Symbol():

    def __init__(self, kind, id, line, column, value, numParams):
        self.kind = kind
        self.id = id
        self.line = line
        self.column = column
        self.value = value
        self.numParams = numParams

    def toString(self):
        return "Id: {id}, Kind: {kind}, Line: {line}, Column: {column}, Value: {value}, Number of Parameters: {numParams}".format(
            kind=self.kind,
            id=self.id,
            line=self.line,
            column=self.column,
            value=self.value,
            numParams=self.numParams
        )


class SymbolTable():

    def __init__(self):
        self.records = []

    def add(self, kind, id, line=None, column=None, value=None, is_array=False, numParams=None):
        if not is_array:
            self.records.append(Symbol(kind, id, line, column, value, numParams))
