"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

import sys
import ctypes
from antlr4 import *
from symbolTable import SymbolTable
from threeAddressCode import ThreeAddressCode
from build.yaplParser import yaplParser
from build.yaplVisitor import yaplVisitor

# This class defines a custom visitor for a parse tree.

BOOL_MAX_SIZE = 28
MAX_SIZE = 9123456789012345678
MAX_SIZE = 1234567890

class yaplWalker(yaplVisitor):

    def __init__(self) -> None:
        self.basic_types = ["Int", "String", "Bool"]
        self.errors = []
        self.main_class_count = 0
        self.main_method_count = 0
        self.current_class = None
        self.current_method = None
        super().__init__()

    def initSymbolTable(self):
        self.symbolTable = SymbolTable()

    def getSymbolTable(self):
        return  self.symbolTable

    def init3AddressCode(self):
        # Three Address Code
        self.tac = ThreeAddressCode()

    def getTAC(self):
        return  self.tac

    def add_to_symbol_table(
        self,
        id,
        data_type,
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
        success, msg = self.symbolTable.add(
            id,
            data_type,
            line=line,
            column=column,
            value=value,
            scope=scope,
            scope_type=scope_type,
            inherits=inherits,
            is_array=is_array,
            numParams=numParams,
            paramTypes=paramTypes,
            size=size,
            max_size=max_size,
            address_id=address_id,
        )

        if not success and msg:
            self.errors.append({
                "msg": msg,
            })

    def find_or_create_type_id(self, ctx):
        if not ctx.TYPE_ID():
            return

        symbol = self.symbolTable.find(ctx.TYPE_ID())

        if not symbol:
            self.errors.append({
                "msg": "Undefined: {id}".format(id=ctx.TYPE_ID()),
                "payload": ctx.TYPE_ID().getPayload()
            })

            self.add_to_symbol_table(
                ctx.TYPE_ID(),
                line=ctx.TYPE_ID().getPayload().line,
                column=ctx.TYPE_ID().getPayload().column
            )

    def find_or_create_object_id(self, ctx):
        if not ctx.OBJECT_ID():
            return

        symbol = self.symbolTable.find(ctx.OBJECT_ID())

        if not symbol:
            self.errors.append({
                "msg": "Undefined: {id}".format(id=ctx.OBJECT_ID()),
                "payload": ctx.OBJECT_ID().getPayload()
            })

            self.add_to_symbol_table(
                ctx.OBJECT_ID(),
                line=ctx.OBJECT_ID().getPayload().line,
                column=ctx.OBJECT_ID().getPayload().column
            )

    # Visit a parse tree produced by yaplParser#prog.
    def visitProg(self, ctx:yaplParser.ProgContext):

        # Defining Object
        self.add_to_symbol_table(
            "Object",
            data_type="class",
        )

        self.add_to_symbol_table(
            "abort",
            data_type="Object",
            numParams=0,
            paramTypes=[],
            scope="Object",
            scope_type="global",
        )

        self.add_to_symbol_table(
            "type_name",
            data_type="String",
            numParams=0,
            paramTypes=[],
            scope="Object",
            scope_type="global",
        )

        self.add_to_symbol_table(
            "copy",
            data_type="SELF_TYPE",
            numParams=0,
            paramTypes=[],
            scope="Object",
            scope_type="global",
        )

        # Defining Int
        self.add_to_symbol_table(
            "Int",
            data_type="class",
            inherits="Object",
        )

        # Defining Bool
        self.add_to_symbol_table(
            "Bool",
            data_type="class",
            inherits="Object",
        )

        # Defining String
        self.add_to_symbol_table(
            "String",
            data_type="class",
            inherits="Object",
        )

        self.add_to_symbol_table(
            "concat",
            data_type="String",
            numParams=1,
            paramTypes=["String"],
            scope="String",
            scope_type="global",
        )

        self.add_to_symbol_table(
            "substr",
            data_type="String",
            numParams=2,
            paramTypes=["Int", "Int"],
            scope="String",
            scope_type="global",
        )

        self.add_to_symbol_table(
            "length",
            data_type="Int",
            numParams=0,
            paramTypes=[],
            scope="String",
            scope_type="global",
        )

        # Defining IO
        self.add_to_symbol_table(
            "IO",
            data_type="class",
            inherits="Object",
        )

        self.add_to_symbol_table(
            "in_string",
            data_type="String",
            numParams=0,
            paramTypes=[],
            scope="IO",
            scope_type="global",
        )

        self.add_to_symbol_table(
            "out_string",
            data_type="SELF_TYPE",
            numParams=1,
            paramTypes=["String"],
            scope="IO",
            scope_type="global",
        )

        self.add_to_symbol_table(
            "in_int",
            data_type="Int",
            numParams=0,
            paramTypes=[],
            scope="IO",
            scope_type="global",
        )

        self.add_to_symbol_table(
            "out_int",
            data_type="SELF_TYPE",
            numParams=1,
            paramTypes=["Int"],
            scope="IO",
            scope_type="global",
        )

        self.visitChildren(ctx)

        # Checking the amount of Main classes
        if self.main_class_count != 1:
            self.errors.append({
                "msg": "Solo una clase Main debe existir",
                # "payload": ctx.TYPE_ID(0).getPayload()
            })

        # Checking the amount of main methods
        if self.main_method_count != 1:
            self.errors.append({
                "msg": "Solo un metodo main en la clase Main debe existir",
                # "payload": feat_child_ctx.OBJECT_ID().getPayload()
            })

        return ctx


    # Visit a parse tree produced by yaplParser#class_def.
    def visitClass_def(self, ctx:yaplParser.Class_defContext):

        self.current_class = str(ctx.TYPE_ID(0))

        # Checking Main Class errors
        if self.current_class == "Main":
            self.main_class_count += 1
            if len(ctx.TYPE_ID()) > 1:
                self.errors.append({
                    "msg": "Clase Main no debe heredar de ninguna",
                    "payload": ctx.TYPE_ID(1).getPayload()
                })

        # Class inheritance validations
        valide_inheritance = True
        if ctx.INHERITS():
            # Inherit from a basic type is not possible
            if str(ctx.TYPE_ID(1)) in self.basic_types:
                valide_inheritance = False
                self.errors.append({
                    "msg": "No se puede heredar de un tipo basico",
                    "payload": ctx.TYPE_ID(1).getPayload()
                })

            # Recursive inheritance is not possible
            if self.current_class == str(ctx.TYPE_ID(1)):
                valide_inheritance = False
                self.errors.append({
                    "msg": "No se puede heredar recursivamente",
                    "payload": ctx.TYPE_ID(1).getPayload()
                })

            # Multiple inheritance is not possible
            if len(ctx.TYPE_ID()) >= 3 and ctx.TYPE_ID(2):
                valide_inheritance = False
                self.errors.append({
                    "msg": "No se puede tener multiple herencia",
                    "payload": ctx.TYPE_ID(2).getPayload()
                })

        if ctx.INHERITS() and valide_inheritance:
            self.add_to_symbol_table(
                self.current_class,
                data_type=ctx.CLASS(),
                inherits=ctx.TYPE_ID(1),
                line=ctx.CLASS().getPayload().line,
                column=ctx.CLASS().getPayload().column
            )
        else:
            self.add_to_symbol_table(
                self.current_class,
                data_type=ctx.CLASS(),
                inherits="Object",
                line=ctx.CLASS().getPayload().line,
                column=ctx.CLASS().getPayload().column
            )

        self.visitChildren(ctx)
        return ctx


    # Visit a parse tree produced by yaplParser#feat_def.
    def visitFeat_def(self, ctx:yaplParser.Feat_defContext):
        self.current_method = str(ctx.OBJECT_ID())

        # Checking the amount of main methods
        if str(ctx.OBJECT_ID()) == "main":
            self.main_method_count += 1

            if len(ctx.formal()) > 0:
                self.errors.append({
                    "msg": "Metodo main no debe tener parametros formales",
                    "payload": ctx.OBJECT_ID().getPayload()
                })

        symbol = self.symbolTable.find(
            ctx.OBJECT_ID(),
            data_type=ctx.TYPE_ID(),
            scope="{class_scope}".format(class_scope=self.current_class),
            scope_type="global"
        )

        if symbol:
            self.errors.append({
                "msg": "Solo puede existir un metodo con el mismo nombre en la misma clase",
                "payload": ctx.OBJECT_ID().getPayload()
            })
        else:
            self.add_to_symbol_table(
                ctx.OBJECT_ID(),
                data_type=ctx.TYPE_ID(),
                line=ctx.OBJECT_ID().getPayload().line,
                column=ctx.OBJECT_ID().getPayload().column,
                numParams=len(ctx.formal()),
                paramTypes=[],
                scope="{class_scope}".format(class_scope=self.current_class),
                scope_type="global",
            )

        self.visitChildren(ctx)
        return ctx


    # Visit a parse tree produced by yaplParser#feat_asgn.
    def visitFeat_asgn(self, ctx:yaplParser.Feat_asgnContext):

        symbol = self.symbolTable.find(
            ctx.OBJECT_ID(),
            data_type=ctx.TYPE_ID(),
            scope="{class_scope}".format(class_scope=self.current_class),
            scope_type="local"
        )

        if symbol:
            self.errors.append({
                "msg": "Solo puede existir una variable con el mismo nombre en la misma clase",
                "payload": ctx.OBJECT_ID().getPayload()
            })
        else:
            self.add_to_symbol_table(
                ctx.OBJECT_ID(),
                data_type=ctx.TYPE_ID(),
                line=ctx.OBJECT_ID().getPayload().line,
                column=ctx.OBJECT_ID().getPayload().column,
                scope="{class_scope}".format(class_scope=self.current_class),
                scope_type="local",
            )

        self.visitChildren(ctx)
        return ctx


    # Visit a parse tree produced by yaplParser#formal.
    def visitFormal(self, ctx:yaplParser.FormalContext):
        global_scope = "{class_scope}".format(class_scope=self.current_class)
        scope = "{method_scope}".format(method_scope=self.current_method)

        # Adding the current formal to the feature which belongs
        feature_symbol = self.symbolTable.find(
            self.current_method,
            scope=global_scope,
            scope_type="global"
        )

        # Appending params to the current feature
        if feature_symbol:
            feature_symbol.paramTypes.append(str(ctx.TYPE_ID()))

        # Checking if already exists this formal on the current_scope
        symbol = self.symbolTable.find(
            ctx.OBJECT_ID(),
            data_type=ctx.TYPE_ID(),
            scope=scope,
            scope_type="local"
        )

        if symbol:
            self.errors.append({
                "msg": "{id} already exists".format(id=ctx.OBJECT_ID()),
                "payload": ctx.OBJECT_ID().getPayload()
            })

        self.add_to_symbol_table(
            ctx.OBJECT_ID(),
            data_type=ctx.TYPE_ID(),
            line=ctx.OBJECT_ID().getPayload().line,
            column=ctx.OBJECT_ID().getPayload().column,
            scope=scope,
            scope_type="local",
        )

        self.visitChildren(ctx)
        return ctx


    # Visit a parse tree produced by yaplParser#asgn.
    def visitAsgn(self, ctx:yaplParser.AsgnContext):
        # self.visitChildren(ctx)
        return ctx


    # ========================================================================================
    # Expressions
    # ========================================================================================


    # Visit a parse tree produced by yaplParser#expr_asgn.
    def visitExpr_asgn(self, ctx:yaplParser.Expr_asgnContext):
        ref = self.tac.add(
            o = "<-",
            x = ctx.OBJECT_ID(),
            y = self.visit(ctx.expr()),
        )

        # self.find_or_create_object_id(ctx)
        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_class_call.
    def visitExpr_class_call(self, ctx:yaplParser.Expr_class_callContext):
        # self.find_or_create_type_id(ctx)
        # self.find_or_create_object_id(ctx)
        self.visitChildren(ctx)
        return ctx


    # Visit a parse tree produced by yaplParser#expr_call.
    def visitExpr_call(self, ctx:yaplParser.Expr_callContext):
        # TODO: Check if the method exists
        # TODO: Check if the method has the same amount of params
        # TODO: Check if the method has the same types of params
        # TODO: Check if the method has the same return type
        # TODO: Check if the method has the same scope
        # TODO: Check if the method has the same scope_type
        # TODO: Check if the method belongs to the same class
        ref = self.tac.add(
            o = "call",
            x = ctx.OBJECT_ID(),
            # y = self.visit(ctx.expr()),
        )

        # self.find_or_create_object_id(ctx)
        self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_if.
    def visitExpr_if(self, ctx:yaplParser.Expr_ifContext):
        condition_ref = self.visit(ctx.expr(0))

        condition_not_ref = self.tac.add(
            o = "not",
            x = condition_ref,
        )

        ref = self.tac.add(
            o = "goto",
            x = self.visit(ctx.expr(1)), # then
            y = condition_ref, # condition
        )

        self.tac.add(
            o = "goto",
            x = self.visit(ctx.expr(2)), # else
            y = condition_not_ref, # condition
        )

        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_while.
    def visitExpr_while(self, ctx:yaplParser.Expr_whileContext):
        self.visitChildren(ctx)
        return ctx


    # Visit a parse tree produced by yaplParser#expr_brackets.
    def visitExpr_brackets(self, ctx:yaplParser.Expr_bracketsContext):
        self.visitChildren(ctx)
        return ctx


    # Visit a parse tree produced by yaplParser#expr_decl.
    def visitExpr_decl(self, ctx:yaplParser.Expr_declContext):
        ref = self.tac.add(
            o = ctx.LET(),
            x = self.visit(ctx.expr()),
        )

        for node in ctx.asgn():
            asgn_ctx = self.visit(node)

            value = None
            if asgn_ctx.expr():
                value = self.visit(asgn_ctx.expr())

            self.tac.add(
                o = "<-",
                x = asgn_ctx.OBJECT_ID(),
                y = value,
            )

            self.add_to_symbol_table(
                asgn_ctx.OBJECT_ID(),
                data_type=asgn_ctx.TYPE_ID(),
                line=asgn_ctx.OBJECT_ID().getPayload().line,
                column=asgn_ctx.OBJECT_ID().getPayload().column,
                scope="{method_scope}".format(method_scope=self.current_method),
                scope_type="local",
            )

        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_instance.
    def visitExpr_instance(self, ctx:yaplParser.Expr_instanceContext):
        ref = self.tac.add(
            o = ctx.NEW(),
            x = ctx.TYPE_ID(),
        )

        # self.find_or_create_type_id(ctx)
        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_isvoid.
    def visitExpr_isvoid(self, ctx:yaplParser.Expr_isvoidContext):
        ref = self.tac.add(
            o = ctx.ISVOID(),
            x = self.visit(ctx.expr()),
        )

        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_suma.
    def visitExpr_suma(self, ctx:yaplParser.Expr_sumaContext):
        symbol = ctx.PLUS() if ctx.PLUS() else ctx.MINUS()

        ref = self.tac.add(
            o = symbol,
            x = self.visit(ctx.expr(0)),
            y = self.visit(ctx.expr(1)),
        )

        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_mult.
    def visitExpr_mult(self, ctx:yaplParser.Expr_multContext):
        symbol = ctx.MULT() if ctx.MULT() else ctx.DIV()

        ref = self.tac.add(
            o = symbol,
            x = self.visit(ctx.expr(0)),
            y = self.visit(ctx.expr(1)),
        )

        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_negative.
    def visitExpr_negative(self, ctx:yaplParser.Expr_negativeContext):
        ref = self.tac.add(
            o = "-",
            x = self.visit(ctx.expr()),
        )

        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_negado.
    def visitExpr_negado(self, ctx:yaplParser.Expr_negadoContext):
        ref = self.tac.add(
            o = "~",
            x = self.visit(ctx.expr()),
        )

        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_less_than.
    def visitExpr_less_than(self, ctx:yaplParser.Expr_less_thanContext):
        symbol = ctx.LT() if ctx.LT() else ctx.LE()

        ref = self.tac.add(
            o = symbol,
            x = self.visit(ctx.expr(0)),
            y = self.visit(ctx.expr(1)),
        )

        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_equal.
    def visitExpr_equal(self, ctx:yaplParser.Expr_equalContext):
        ref = self.tac.add(
            o = "=",
            x = self.visit(ctx.expr(0)),
            y = self.visit(ctx.expr(1)),
        )

        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_not.
    def visitExpr_not(self, ctx:yaplParser.Expr_notContext):
        ref = self.tac.add(
            o = ctx.NOT().getText(),
            x = self.visit(ctx.expr())
        )

        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_parenthesis.
    def visitExpr_parenthesis(self, ctx:yaplParser.Expr_parenthesisContext):
        ref = self.tac.add(
            o = "<-",
            x = self.visit(ctx.expr())
        )

        # self.visitChildren(ctx)
        return ref


    # Visit a parse tree produced by yaplParser#expr_id.
    def visitExpr_id(self, ctx:yaplParser.Expr_idContext):
        # self.find_or_create_type_id(ctx)
        # self.find_or_create_object_id(ctx)

        id = None
        if ctx.TYPE_ID():
            id = ctx.TYPE_ID().getText()
        elif ctx.OBJECT_ID():
            id = ctx.OBJECT_ID().getText()

        # ref = self.tac.add(o="=", x=id)
        # self.visitChildren(ctx)
        # return ref
        return id


    # Visit a parse tree produced by yaplParser#expr_int.
    def visitExpr_int(self, ctx:yaplParser.Expr_intContext):
        # ref = self.tac.add(
        #     o = "<-",
        #     x = ctx.INT().getText(),
        # )
        # x = 14
        # print(id(x))
        # print(hex(id(x)))
        # print(ctypes.string_at(id(x), sys.getsizeof(x)))

        # self.add_to_symbol_table(
        #     ctx.INT(),
        #     data_type="Int",
        #     line=ctx.INT().getPayload().line,
        #     column=ctx.INT().getPayload().column,
        #     size=sys.getsizeof(int(ctx.INT().getText())),
        #     max_size=MAX_SIZE,
        #     address_id=id(int(ctx.INT().getText()))
        # )
        # self.visitChildren(ctx)
        return ctx.INT().getText()


    # Visit a parse tree produced by yaplParser#expr_str.
    def visitExpr_str(self, ctx:yaplParser.Expr_strContext):
        # ref = self.tac.add(
        #     o = "<-",
        #     x = ctx.STRING().getText(),
        # )
        # self.add_to_symbol_table(
        #     ctx.STRING(),
        #     data_type="String",
        #     line=ctx.STRING().getPayload().line,
        #     column=ctx.STRING().getPayload().column,
        #     size=sys.getsizeof(str(ctx.STRING().getText())),
        #     max_size=MAX_SIZE,
        #     address_id=id(str(ctx.STRING().getText()))
        # )
        # self.visitChildren(ctx)
        return ctx.STRING().getText()


    # Visit a parse tree produced by yaplParser#expr_true.
    def visitExpr_true(self, ctx:yaplParser.Expr_trueContext):
        # ref = self.tac.add(
        #     o = "<-",
        #     x = ctx.TRUE().getText(),
        # )
        # self.add_to_symbol_table(
        #     ctx.TRUE(),
        #     data_type="Bool",
        #     line=ctx.TRUE().getPayload().line,
        #     column=ctx.TRUE().getPayload().column,
        #     size=sys.getsizeof(bool(ctx.TRUE().getText())),
        #     max_size=BOOL_MAX_SIZE,
        #     address_id=id(bool(ctx.TRUE().getText()))
        # )
        # self.visitChildren(ctx)
        return "true"


    # Visit a parse tree produced by yaplParser#expr_false.
    def visitExpr_false(self, ctx:yaplParser.Expr_falseContext):
        # ref = self.tac.add(
        #     o = "<-",
        #     x = ctx.FALSE().getText(),
        # )
        # self.add_to_symbol_table(
        #     ctx.FALSE(),
        #     data_type="Bool",
        #     line=ctx.FALSE().getPayload().line,
        #     column=ctx.FALSE().getPayload().column,
        #     size=sys.getsizeof(bool(ctx.FALSE().getText())),
        #     max_size=BOOL_MAX_SIZE,
        #     address_id=id(bool(ctx.FALSE().getText()))
        # )
        # self.visitChildren(ctx)
        return "false"


    # Visit a parse tree produced by yaplParser#expr_self.
    def visitExpr_self(self, ctx:yaplParser.Expr_selfContext):
        # self.visitChildren(ctx)
        return "self"


del yaplParser
