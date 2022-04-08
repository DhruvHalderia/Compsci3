import java.util.*; 

public class MergeSortRunner
{
    public static void main(String[] args){
        System.out.println("MergeSort: \n\n"); 
        int length = 10; 
        MergeSort input = new MergeSort(length);
        input.makeArray(length);
        System.out.println("Original: "+Arrays.toString(input.getFirstArray()));
        input.mergeSort(input.getFirstArray(),0,input.getFirstArray().length-1,false);
        System.out.println(input.getOutput(true));
        
        System.out.println();
        
        length = 10; 
        input = new MergeSort(length);
        input.makeArray(length);
        input.mergeSort(input.getFirstArray(),0,input.getFirstArray().length-1,false);
        System.out.println(input.getOutput(false));
        
        System.out.println();
        
        input.mergeSort(input.getFirstArray(),0,input.getFirstArray().length-1,true);
        System.out.println(input.getOutputReverse()+"\n");
        
       System.out.println("Sorting 10 list of n= "+length+"\n"+input.mergeNTimes(length)); 
       double log = ((Math.log(length) / Math.log(2)));
       System.out.println("nlog2n = "+(int)(length*log)+"  n^2 = "+(length*length)+"\n");
       
       length = 100;
       
       System.out.println("Sorting 10 list of n= "+length+"\n"+input.mergeNTimes(length)); 
       log = ((Math.log(length) / Math.log(2)));
       System.out.println("nlog2n = "+(int)(length*log)+"  n^2 = "+(length*length)+"\n");
       
       length = 1000;
       
       System.out.println("Sorting 10 list of n= "+length+"\n"+input.mergeNTimes(length)); 
       log = ((Math.log(length) / Math.log(2)));
       System.out.println("nlog2n = "+(int)(length*log)+"  n^2 = "+(length*length)+"\n");
    }
}
