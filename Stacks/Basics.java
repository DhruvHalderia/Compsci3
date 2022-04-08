import java.util.Stack;
import java.util.Scanner; 

public class Basics
{
   public static void main(String args[]){
      Stack<String> stack = new Stack<String>();
      int num = 0; 
      Scanner input = new Scanner("a b c d e f g h i"); 
     while (input.hasNext()){
         stack.push(input.next());
         num++;
        }
     System.out.println(stack+"\n\nPopping all items from the stack" );
     for (int i = 0; i<num; i++){
        System.out.print(stack.pop()+" ") ;   
        }
     
     num = 0; 
     System.out.println("\n");
     input = new Scanner("1 2 3 4 5 6 7 8 9 10");
     while (input.hasNext()){
         stack.push(input.next());
         num++;
        }
     System.out.println(stack+"\n\nPopping all items from the stack" );
     for (int i = 0; i<num; i++){
        System.out.print(stack.pop()+" ") ;   
        }
     
     num = 0; 
     System.out.println("\n");
     input = new Scanner("# $ % ^ * ( ) ) _");
     while (input.hasNext()){
         stack.push(input.next());
         num++;
        }
     System.out.println(stack+"\n\nPopping all items from the stack" );
     for (int i = 0; i<num; i++){
        System.out.print(stack.pop()+" ") ;   
        }
    }
    
}
