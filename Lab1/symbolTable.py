"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

class Symbol():

    def __init__(self, kind, id, line, column, scope, value):
        self.kind = kind
        self.id = id
        self.line = line
        self.column = column
        self.scope = scope
        self.value = value

    def toString(self):
        return "Kind: {kind}, Id: {id}, Line: {line}, Column: {column}, Scope: {scope}, Value: {value}".format(
            kind=self.kind,
            id=self.id,
            line=self.line,
            column=self.column,
            scope=self.scope,
            value=self.value
        )


class SymbolTable():

    def __init__(self):
        self.records = []

    def add(self, kind, id, line=None, column=None, scope=None, value=None, is_array=False):
        if not is_array:
            self.records.append(Symbol(kind, id, line, column, scope, value))
