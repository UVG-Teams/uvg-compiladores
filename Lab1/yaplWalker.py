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

    def initSymbolTable(self):
        self.symbolTable = SymbolTable()

    # Visit a parse tree produced by yaplParser#prog.
    def visitProg(self, ctx:yaplParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#class_def.
    def visitClass_def(self, ctx:yaplParser.Class_defContext):
        self.symbolTable.add("CLASS", ctx.CLASS())

        if len(ctx.TYPE_ID()) == 1:
            self.symbolTable.add("TYPE_ID", ctx.TYPE_ID()[0])

        # print(ctx.INHERITS())

        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#feature.
    def visitFeature(self, ctx:yaplParser.FeatureContext):
        if len(ctx.TYPE_ID()) == 1:
            self.symbolTable.add("TYPE_ID", ctx.TYPE_ID()[0])

        self.symbolTable.add("OBJECT_ID", ctx.OBJECT_ID())

        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#formal.
    def visitFormal(self, ctx:yaplParser.FormalContext):
        # print(ctx.OBJECT_ID())
        # print(ctx.TYPE_ID())
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#expr.
    def visitExpr(self, ctx:yaplParser.ExprContext):
        # if len(ctx.TYPE_ID()) == 1:
        #     print(ctx.TYPE_ID()[0])
        return self.visitChildren(ctx)



del yaplParser