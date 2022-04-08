import java.util.*;

public class PQTest
{
   private PriorityQueue<String> pq; 
   
   public PQTest(String x){
     pq = new PriorityQueue<String>(); 
     Scanner input = new Scanner(x);
     while (input.hasNext()){
         pq.add(input.next()); 
        }
       
    }
   
   public String getMin(){
        return pq.peek();
    }
   
   public String getNaturalOrder(){
      String ans= ""; 
      int num = pq.size();
      for (int i = 0; i< num; i++){
          ans = ans+" "+pq.remove(); 
        }
      return ans; 
    }
    
   public String toString(){
      return pq.toString(); 
    }
}
