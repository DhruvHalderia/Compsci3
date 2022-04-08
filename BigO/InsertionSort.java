
import java.util.*;
public class InsertionSort
{
    public static void main(String[] args){
       System.out.println("Insertion Sort: \n\n");
       int [] tester = makeArray(10);
       System.out.println("Original: "+Arrays.toString(tester));
       System.out.println(insertionSorting(tester,true,false)); 
       
       System.out.println(); 
       
       tester = makeArray(10);
       System.out.println(insertionSorting(tester,false,false));
       
       System.out.println(); 
       
       System.out.println(insertionSorting(tester,false,true));
       
       System.out.println();
       
       System.out.println(insertionSortingNTimes(10));
       double log = ( (Math.log(10) / Math.log(2)));
       System.out.println("nlog2n = "+(int)(10*log)+"  n^2 = "+(10*10));
       
       System.out.println();
       
       System.out.println(insertionSortingNTimes(100));
       log = ((Math.log(100) / Math.log(2)));
       System.out.println("nlog2n = "+(int)(100*log)+"  n^2 = "+(100*100));
       
       System.out.println();
       
       System.out.println(insertionSortingNTimes(1000)); 
       log = ((Math.log(1000) / Math.log(2)));
       System.out.println("nlog2n = "+(int)(1000*log)+"  n^2 = "+(1000*1000));
    }
    
    public static int[] makeArray(int x){
      int [] array = new int[x]; 
      
      for(int i = 0; i< x; i++){
          array[i]= (int)(Math.random()*(x))+1;
        }
        return array; 
    }
    
    public static String insertionSortingNTimes(int amounts){
      int best = -1 ;
      int worst = 0; 
      int average = 0;  
      
      for (int y = 0; y <10; y++){
         int counter = 0; 
         int[] arr = makeArray(amounts); 
         int num = 0; 
         for(int i = 1; i< arr.length; i++){
         num = i;
         while(num>0){
            
          if(arr[num]<arr[num-1]){
             int temp = arr[num-1];
             arr[num-1] = arr[num]; 
             arr[num] = temp; 
             counter++;
            } 
          num--;
        }
        
        }
        if (best == -1)
         best = counter;
        else if (counter <best)
         best = counter; 
        if (counter > worst)
         worst = counter;
        average += counter; 
        }
       average /=10;
      return "\nSorting 10 list of n = "+amounts+"\nBest: "+best+", average: "+average+", worst: "+worst;
    }
    
    
    public static String insertionSorting(int[] arr, boolean statement, boolean reverse){
       int comparisons = 0; 
        int num = 0; 
        for(int i = 1; i< arr.length; i++){
         num = i;
         while(num>0){
            if(reverse == false){
             if(arr[num]<arr[num-1]){
             int temp = arr[num-1];
             arr[num-1] = arr[num]; 
             arr[num] = temp; 
             comparisons++;
            } 
          }
          else{
              if(arr[num]>arr[num-1]){
             int temp = arr[num-1];
             arr[num-1] = arr[num]; 
             arr[num] = temp; 
             comparisons++;
            } 
            }
           
           num--;
        }
        
       }
       if (statement)
        return "comparisons: "+comparisons+"\nsorted: "+Arrays.toString(arr); 
       else{
         if (reverse)  
          return "reverse: "+Arrays.toString(arr)+"\ncomparisons: "+comparisons;
         return "sorted: "+Arrays.toString(arr)+"\ncomparisons: "+comparisons;
    }
    }
    
    
     
    }

