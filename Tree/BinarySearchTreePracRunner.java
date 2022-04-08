
import java.util.*;
public class BinarySearchTreePracRunner
{
    public static void main(String[] args) {
        ArrayList <Integer> array = new ArrayList<Integer>(Arrays.asList(23, 7, 50, 8, 9, 90, 5, 7, 9, 67, 6345, 1, 324));
        BinarySearchTreePrac input = new BinarySearchTreePrac(); 
        input.makeTree(array);
        System.out.println(input);
        input.deleteMax();
        System.out.println(input);
        input.deleteMin();   
        System.out.println(input);
        input.delete(90); 
        System.out.println(input);
    }
}
