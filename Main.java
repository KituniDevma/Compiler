
import java.io.IOException;

import Scanner.Scanner;
import Scanner.Token;
import Parser.Parser;
import Parser.AST;
import Parser.ParseException;




public class Main {
    public static String fileName;
    // call the scanner
    public static void main(String[] args) {


        fileName = "input.txt";
        AST ast = null;

        
        if (true) {
            if (fileName.isEmpty())
              throw new ParseException("Input a relavant file.");
            ast = buildAST(fileName, true);
            printAST(ast);           
          }

        
            
       
    }

    private static AST buildAST(String fileName, boolean printOutput) {
        AST ast = null;
        try {
          Scanner scanner = new Scanner(fileName);
          Parser parser = new Parser(scanner);
          ast = parser.buildAST();
        } catch (IOException e) {
          throw new ParseException("ERROR: Could not read from file: " + fileName);
        }
        return ast;
      }
    
      private static void printAST(AST ast) {
        ast.print();
      }
    
}  
        
        
    

