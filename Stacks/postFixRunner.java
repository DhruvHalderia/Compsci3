

public class postFixRunner
{
   public static void main (String args[]){
     postFix one = new postFix("2 7 + 1 2 + +");  
     System.out.println(one.getOriginal()+" = "+one.getCalculations()); 
     
     one = new postFix("1 2 3 4 + + +");
     System.out.println(one.getOriginal()+" = "+one.getCalculations());
     
     one = new postFix("9 3 * 8 / 4 +");
     System.out.println(one.getOriginal()+" = "+one.getCalculations());
     
     one = new postFix("3 3 + 7 * 9 2 / +");
     System.out.println(one.getOriginal()+" = "+one.getCalculations());
     
     one = new postFix("9 3 / 2 * 7 9 * + 4 -");
     System.out.println(one.getOriginal()+" = "+one.getCalculations());
     
     one = new postFix("5 5 + 2 * 4 / 9 +");
     System.out.println(one.getOriginal()+" = "+one.getCalculations());
     }
}
