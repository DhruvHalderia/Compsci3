
import java.util.*; 

public class LinearSearch
{
    public static void main(String[] args){
     int[] cases = new int[3];   
     System.out.println("Linear Search\n");
     int[] tester = makeArray(10); 
     System.out.println("Original array is: "+Arrays.toString(tester)+"\nSearching for 10 random nums in a list of 10"); 
     cases = search(tester, 10); 
     System.out.println("Best: "+cases[0]+", Average: "+cases[1]+", Worst: "+cases[2]);
     
     tester = makeArray(100); 
     System.out.println("Original array is: "+Arrays.toString(tester)+"\nSearching for 10 random nums in a list of 100"); 
     cases = search(tester, 100); 
     System.out.println("Best: "+cases[0]+", Average: "+cases[1]+", Worst: "+cases[2]);
     
     tester = makeArray(1000); 
     System.out.println("Original array is: "+Arrays.toString(tester)+"\nSearching for 10 random nums in a list of 1000"); 
     cases = search(tester, 1000); 
     System.out.println("Best: "+cases[0]+", Average: "+cases[1]+", Worst: "+cases[2]);
     
    }
    
    
    public static int[] makeArray(int x){
      int [] array = new int[x]; 
      
      for(int i = 0; i< x; i++){
          array[i]= (int)(Math.random()*(x-1))+1;
        }
        return array; 
    }
    
    public static int[] search(int[] arr, int amounts){
       int best = amounts; 
       int worst = 0; 
       int average = 0;
       int[] allCases = new int[3];
       for (int i = 0; i < 10; i++){
        int num = (int)(Math.random()*(amounts-1))+1;
        int counter = 0;
        for( int t = 1; t <= amounts; t++){
            if(arr[t-1]==num){
              if(t<best){
                  best = t;
                }
              if (t>worst){
                  worst = t; 
                }
              average+=t;
              break;
            }
            else 
             counter++;
           
        }
        if(counter == 10){
          worst = amounts;
          average+=(amounts);
        }
        
        }
       allCases[0] = best; 
       allCases[1] = average/10; 
       allCases[2] = worst; 
       return allCases;
    }
}