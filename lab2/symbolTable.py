"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

class Symbol():

    def __init__(self, kind, id, class_type, line, column, value, scope, numParams, paramTypes, size):
        self.kind = str(kind)
        self.id = str(id)
        self.class_type = str(class_type)
        self.line = line
        self.column = column
        self.value = value
        self.scope = scope
        self.numParams = numParams
        self.paramTypes = paramTypes
        self.size = size

    def keys(self):
        return ["kind", "id", "class_type", "line", "column", "value", "scope", "numParams", "paramTypes", "size"]

    def values(self):
        return [self.kind, self.id, self.class_type, self.line, self.column, self.value, self.scope, self.numParams, self.paramTypes, self.size]

    def toString(self):
        return "Id: {id}, Kind: {kind}, Line: {line}, ClassType: {class_type}, Column: {column}, Value: {value}, Scope: {scope}, Number of Parameters: {numParams}, Type of Parameters: {paramTypes}, Size: {size}".format(
            kind = self.kind,
            id = self.id,
            class_type = self.class_type,
            line = self.line,
            column = self.column,
            value = self.value,
            scope = self.scope,
            numParams = self.numParams,
            paramTypes = self.paramTypes,
            size = self.size,
        )


class SymbolTable():

    def __init__(self):
        self.records = []

    def add(
        self,
        kind,
        id,
        class_type=None,
        line=None,
        column=None,
        value=None,
        scope=None,
        is_array=False,
        numParams=None,
        paramTypes=None,
        size=None,
    ):
        if not is_array:

            # if class_type == "Int" and not value:
            #     value = 0

            self.records.append(
                Symbol(
                    kind,
                    id,
                    class_type,
                    line,
                    column,
                    value,
                    scope,
                    numParams,
                    paramTypes,
                    size,
                )
            )

    def find(self, kind, id, scope=None):
        for symbol in self.records:
            if symbol.kind == str(kind) and symbol.id == str(id):
                if scope:
                    if symbol.scope == scope:
                        return symbol
                else:
                    return symbol
