"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

from antlr4 import *
from symbolTable import SymbolTable
from build.yaplParser import yaplParser
from build.yaplVisitor import yaplVisitor

# This class defines a custom visitor for a parse tree.

class yaplWalker(yaplVisitor):

    def __init__(self) -> None:
        self.basic_types = ["Int", "String", "Bool"]
        self.errors = []
        self.main_class_count = 0
        self.main_method_count = 0
        super().__init__()

    def initSymbolTable(self):
        self.symbolTable = SymbolTable()

    def getSymbolTable(self):
        return  self.symbolTable

    # Visit a parse tree produced by yaplParser#prog.
    def visitProg(self, ctx:yaplParser.ProgContext):

        for node in ctx.class_def():
            child_ctx = self.visit(node)

            # Checking Main Class errors
            if str(child_ctx.TYPE_ID()[0]) == "Main":
                self.main_class_count += 1
                if len(child_ctx.TYPE_ID()) > 1:
                    self.errors.append({
                        "msg": "Clase Main no debe heredar de ninguna",
                        "payload": child_ctx.TYPE_ID()[1].getPayload()
                    })

                for feat_node in child_ctx.feature():
                    feat_child_ctx = self.visit(feat_node)

                    if str(feat_child_ctx.OBJECT_ID()) == "main":
                        self.main_method_count += 1

                        if len(feat_child_ctx.formal()) > 0:
                            self.errors.append({
                                "msg": "Metodo main no debe tener parametros formales",
                                "payload": feat_child_ctx.OBJECT_ID().getPayload()
                            })

        if self.main_class_count != 1:
            self.errors.append({
                "msg": "Solo una clase Main debe existir",
                "payload": child_ctx.TYPE_ID()[0].getPayload()
            })

        if self.main_method_count != 1:
            self.errors.append({
                "msg": "Solo un metodo main en la clase Main debe existir",
                "payload": feat_child_ctx.OBJECT_ID().getPayload()
            })

        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#class_def.
    def visitClass_def(self, ctx:yaplParser.Class_defContext):
        self.symbolTable.add("CLASS", ctx.CLASS(), line=ctx.CLASS().getPayload().line, column=ctx.CLASS().getPayload().column)

        if len(ctx.TYPE_ID()) == 1:
            class_name = ctx.TYPE_ID()[0]
            self.symbolTable.add("TYPE_ID", class_name, line=class_name.getPayload().line, column=class_name.getPayload().column)

        # Class inheritance validations
        if ctx.INHERITS():
            # Inherit from a basic type is not possible
            if str(ctx.TYPE_ID()[1]) in self.basic_types:
                self.errors.append({
                    "msg": "No se puede heredar de un tipo basico",
                    "payload": ctx.TYPE_ID()[1].getPayload()
                })

            # Recursive inheritance is not possible
            if str(ctx.TYPE_ID()[0]) == str(ctx.TYPE_ID()[1]):
                self.errors.append({
                    "msg": "No se puede heredar recursivamente",
                    "payload": ctx.TYPE_ID()[1].getPayload()
                })

            # Multiple inheritance is not possible
            if len(ctx.TYPE_ID()) >= 3 and ctx.TYPE_ID()[2]:
                self.errors.append({
                    "msg": "No se puede tener multiple herencia",
                    "payload": ctx.TYPE_ID()[2].getPayload()
                })


        self.visitChildren(ctx)
        return ctx


    # Visit a parse tree produced by yaplParser#feature.
    def visitFeature(self, ctx:yaplParser.FeatureContext):
        self.symbolTable.add("OBJECT_ID", ctx.OBJECT_ID(), line=ctx.OBJECT_ID().getPayload().line, column=ctx.OBJECT_ID().getPayload().column, numParams=len(ctx.formal()))

        paramTypes = []
        for formal_node in ctx.formal():
            formal_child_ctx = self.visit(formal_node)

            print("---", formal_child_ctx.TYPE_ID()[0])
            paramTypes.append(str(formal_child_ctx.TYPE_ID()[0]))


        if len(ctx.TYPE_ID()) == 1:
            self.symbolTable.add("TYPE_ID", ctx.TYPE_ID()[0], line=ctx.TYPE_ID()[0].getPayload().line, column=ctx.TYPE_ID()[0].getPayload().column, typeParams=paramTypes)

        self.visitChildren(ctx)
        return ctx


    # Visit a parse tree produced by yaplParser#formal.
    def visitFormal(self, ctx:yaplParser.FormalContext):
        self.symbolTable.add("OBJECT_ID", ctx.OBJECT_ID(), line=ctx.OBJECT_ID().getPayload().line, column=ctx.OBJECT_ID().getPayload().column)

        if len(ctx.TYPE_ID()) == 1:
            self.symbolTable.add("TYPE_ID", ctx.TYPE_ID()[0], line=ctx.TYPE_ID()[0].getPayload().line, column=ctx.TYPE_ID()[0].getPayload().column)
        self.visitChildren(ctx)
        return ctx 


    # Visit a parse tree produced by yaplParser#expr.
    def visitExpr(self, ctx:yaplParser.ExprContext):
        if len(ctx.OBJECT_ID()) == 1:
            self.symbolTable.add("OBJECT_ID", ctx.OBJECT_ID()[0], line=ctx.OBJECT_ID()[0].getPayload().line, column=ctx.OBJECT_ID()[0].getPayload().column)

        if len(ctx.TYPE_ID()) == 1:
            self.symbolTable.add("TYPE_ID", ctx.TYPE_ID()[0], line=ctx.TYPE_ID()[0].getPayload().line, column=ctx.TYPE_ID()[0].getPayload().column)

        if ctx.IF():
            self.symbolTable.add("IF", ctx.IF(), line=ctx.IF().getPayload().line, column=ctx.IF().getPayload().column)

        if ctx.THEN():
            self.symbolTable.add("THEN", ctx.THEN(), line=ctx.THEN().getPayload().line, column=ctx.THEN().getPayload().column)

        if ctx.ELSE():
            self.symbolTable.add("ELSE", ctx.ELSE(), line=ctx.ELSE().getPayload().line, column=ctx.ELSE().getPayload().column)

        if ctx.FI():
            self.symbolTable.add("FI", ctx.FI(), line=ctx.FI().getPayload().line, column=ctx.FI().getPayload().column)

        if ctx.WHILE():
            self.symbolTable.add("WHILE", ctx.WHILE(), line=ctx.WHILE().getPayload().line, column=ctx.WHILE().getPayload().column)

        if ctx.LOOP():
            self.symbolTable.add("LOOP", ctx.LOOP(), line=ctx.LOOP().getPayload().line, column=ctx.LOOP().getPayload().column)

        if ctx.POOL():
            self.symbolTable.add("POOL", ctx.POOL(), line=ctx.POOL().getPayload().line, column=ctx.POOL().getPayload().column)

        if ctx.LET():
            self.symbolTable.add("LET", ctx.LET(), line=ctx.LET().getPayload().line, column=ctx.LET().getPayload().column)

        if ctx.IN():
            self.symbolTable.add("IN", ctx.IN(), line=ctx.IN().getPayload().line, column=ctx.IN().getPayload().column)

        if ctx.NEW():
            self.symbolTable.add("NEW", ctx.NEW(), line=ctx.NEW().getPayload().line, column=ctx.NEW().getPayload().column)

        if ctx.ISVOID():
            self.symbolTable.add("ISVOID", ctx.ISVOID(), line=ctx.ISVOID().getPayload().line, column=ctx.ISVOID().getPayload().column)

        if ctx.NOT():
            self.symbolTable.add("NOT", ctx.NOT(), line=ctx.NOT().getPayload().line, column=ctx.NOT().getPayload().column)

        if ctx.INT():
            self.symbolTable.add("INT", ctx.INT(), line=ctx.INT().getPayload().line, column=ctx.INT().getPayload().column)

        if ctx.STRING():
            self.symbolTable.add("STRING", ctx.STRING(), line=ctx.STRING().getPayload().line, column=ctx.STRING().getPayload().column)

        if ctx.TRUE():
            self.symbolTable.add("TRUE", ctx.TRUE(), line=ctx.TRUE().getPayload().line, column=ctx.TRUE().getPayload().column)

        if ctx.FALSE():
            self.symbolTable.add("FALSE", ctx.FALSE(), line=ctx.FALSE().getPayload().line, column=ctx.FALSE().getPayload().column)

        if ctx.SELF():
            self.symbolTable.add("SELF", ctx.SELF(), line=ctx.SELF().getPayload().line, column=ctx.SELF().getPayload().column)

        return self.visitChildren(ctx)



del yaplParser