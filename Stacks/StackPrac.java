
import java.util.Stack; 
import java.util.Scanner;

public class StackPrac
{
 public static void main(String args[]){
     Stack<String> stack = new Stack<String>(); 
     //a b c d e f g h i
     Scanner input = new Scanner("a b c d e f g h i"); 
     while (input.hasNext()){
         stack.push(input.next()); 
        }
     
     
//      stack.push("apple");
//      stack.push("bannana");
//      stack.push("cantalope");
//      
//      System.out.println(stack.peek());
//      
//      System.out.println(stack);
//      
//      System.out.println(stack.pop()); 
//      
//      System.out.println(stack.peek());
        System.out.println(stack); 
   }
}
