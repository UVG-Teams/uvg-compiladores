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
        self.symbolTable.add("OBJECT_ID", ctx.OBJECT_ID())

        if len(ctx.TYPE_ID()) == 1:
            self.symbolTable.add("TYPE_ID", ctx.TYPE_ID()[0])

        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#formal.
    def visitFormal(self, ctx:yaplParser.FormalContext):
        self.symbolTable.add("OBJECT_ID", ctx.OBJECT_ID())

        if len(ctx.TYPE_ID()) == 1:
            self.symbolTable.add("TYPE_ID", ctx.TYPE_ID()[0])
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#expr.
    def visitExpr(self, ctx:yaplParser.ExprContext):
        if len(ctx.OBJECT_ID()) == 1:
            self.symbolTable.add("OBJECT_ID", ctx.OBJECT_ID()[0])

        if len(ctx.TYPE_ID()) == 1:
            self.symbolTable.add("TYPE_ID", ctx.TYPE_ID()[0])

        if ctx.IF():
            self.symbolTable.add("IF", ctx.IF())

        if ctx.THEN():
            self.symbolTable.add("THEN", ctx.THEN())

        if ctx.ELSE():
            self.symbolTable.add("ELSE", ctx.ELSE())

        if ctx.FI():
            self.symbolTable.add("FI", ctx.FI())

        if ctx.WHILE():
            self.symbolTable.add("WHILE", ctx.WHILE())

        if ctx.LOOP():
            self.symbolTable.add("LOOP", ctx.LOOP())

        if ctx.POOL():
            self.symbolTable.add("POOL", ctx.POOL())

        if ctx.LET():
            self.symbolTable.add("LET", ctx.LET())

        if ctx.IN():
            self.symbolTable.add("IN", ctx.IN())

        if ctx.NEW():
            self.symbolTable.add("NEW", ctx.NEW())

        if ctx.ISVOID():
            self.symbolTable.add("ISVOID", ctx.ISVOID())

        if ctx.NOT():
            self.symbolTable.add("NOT", ctx.NOT())

        if ctx.INT():
            self.symbolTable.add("INT", ctx.INT())

        if ctx.STRING():
            self.symbolTable.add("STRING", ctx.STRING())

        if ctx.TRUE():
            self.symbolTable.add("TRUE", ctx.TRUE())

        if ctx.FALSE():
            self.symbolTable.add("FALSE", ctx.FALSE())

        if ctx.SELF():
            self.symbolTable.add("SELF", ctx.SELF())

        return self.visitChildren(ctx)



del yaplParser