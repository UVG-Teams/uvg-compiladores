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

        content = file_path.read()
        text_area_code.insert(tk.INSERT, "\n")
        text_area_code.insert(tk.INSERT, content, "\n")


def run():
    with open('input/temp.yapl', 'w') as f:
        fetched_content = text_area_code.get('1.0', 'end-1c')
        f.write(fetched_content)
    run_main.set(True)
    text_area_console.insert(tk.INSERT, "Running ...", "\n")

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
        text_area_symbolT.insert(tk.INSERT, "\n")
        text_area_symbolT.insert(tk.INSERT, record.toString())
        # print(record.id)


    if len(walker.errors) >= 1:
        print("\n" + yaplErrorListener.ANSI_RED)
        print("----------------------------- ERROR -----------------------------")
        for error in walker.errors:
            print("Error: position " + str(error["payload"].line) + ":" + str(error["payload"].column) + " " + error["msg"])
            text_area_console.insert(tk.INSERT, "\n")
            text_area_console.insert(tk.INSERT, "Error: position " + str(error["payload"].line) + ":" + str(error["payload"].column) + " " + error["msg"], 'error')
            text_area_console.tag_config('error', foreground="red")
        print("-----------------------------------------------------------------")
        print("\n" + yaplErrorListener.ANSI_RESET)

if __name__ == '__main__':
    window = tk.Tk()
    window.title('Analizador Semántico')
    window.state('zoomed') 
    

    run_main = BooleanVar()

    # Definition of UI elements
    adharbtn = Button(
        window, 
        text ='Choose File', 
        command = lambda:open_file()
    )
    runbtn = Button(
        window, 
        text ='Run', 
        command = run
    )
    label_file_explorer = tk.Label(window, text = " ", width = 20, height = 4, fg = "white")
    text_area_code = scrolledtext.ScrolledText(window, width = 204, height = 40, font = ("Times New Roman",15), foreground = "white")
    text_area_console = scrolledtext.ScrolledText(window, width = 101, height = 16, font = ("Times New Roman",15), foreground = "green")
    text_area_symbolT = scrolledtext.ScrolledText(window, width = 99, height = 16, font = ("Times New Roman",15), foreground = "skyblue")

    # Add elements to UI
    adharbtn.grid(row=0, column=0)
    label_file_explorer.grid(row=0, column=1)
    runbtn.grid(row=0, column=19, columnspan=2)
    text_area_code.grid(column=0, row=1, columnspan=20, rowspan=100, padx=(12, 0))
    text_area_console.grid(column=0, row=166, columnspan=10)
    text_area_symbolT.grid(column=10, row=166, columnspan=10)

    runbtn.wait_variable(run_main)
    main(sys.argv)
    text_area_console.insert(tk.INSERT, "\nCool")
    window.mainloop()
