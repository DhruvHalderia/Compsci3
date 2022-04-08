
import java.util.*;
public class QuickSortTwoRunner
{
    public static void main(String[] args){
     int length = 10; 
     QuickSort input = new QuickSort(length); 
     input.makeArray(length);
     System.out.println("Original: "+Arrays.toString(input.getFirstArr())); 
     input.quickSort(input.getFirstArr(),0,input.getFirstArr().length-1, false);
     System.out.println(input.getOutput(true));  
     
     System.out.println();
        
     length = 10; 
     input = new QuickSort(length);
     input.makeArray(length);
     input.quickSort(input.getFirstArr(),0,input.getFirstArr().length-1,false);
     System.out.println(input.getOutput(false));
        
     System.out.println();
        
     input.quickSort(input.getFirstArr(),0,input.getFirstArr().length-1,true);
     System.out.println(input.getOutputReverse()+"\n");
       
     System.out.println("Sorting 10 list of n= "+length+"\n"+input.quickNTimes(length)); 
     double log = ((Math.log(length) / Math.log(2)));
     System.out.println("nlog2n = "+(int)(length*log)+"  n^2 = "+(length*length)+"\n");
       
     length = 100;
       
     System.out.println("Sorting 10 list of n= "+length+"\n"+input.quickNTimes(length)); 
     log = ((Math.log(length) / Math.log(2)));
     System.out.println("nlog2n = "+(int)(length*log)+"  n^2 = "+(length*length)+"\n");
       
     length = 1000;
       
     System.out.println("Sorting 10 list of n= "+length+"\n"+input.quickNTimes(length)); 
     log = ((Math.log(length) / Math.log(2)));
     System.out.println("nlog2n = "+(int)(length*log)+"  n^2 = "+(length*length)+"\n");
    }
}
