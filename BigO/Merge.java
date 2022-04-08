
import java.util.Arrays;

public class Merge
{
    public static void main(String[] args){
        
        int[] nums = {9,5,2,8,4};
        System.out.println(Arrays.toString(nums)+"\n");
        mergeSort(nums, 0, 4,0);
        System.out.println(Arrays.toString(nums)+"\n");
    }
    
    public static void mergeSort(int[] arr, int start, int end, int counter){
         System.out.println("MS call: " + Arrays.toString(arr) + " start=" + start + " end=" + end);
        
        if(start == end){
            System.out.println(counter);
            return;
        }
        int middle = (start + end) / 2;
        mergeSort(arr, start, middle,counter+1);
        mergeSort(arr, middle+1, end,counter+1);
        merge(arr, start, middle, end);
    }
    
    public static void merge(int[] arr, int start, int middle, int end){
        System.out.println("merge call: " + Arrays.toString(arr) + " start=" + start + "middle=" + middle + " end=" + end);
        int[] left = new int[middle-start+1];
        int[] right = new int[end-middle];
        
        for(int i = start; i <= middle; i++)
            left[i-start] = arr[i];
        for(int i = middle+1; i <= end; i++)
            right[i-middle-1] = arr[i];
            
        int leftSpot = 0;
        int rightSpot = 0;
        int spot = start;
        while(leftSpot < left.length && rightSpot < right.length){
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
            
    }
}