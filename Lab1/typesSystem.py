"""
Universidad del Valle de Guatemala
Compiladores

Autores:
Gian Luca Rivera
Francisco Rosal
"""

from yaplWalker import yaplWalker

def checkInferenceRule():
    for i in yaplWalker.getSymbolTable().records:
        print(i.toString())

checkInferenceRule()