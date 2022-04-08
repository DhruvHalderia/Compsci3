
import java.util.*; 
public class QuickSort
{
  private int[] firstArr, finalArr; 
  private int best, worst, average,finalCount; 
   
  public QuickSort(int x){
     firstArr = new int[x];  
     finalCount = 0;
     average = 0; 
     best = -1; 
     worst = 0; 
     }
    
  public void makeArray(int x){
      int [] array = new int[x]; 
      
      for(int i = 0; i< x; i++){
          array[i]= (int)(Math.random()*(x))+1;
        }
      firstArr = array ; 
     }
     
  public int[] getFirstArr(){
        return firstArr;
    }
    
  public  void setArr(int[]arr){
        finalArr = arr; 
    }
    
  public  void setCounter(int counter){
        finalCount+=counter; 
    }
  public String quickNTimes(int amount){
      best = -1;
        for (int i = 0; i<10; i++){
       makeArray(amount); 
       finalCount = 0;
       quickSort(firstArr,0, firstArr.length-1,false); 
       if(best == -1)
        best = finalCount; 
       else if(finalCount<best){
           best = finalCount;
        }
       if(finalCount>worst)
        worst = finalCount;
       average+=finalCount;
       
      }
      average/=10;
      return "Best: "+best+" Average: "+average+" Worst: "+worst;
        
    }
    
  public void quickSort(int[] arr, int start, int end, boolean reverse){
     if (start >= end)
      return; 
     int part = partition(arr, start, end, reverse);
     quickSort(arr,start,part-1, reverse);
     quickSort(arr,part+1,end, reverse);
    }
    
  public int partition(int[] arr, int start, int end, boolean reverse){
    int pivot = arr[end]; 
    int i = start -1; 
    int[] returnStuff = new int[2];
    for (int j = start;  j<end; j++){
      if(reverse){
      if( arr[j] > pivot){
          i++; 
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;     
        } 
     } 
     else {
      if( arr[j] < pivot){
          i++; 
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;     
        }   
     }
     setCounter(1);
       }
    int temp = arr[i+1]; 
    arr[i+1] = arr[end]; 
    arr[end] = temp;
    finalArr = arr;
    return i+1; 
    
    }
    
  public String getOutputReverse(){
        return "Reverse: "+Arrays.toString(finalArr)+"\nComparisons: "+finalCount; 
    }
    
  public String getOutput(boolean statement){
        if (statement)
         return "Comparisons: "+finalCount+"\nSorted: "+Arrays.toString(finalArr);
        else 
        return "Sorted: "+Arrays.toString(finalArr)+"\nComparisons: "+finalCount; 
    }
}
