"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

import sys
import os
from antlr4 import *
from build.yaplLexer import yaplLexer
from build.yaplParser import yaplParser
from yaplWalker import yaplWalker
from yaplErrorListener import yaplErrorListener

import tkinter as tk
from tkinter import *
from tkinter.ttk import *
from tkinter.filedialog import askopenfile
from prettytable import PrettyTable

input = ""
# Class that writes line number in text widget
class LineNumbers(tk.Text):
    def __init__(self, master, text_widget, **kwargs):
        super().__init__(master, **kwargs)
 
        self.text_widget = text_widget
        self.text_widget.bind('<KeyPress>', self.on_key_press)
 
        self.insert(1.0, '1')
        self.configure(state='disabled')
 
    def on_key_press(self, event=None):
        final_index = str(self.text_widget.index(tk.END))
        num_of_lines = final_index.split('.')[0]
        line_numbers_string = "\n".join(str(no + 1) for no in range(int(num_of_lines)))
        width = len(str(num_of_lines))
        
        self.configure(state='normal', width=width+1 if int(num_of_lines) < 10 else width)
        self.delete(1.0, tk.END)
        self.insert(1.0, line_numbers_string)
        self.configure(state='disabled')


def open_file():
    file_path = askopenfile(initialdir = "./input", mode='r', filetypes=[('YAPL Files', '*yapl'), ("all files", "*.*")])
    if file_path is not None:
        # pass
        filename_splited = file_path.name.split("/")
        filename_splited = filename_splited[len(filename_splited)-1]
        hola = filename_splited[len(filename_splited)-2]
        archivo1_ = "input/" + filename_splited
        label_file_explorer.configure(text="./" + filename_splited)

        content = file_path.read()
        text_area_code.insert(tk.INSERT, content, "\n")
        runbtn.config(state="normal")

def run():
    with open('input/temp.yapl', 'w') as f:
        fetched_content = text_area_code.get('1.0', 'end-1c')
        f.write(fetched_content)
    run_main.set(True)
    text_area_console.insert(tk.INSERT, "Running ...", "\n")

def clear():
    python = sys.executable
    os.execl(python, python, * sys.argv)

def main():
    # input = FileStream(argv[1])
    input = FileStream('input/temp.yapl')

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

    cont = 0
    print("\nSymbol Table:")
    # myTable = PrettyTable()
    for record in walker.symbolTable.records:
        cont = cont + 1
        print("Symbol", record.toString())
        # myTable.field_names = ["Id", "Kind", "Line", "Column", "Value"]
        # myTable.add_row([record.id, record.kind, record.line, record.column, record.value])
        # print(myTable)
        print("AAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHH ", record.id)
        if cont == 1:
            text_area_symbolT.insert(tk.INSERT, record.toString())
        else:
            text_area_symbolT.insert(tk.INSERT, "\n")
            text_area_symbolT.insert(tk.INSERT, record.toString())
        print(record.id)
    
    # print(myTable)


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
        state="disabled",
        command = run
    )
    clearbtn = Button(
        window, 
        text ='Clear', 
        command = clear
    )
    label_file_explorer = tk.Label(window, text = " ", width = 20, height = 4, fg = "white")
    # text_area_code = scrolledtext.ScrolledText(window, width = 204, height = 40, font = ("Times New Roman",15), foreground = "white")
    text_area_code = tk.Text(window, width=202, height=38, font=("Times New Roman", 15), foreground="white", highlightthickness=0)
    text_area_console = tk.Text(window, width=102, height=16, font=("Times New Roman", 15), foreground="green", highlightthickness=0)
    text_area_symbolT = tk.Text(window, width=99, height=16, font=("Times New Roman", 15), foreground="skyblue", highlightthickness=0)
    l = LineNumbers(window, text_area_code, width=2, height=38, font=("Times New Roman", 15), foreground="gray", highlightthickness=0)

    # Add elements to UI
    adharbtn.grid(row=0, column=0, padx=(0, 200))
    label_file_explorer.grid(row=0, column=1)
    runbtn.grid(row=0, column=18, )
    clearbtn.grid(row=0, column=19, columnspan=2)
    text_area_code.grid(column=0, row=1, columnspan=20, rowspan=100, padx=(35, 0))
    l.grid(column=0, row=1, padx=(0, 300))
    text_area_console.grid(column=0, row=166, columnspan=10, pady=(20,0), padx=(0,4))
    text_area_symbolT.grid(column=10, row=166, columnspan=10, pady=(20,0))

    runbtn.wait_variable(run_main)
    main()
    text_area_console.insert(tk.INSERT, "\nCool")
    window.mainloop()

