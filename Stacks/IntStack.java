
import java.util.ArrayList;
import static java.lang.System.*;

public class IntStack
{
	//pick your storage for the stack
	//you can use the an array or an ArrayList

	//option 1
	// private int[] rayOfInts;
	// private int numInts;

	//option 2
	private ArrayList<Integer> listOfInts;

	public IntStack()
	{
         listOfInts = new ArrayList<Integer>(); 
         
	}

	public void push(int item)
	{
         listOfInts.add(0,item);
	}

	public int pop()
	{
		return listOfInts.remove(0);
	}

	public boolean isEmpty()
	{
            if (listOfInts.size()==0)
             return true;
	    return false;
	}

	public int peek()
	{
		return listOfInts.get(0);
	}

	public String toString()
	{
	  String answer = "["; 
	  for (int i = listOfInts.size(); i>0; i--){
	     answer = answer + listOfInts.get(i-1);
	     if (i-1 !=0)
	      answer = answer+", ";
	   }
	  return answer+"]";
	}
}