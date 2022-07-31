"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

class SymbolTable():

    def __init__(self):
        self.records = {}

    def add(self, name, type):
        self.records[name] = type
