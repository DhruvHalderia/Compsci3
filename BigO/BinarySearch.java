
import java.util.*;
public class BinarySearch
{
    public static void main(String[] args){
     int[] cases = new int[3];
     System.out.println("Binary Search\n"); 
     int [] tester = makeArray(10);
     System.out.println("Original array is: "+Arrays.toString(tester)+"\nSearching for 10 random numbers in a list of 10"); 
     cases = searches(tester, 10);
     System.out.println("Best: "+cases[0]+", Average: "+cases[1]+", Worst: "+cases[2]);
     
     tester = makeArray(100);
     System.out.println("\nOriginal array is: "+Arrays.toString(tester)+"\nSearching for 100 random numbers in a list of 10"); 
     cases = searches(tester, 100);
     System.out.println("Best: "+cases[0]+", Average: "+cases[1]+", Worst: "+cases[2]);
     
     tester = makeArray(1000);
     System.out.println("\nOriginal array is: "+Arrays.toString(tester)+"\nSearching for 1000 random numbers in a list of 10"); 
     cases = searches(tester, 1000);
     System.out.println("Best: "+cases[0]+", Average: "+cases[1]+", Worst: "+cases[2]);
     
     tester = makeArray(10000);
     System.out.println("\nSearching for 10 random numbers in a list of 10,000"); 
     cases = searches(tester, 10000);
     System.out.println("Best: "+cases[0]+", Average: "+cases[1]+", Worst: "+cases[2]);
     
     tester = makeArray(100000);
     System.out.println("\nSearching for 10 random numbers in a list of 100,000"); 
     cases = searches(tester, 100000);
     System.out.println("Best: "+cases[0]+", Average: "+cases[1]+", Worst: "+cases[2]);
     
     tester = makeArray(1000000);
     System.out.println("\nSearching for 10 random numbers in a list of 1,000,000"); 
     cases = searches(tester, 1000000);
     System.out.println("Best: "+cases[0]+", Average: "+cases[1]+", Worst: "+cases[2]);
    }
    
    public static int[] makeArray(int x){
      int [] array = new int[x]; 
      for(int i = 0; i< x; i++){
          array[i]= (int)(Math.random()*(x-1))+1;
        }
        Arrays.sort(array); 
        return array; 
    }
    
    public static int[] searches(int[] arr, int amounts){
        int best = amounts; 
        int worst = 0;
        int average = 0; 
        for(int i = 0; i<10; i++){
          int randomNum = (int)(Math.random()*(amounts-1))+1;
          int output = binarySearch(arr,randomNum,0,amounts,1, amounts/2);
          if (output < best)
           best = output; 
          if (output > worst)
            worst = output;
          average+=output;
        }
        int[] allCases = new int[3];
        allCases[0] = best;
        allCases[1] =average/10;
        allCases[2] = worst;
        
        return allCases;
    }
    
    public static int binarySearch(int [] arr, int target, int start, int end, int counter,int max){
    
    int  midIndex = (start + end) / 2;
    
    if (start > end)
     return counter;
    else if(end == start)
     return counter;
    
    if(target == arr[midIndex])
     return counter;
     
    else if(target < arr[midIndex])
     return binarySearch(arr,target,start,midIndex-1,counter+1, max);
     
      else 
       return binarySearch(arr, target, midIndex+1,end,counter+1,max);
       
  }
}
