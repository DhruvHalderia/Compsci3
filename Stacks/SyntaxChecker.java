
import java.util.Stack;

public class SyntaxChecker
{
   private Stack<String> stack ; 
   private String words, open, close, symbols, symbolsTwo; 
   
   public SyntaxChecker(String x){
     words = x; 
     stack = new Stack<String>();
     open = "{(<[";
     close = "})>]";
     symbols = "";
     symbolsTwo = "";
    }
   
   public String getWords(){
    return words;
    }
    
   public String getStackValue(){
    return stack.peek(); 
    }
   
   public void setWords(String x){
     words = x;
    }
   
   public void addInStack(String x){
    stack.push(x);
    }
   
   public void removeFromStack(){
    stack.pop();  
    }
   
   public void setSymbols(){
    symbols = ""; 
    symbolsTwo = "";
      for (int i = 0; i < words.length();i++){ 
     if(open.indexOf(words.substring(i,i+1))>= 0) {
        symbols = symbols+words.substring(i,i+1);  
        } 
     else if (close.indexOf(words.substring(i,i+1))>=0){  
        symbols = symbols+words.substring(i,i+1);
        symbolsTwo = symbolsTwo+words.substring(i,i+1);
        }
    }
    }
    
   public boolean getSyntax(){
     int num =  (symbols.length()/2);
     for (int i = 0; i <symbols.length(); i++){
       if (open.indexOf(symbols.substring(i,i+1))>=0){
           stack.push(symbols.substring(i,i+1)); 
        }
       else if (symbolsTwo.length()> num)
         return false;
        else if ((open.indexOf(stack.pop())!= close.indexOf(symbols.substring(i,i+1)))){
         return false;
        } 
        }
     if(stack.empty()) 
      return true; 
     else 
     return false;
    }
    
   
}
