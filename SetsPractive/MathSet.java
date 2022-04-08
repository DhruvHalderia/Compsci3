
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.*;
public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
	    one = new HashSet();
	    two = new HashSet();
	}

	public MathSet(String o, String t)
        {
          one = new HashSet();
          two = new HashSet();
          String[] words = o.split(" ");
          for (int i = 0; i<words.length; i++){
              one.add(Integer.parseInt(words[i]));
            }
          String[] wordsTwo = t.split(" ");
          for (int i = 0; i <wordsTwo.length; i++){
              two.add(Integer.parseInt(wordsTwo[i]));
            }
          
	}

	public Set<Integer> union()
        {
	   Set<Integer> temp = new HashSet<Integer>(one);
	   temp.addAll(two);
	   return temp; 
	}

	public Set<Integer> intersection()
	{
            Set<Integer> temp = new HashSet<Integer>(one);
            temp.retainAll(two);
	    return temp;
	}

	public Set<Integer> differenceAMinusB()
	{
	    Set<Integer> temp = new HashSet<Integer>(one);
            temp.removeAll(two);
	    return temp;
	}

	public Set<Integer> differenceBMinusA()
	{
	    Set<Integer> temp = new HashSet<Integer>(two);
            temp.removeAll(one);
	    return temp;
	}
	
	public Set<Integer> symmetricDifference()
	{		
           Set<Integer> temp = new HashSet<Integer>(two);
           temp.removeAll(one);
           
           Set<Integer> temp2 = new HashSet<Integer>(one);
           temp2.removeAll(two);
           
           temp.addAll(temp2);
	    return temp;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}