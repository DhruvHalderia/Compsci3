import java.util.*;

public class PalinList
{
   private Stack<String> stack;
   private Queue<String> queue; 
   private String word;
   
   public PalinList(String x){
    stack = new Stack<String>(); 
    queue = new LinkedList<String>(); 
    Scanner input = new Scanner(x);
    Scanner inputTwo = new Scanner(x);
    while (input.hasNext()){
      stack.push(input.next());
      queue.add(inputTwo.next());
    }
    word = x; 
    }
    
   public Stack getStack(){
       return stack; 
    }
    
   public Queue getQueue(){
       return queue; 
    }
    
   public String toString(){
       
     for (int i = 0; i < stack.size(); i++){
      if(!(stack.pop().equals(queue.remove())))
        return "["+word+"] is not a palenlist";
     }  
     return "["+word+"] is a palenlist";
    }
}
