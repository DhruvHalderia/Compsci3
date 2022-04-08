import java.util.TreeSet;
import java.util.*;
public class UniqueDupes
{
    public static void main(String[] args){
     System.out.println(getUniqueDupes("a b c d e f g h a b c d e f g h i j k")+"\n");
     System.out.println(getUniqueDupes("one two three one two three six seven one two")+"\n");
     System.out.println(getUniqueDupes("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6")+"\n");
    }
    
    public static String getUniqueDupes(String x){
     String orignal = ""; 
     String Dupe = "";
     String[] words = x.split(" ");
     TreeSet<String> set = new TreeSet<String>(Arrays.asList(words));   
     for(int i = 0; i<words.length; i++){
         int num = Dupe.length(); 
         for(int z = i+1; z<words.length; z++){
            if (words[i].equals(words[z]) && Dupe.indexOf(words[i])<0){
                Dupe+=words[i]+" "; 
            }
            }
    }
    String[] wordsTwo = Dupe.split(" ");
    TreeSet<String> dupes = new TreeSet<String>(Arrays.asList(wordsTwo));
    return "Original list : "+x+"\nUniques : "+set.toString()+"\nDupes : "+dupes;   
    }
}
