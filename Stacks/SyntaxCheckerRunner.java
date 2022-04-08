 

public class SyntaxCheckerRunner
{
    public static void main(String args[]){
     SyntaxChecker entry = new SyntaxChecker("(abc(*def)");
     entry.setSymbols(); 
     if (entry.getSyntax())
      System.out.println(entry.getWords()+" is correct\n"); 
     else 
      System.out.println(entry.getWords()+" is incorrect\n");
     
     entry = new SyntaxChecker("[{}]");
     entry.setSymbols(); 
     if (entry.getSyntax())
      System.out.println(entry.getWords()+" is correct\n"); 
     else 
      System.out.println(entry.getWords()+" is incorrect\n");
     
     entry = new SyntaxChecker("[");
     entry.setSymbols(); 
     if (entry.getSyntax())
      System.out.println(entry.getWords()+" is correct\n"); 
     else 
      System.out.println(entry.getWords()+" is incorrect\n");
      
     entry = new SyntaxChecker("[{<()>}]");
     entry.setSymbols(); 
     if (entry.getSyntax())
      System.out.println(entry.getWords()+" is correct\n"); 
     else 
      System.out.println(entry.getWords()+" is incorrect\n"); 
      
     entry = new SyntaxChecker("{&lt;html[value=4]*(12)&gt;{$x}}");
     entry.setSymbols(); 
     if (entry.getSyntax())
      System.out.println(entry.getWords()+" is correct\n"); 
     else 
      System.out.println(entry.getWords()+" is incorrect\n");
      
     entry = new SyntaxChecker("[one]&lt;two&gt;{three}(four)");
     entry.setSymbols(); 
     if (entry.getSyntax())
      System.out.println(entry.getWords()+" is correct\n"); 
     else 
      System.out.println(entry.getWords()+" is incorrect\n");
      
     entry = new SyntaxChecker("car(cdr(a)(b)))");
     entry.setSymbols(); 
     if (entry.getSyntax())
      System.out.println(entry.getWords()+" is correct\n"); 
     else 
      System.out.println(entry.getWords()+" is incorrect\n");
     
     entry = new SyntaxChecker("car(cdr(a)(b))");
     entry.setSymbols(); 
     if (entry.getSyntax())
      System.out.println(entry.getWords()+" is correct\n"); 
     else 
      System.out.println(entry.getWords()+" is incorrect\n");
    }
}
