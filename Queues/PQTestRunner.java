

public class PQTestRunner
{
    public static void main(String args[]){
     PQTest one = new PQTest("one two three four five six seven"); 
     System.out.println("toString() - "+one.toString()+"\ngetMin() - "+one.getMin()+"\ngetNaturalOrder() - "+one.getNaturalOrder()+"\n\n");
     
     one = new PQTest("1 2 3 4 5 one two three four five"); 
     System.out.println("toString() - "+one.toString()+"\ngetMin() - "+one.getMin()+"\ngetNaturalOrder() - "+one.getNaturalOrder()+"\n\n");
     
     one = new PQTest("a p h j e f m c i d k l g n o b"); 
     System.out.println("toString() - "+one.toString()+"\ngetMin() - "+one.getMin()+"\ngetNaturalOrder() - "+one.getNaturalOrder()+"\n\n");
     
    }
}
