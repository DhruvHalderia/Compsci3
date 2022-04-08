import java.io.*; 
import java.util.Map; 
import java.util.HashMap; 
import java.util.TreeSet; 
import java.util.ArrayList;
public class practicetestclass
{
   public static void main(String[] args){
       Map<String, ArrayList<String>> nameMap = new HashMap<String, ArrayList<String>>(); 
       try(BufferedReader bReader = new BufferedReader(new FileReader("relatives.dat"))){
         String line = ""; 
         while((line = bReader.readLine()) != null){
           String[] values = line.split(" "); 
           if(!nameMap.containsKey(values[0]))
            nameMap.put(values[0], new ArrayList<String>());
           nameMap.get(values[0]).add(values[1]); 
           if(!nameMap.containsKey(values[1]))
            nameMap.put(values[1], new ArrayList<String>()); 
           nameMap.get(values[1]).add(values[0]); 
            }
          
        }
       catch(Exception e){
           System.out.println(e.getMessage());
        }
        
       for(String s: nameMap.keySet()){
          System.out.print(s+" is related to: ");
          TreeSet<String> set = new TreeSet<String>(nameMap.get(s)); 
          for(String e : set)
           System.out.print(e+" ");
           System.out.println();
        }
    }
}
