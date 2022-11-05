"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

from antlr4 import *
from antlr4.error.ErrorListener import *

class yaplErrorListener(ErrorListener):

    def __init__(self) -> None:
        self.errors = []
        super().__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errors.append({
            "msg": msg,
            "line": line,
            "column": column
        })
