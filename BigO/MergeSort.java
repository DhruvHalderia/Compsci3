
import java.util.*;
public class MergeSort
{
   private int[] finalArray;
   private int[] firstArray;
   private int finalCount,average,best,worst; 
   public MergeSort(int x ){
       finalArray= new int[x];
       finalCount = 0; 
       firstArray = new int[x];
       average = 0; 
       best = -1; 
       worst = 0; 
    }
   public void makeArray(int x){
      int [] array = new int[x]; 
      
      for(int i = 0; i< x; i++){
          array[i]= (int)(Math.random()*(x))+1;
        }
       firstArray = array ; 
    }
    public int[] getFirstArray(){
        return firstArray;
    }
    
    public  void setArr(int[]arr){
        finalArray = arr; 
        
    }
    public  void setCounter(int counter){
        finalCount+=counter;
        
    }
    public String mergeNTimes(int amount){
      best = -1;
        for (int i = 0; i<10; i++){
       makeArray(amount); 
       finalCount = 0;
       mergeSort(firstArray,0, firstArray.length-1,false); 
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
   public int[] mergeSort(int[] arr, int start, int end, boolean reverse){
       if (start == end){
         return arr;
    }
       int[] result = new int[arr.length];
       int mid = (start + end)/2;
       mergeSort(arr, start, mid,reverse);
       mergeSort(arr, mid+1, end, reverse); 
       result = merge(arr, start,mid,end, reverse);
       setArr(result);
       return result;
       
    }
    
   public int[] merge(int[] arr, int start, int mid, int end,boolean reverse){
       int[] left = new int[mid-start+1];
       int [] right = new int[end-mid]; 
       
       for(int i = start; i <= mid; i++)
            left[i-start] = arr[i];
       for(int i = mid+1; i <= end; i++)
            right[i-mid-1] = arr[i];
       int leftSpot = 0;
       int rightSpot = 0;
       int spot = start;
       
       while(leftSpot < left.length && rightSpot < right.length){
           if(reverse){
              if(left[leftSpot] > right[rightSpot]){
                arr[spot] = left[leftSpot];
                leftSpot++;
                spot++;
            }
            else{
                arr[spot] = right[rightSpot];
                rightSpot++;
                spot++;
            } 
               
            }
           else{
            if(left[leftSpot] < right[rightSpot]){
                arr[spot] = left[leftSpot];
                leftSpot++;
                spot++;
            }
            else{
                arr[spot] = right[rightSpot];
                rightSpot++;
                spot++;
            }
        }
             setCounter(1);
        }
        
        while(leftSpot < left.length){
            arr[spot] = left[leftSpot];
            leftSpot++;
            spot++;
            
        }
        
        while(rightSpot < right.length){
            arr[spot] = right[rightSpot];
            rightSpot++;
            spot++;
            
        }
       
        return arr;
    }
    
    public String getOutputReverse(){
        return "Reverse: "+Arrays.toString(finalArray)+"\nComparisons: "+finalCount; 
    }
    
    public String getOutput(boolean statement){
        if (statement)
         return "Comparisons: "+finalCount+"\nSorted: "+Arrays.toString(finalArray);
        else 
        return "Sorted: "+Arrays.toString(finalArray)+"\nComparisons: "+finalCount; 
    }
    
}
