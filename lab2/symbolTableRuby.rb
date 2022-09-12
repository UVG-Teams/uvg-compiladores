"""
Universidad del Valle de Guatemala
Compiladores

Autor: Francisco Rosal
"""

class Symbol

    # Este metodo instancia un objeto de tipo Symbol que se almacena en la tabla de simbolos
    def initialize(kind, id, class_type, line, column, value, scope, numParams, paramTypes)
        @kind = kind.to_s
        @id = id.to_s
        @class_type = class_type.to_s
        @line = line
        @column = column
        @value = value
        @scope = scope
        @numParams = numParams
        @paramTypes = paramTypes
    end

end

class SymbolTable

    # Este metodo instancia una tabla de simbolos que consiste en una lista de Symbol
    def initialize
        @records = []
    end

    # Este metodo es usado para agregar un registro a la tabla de simbolos
    def add(
        kind,
        id,
        class_type=nil,
        line=nil,
        column=nil,
        value=nil,
        scope=nil,
        is_array=false,
        numParams=nil,
        paramTypes=nil
    )
        unless is_array
            @records.append(
                Symbol(kind, id, class_type, line, column, value, scope, numParams, paramTypes)
            )
        end
    end

    # Este metodo busca un registro por tipo, id y el alcance que tiene.
    # Despues de encontrarlo se puede actualizar el registro en la tabla de simbolos
    def find(kind, id, scope=nil)
        @records.each do |symbol|
            if symbol.kind == kind.to_s && symbol.id == id.to_s
                return symbol unless scope
                return symbol if scope == symbol.scope
            end
        end
    end

end
