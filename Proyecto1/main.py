"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

import sys
from tkinter import scrolledtext
from antlr4 import *
from build.yaplLexer import yaplLexer
from build.yaplParser import yaplParser
from yaplWalker import yaplWalker
from yaplErrorListener import yaplErrorListener

import tkinter as tk
from tkinter import *
from tkinter.ttk import *
from tkinter.filedialog import askopenfile 


def open_file():
    file_path = askopenfile(initialdir = "./input", mode='r', filetypes=[('YAPL Files', '*yapl'), ("all files", "*.*")])
    if file_path is not None:
        # pass
        filename_splited = file_path.name.split("/")
        filename_splited = filename_splited[len(filename_splited)-1]
        archivo1_ = "./" + filename_splited
        label_file_explorer.configure(text="./" + filename_splited)

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
    # window.geometry("1500x1000")
    # width= window.winfo_screenwidth()               
    # height= window.winfo_screenheight()               
    # window.geometry("%dx%d" % (width, height))
    window.state('zoomed') 
    # window.attributes('-fullscreen', True)

    adharbtn = Button(
        window, 
        text ='Choose File', 
        command = lambda:open_file()
    ) 
    label_file_explorer = tk.Label(window, text = " ", width = 20, height = 4, fg = "white")
    text_area_code = scrolledtext.ScrolledText(window, width = 203, height = 40, font = ("Times New Roman",15), foreground = "white")
    text_area_console = scrolledtext.ScrolledText(window, width = 100, height = 16, font = ("Times New Roman",15), foreground = "red")
    text_area_symbolT = scrolledtext.ScrolledText(window, width = 100, height = 16, font = ("Times New Roman",15), foreground = "blue")

    adharbtn.grid(row=0, column=0)
    label_file_explorer.grid(row=0, column=1)
    text_area_code.grid(column = 0, row = 1, columnspan=50, rowspan=100, padx=(12, 0))
    text_area_console.grid(column = 0, row = 160)
    text_area_symbolT.grid(column = 1, row = 160)

    main(sys.argv)
    window.mainloop()