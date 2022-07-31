import sys
from antlr4 import *
from dist.yaplLexer import yaplLexer
from dist.yaplParser import yaplParser
# from HtmlChatListener import HtmlChatListener

def main(argv):
    input = FileStream(argv[1])
    lexer = yaplLexer(input)
    stream = CommonTokenStream(lexer)
    parser = yaplParser(stream)
    # tree = parser.chat()

    # output = open("output.html","w", encoding='utf-8')
    
    # # htmlChat = HtmlChatListener(output)
    # walker = ParseTreeWalker()
    # walker.walk(htmlChat, tree)
        
    # output.close()      

if __name__ == '__main__':
    main(sys.argv)