
import java.util.Stack;

public class postFix
{
  private Stack<Double> stack; 
  private String original, lookFor, lookForOp; 
  
  public postFix(String x){
    original = x;  
    stack = new Stack<Double>(); 
    lookFor  = "0123456789";
    lookForOp = "+-/*";
    }
    
  public String getOriginal(){
     return original; 
    }
  
  public Stack getStack(){
      return stack; 
    }
  
  public void setOriginal(String x){
    original = x;
    }
    
  public double getCalculations(){ 
      for (int i =0; i<original.length(); i++){
      if (lookFor.indexOf(original.substring(i,i+1))>=0){
       stack.push(Double.parseDouble(original.substring(i,i+1)));
       }
      else if (lookForOp.indexOf(original.substring(i,i+1))>=0){
        if (original.substring(i,i+1).equals("+"))
         stack.push(stack.pop()+stack.pop());
        else if (original.substring(i,i+1).equals("-")){
        double num1 = stack.pop();
        double num2 = stack.pop();
        stack.push(num2-num1);
        }
        else if (original.substring(i,i+1).equals("/")){
        double num1 = stack.pop();
        double num2 = stack.pop();
        stack.push(num2/num1);         
         }
        else if (original.substring(i,i+1).equals("*"))
         stack.push(stack.pop()*stack.pop());
        }
    }
      return stack.pop();
   }
}
