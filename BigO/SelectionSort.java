
import java.util.*;
public class SelectionSort
{
  public static void main(String[] args){
       int[] cases = new int[3];
       System.out.println("Selection Sort\n");
       int [] tester = makeArray(10);
       System.out.println("Original: "+Arrays.toString(tester));
       System.out.println(selectionSorting(tester,true));
       
       System.out.println();
       
       tester = makeArray(10);
       System.out.println(selectionSorting(tester,false));
       
       System.out.println();
       
       System.out.println(selectionSortingReverse(tester,false));
       
       System.out.println();
       
       System.out.println(selectionSortingNTimes(10)); 
       int log = ((int) (Math.log(10) / Math.log(2)));
       System.out.println("nlog2n = "+10*log+"  n^2 = "+(10*10));
       
       System.out.println();
       
       System.out.println(selectionSortingNTimes(100)); 
       log = ((int) (Math.log(100) / Math.log(2)));
       System.out.println("nlog2n = "+100*log+"  n^2 = "+(100*100));
       
       System.out.println();
       
       System.out.println(selectionSortingNTimes(1000)); 
       log = ((int) (Math.log(1000) / Math.log(2)));
       System.out.println("nlog2n = "+1000*log+"  n^2 = "+(1000*1000));
    }
    
  public static int[] makeArray(int x){
      int [] array = new int[x]; 
      
      for(int i = 0; i< x; i++){
          array[i]= (int)(Math.random()*(x))+1;
        }
        return array; 
    }
    
  public static String selectionSorting(int[] arr, boolean statement){
     int counter = 0;        
       for (int x = 0; x < arr.length; x++){
      int smallest = arr[x];
      int index = x;
      for(int i = x+1; i<arr.length; i++){
         if(arr[i] < smallest){
          smallest = arr[i]; 
          index = i;
        }
        counter++;
        }
      int swap = arr[x]; 
      arr[x]= arr[index];
      arr[index] = swap;
       counter++;
    }
    if (statement)
     return "Comparisons: "+counter+"\nSorted: "+Arrays.toString(arr);
    else 
     return "Sorted: "+Arrays.toString(arr)+"\nComparisons: "+counter;
 }
 
 
 public static String selectionSortingReverse(int[] arr, boolean statement){
     int counter = 0;        
        for (int x = 0; x < arr.length; x++){
      int max = arr[x];
      int index = x;
      for(int i = x+1; i<arr.length; i++){
         if(arr[i] > max){
          max = arr[i]; 
          index = i;
          
        }
        counter++;
        }
      int swap = arr[x]; 
      arr[x]= arr[index];
      arr[index] = swap;
      counter++;
    }
    if (statement)
     return "Comparisons: "+counter+"\nSorted: "+Arrays.toString(arr);
    else 
     return "Sorted reverse: "+Arrays.toString(arr)+"\nComparisons: "+counter;
 }
 
 
 
 public static String selectionSortingNTimes( int amounts){
    
    double best = (amounts+1) * (amounts/2); 
    int worst = 0; 
   int average = 0;
    for (int y = 0; y< 10; y++){
       int counter = 0; 
       int[] arr = makeArray(amounts);
        for (int x = 0; x < arr.length; x++){
      int smallest = arr[x];
      int index = x;
      for(int i = x+1; i<arr.length; i++){
         if(arr[i] < smallest){
          smallest = arr[i]; 
          index = i;
        }
        counter++;
        }
      int swap = arr[x]; 
      arr[x]= arr[index];
      arr[index] = swap;
      counter++;
    }
    if(counter < best)
     best = counter;
    if (counter >worst)
     worst = counter; 
    average +=counter;
   }
 
   average = average/10; 
    return "\nSorting 10 list of n = "+amounts+"\nBest: "+(int)best+", average: "+average+", worst: "+worst;
 }
}
