"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

import sys
from antlr4 import *
from build.yaplLexer import yaplLexer
from build.yaplParser import yaplParser
from yaplWalker import yaplWalker
from yaplErrorListener import yaplErrorListener

import tkinter as tk
from tkinter import *
from tkinter.ttk import *


def main(argv):
    input = FileStream(argv[1])

    lexer = yaplLexer(input)
    lexer.removeErrorListeners()
    lexer.addErrorListener(yaplErrorListener())

    stream = CommonTokenStream(lexer)
    stream.fill()

    print("Tokens:")
    for token in stream.tokens:
        print(token)

    parser = yaplParser(stream)
    parser.removeErrorListeners()
    parser.addErrorListener(yaplErrorListener())

    tree = parser.prog()
    print("\nParse Tree:")
    # print(tree.toStringTree(parser.ruleNames))

    walker = yaplWalker()
    walker.initSymbolTable()
    walker.visit(tree)

    print("\nSymbol Table:")
    for record in walker.symbolTable.records:
        print("Symbol", record.toString())
        # print(record.id)

if __name__ == '__main__':
    window = tk.Tk()
    window.title('Analizador Semántico')
    window.geometry("1500x1000")
    window.attributes('-fullscreen', True)
    # print("\n width x height = %d x %d (in mm)\n" %(width, height))
    main(sys.argv)
    window.mainloop()