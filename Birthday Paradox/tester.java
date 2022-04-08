

public class tester
{
  public static void main(String[] args){
      
    double prob = 1.0;
    double num = 364.0; 
    for( int i = 0; i < 23-1; i++){
         prob *= num/365.0; 
         num--; 
        }
       
      System.out.println("The theoretical probability of a match is: "+(1.0-(Math.round(prob*10000.0)/10000.0)));
    }
}
