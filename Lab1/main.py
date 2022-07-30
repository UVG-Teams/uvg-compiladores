import sys
from antlr4 import *
from build.yaplLexer import yaplLexer
from build.yaplParser import yaplParser
from yaplErrorListener import yaplErrorListener

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
    print(tree.toStringTree(parser.ruleNames))

    # walker = ParseTreeWalker()
    # walker.walk(htmlChat, tree)

if __name__ == '__main__':
    main(sys.argv)