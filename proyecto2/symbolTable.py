"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

class Symbol():

    def __init__(
            self,
            id,
            class_type=None,
            line=None,
            column=None,
            value=None,
            scope=None,
            scope_type=None,
            inherits=None,
            numParams=None,
            paramTypes=None,
            size=None,
            max_size=None,
            address_id=None
        ):
        self.id = str(id)
        self.class_type = str(class_type)
        self.line = line
        self.column = column
        self.value = value
        self.scope = scope
        self.scope_type = scope_type
        self.inherits = str(inherits)
        self.numParams = numParams
        self.paramTypes = paramTypes
        self.size = size
        self.max_size = max_size
        self.address_id = address_id

    def keys(self):
        return ["id", "class_type", "line", "column", "value", "scope", "scope_type", "inherits", "numParams", "paramTypes", "size", "max_size", "address_id"]

    def values(self):
        return [self.id, self.class_type, self.line, self.column, self.value, self.scope, self.scope_type, self.inherits, self.numParams, self.paramTypes, self.size, self.max_size, self.address_id]


class SymbolTable():

    def __init__(self):
        self.records = []

    def add(
        self,
        id,
        class_type,
        line=None,
        column=None,
        value=None,
        scope=None,
        scope_type=None,
        inherits=None,
        is_array=False,
        numParams=None,
        paramTypes=None,
        size=None,
        max_size=None,
        address_id=None,
    ):
        if not is_array:

            if str(id) == "self":
                return False, "No es posible usar 'self' como identificador"

            # Default values
            if str(class_type) == "String" and not value:
                value = ""
            elif str(class_type) == "Int" and not value:
                value = 0
            elif str(class_type) == "Bool" and not value:
                value = False
            elif str(class_type) == "class" or str(class_type) == "SELF_TYPE":
                value = "void"
            else:
                if str(class_type) not in self.get_defined_classes():
                    return False, "Class type '{class_type}' no definido".format(class_type=str(class_type))
                value = "void"

            self.records.append(
                Symbol(
                    id,
                    class_type=class_type,
                    line=line,
                    column=column,
                    value=value,
                    scope=scope,
                    scope_type=scope_type,
                    inherits=inherits,
                    numParams=numParams,
                    paramTypes=paramTypes,
                    size=size,
                    max_size=max_size,
                    address_id=address_id,
                )
            )

            return True, None

    def find(self, id, class_type=None, scope=None, scope_type=None):
        for symbol in self.records:
            if symbol.id == str(id):

                if class_type and scope:
                    if symbol.class_type == str(class_type) and symbol.scope == scope and symbol.scope_type == scope_type:
                        return symbol
                elif class_type:
                    if symbol.class_type == str(class_type):
                        return symbol
                elif scope:
                    if symbol.scope == scope and symbol.scope_type == scope_type:
                        return symbol
                else:
                    return symbol

    def get_defined_classes(self):
        defined_classes = []
        for symbol in self.records:
            if symbol.class_type == "class":
                defined_classes.append(symbol.id)

        return defined_classes
