import java.util.*; 
import java.io.*;
import java.util.TreeSet;
public class relatives
{
    public static void main(String[] args){
      Map<String, ArrayList<String>> nameMap = new HashMap<String, ArrayList<String>>(); 
        
        try(BufferedReader bReader = new BufferedReader(new FileReader("relatives.dat"))){
         String line = ""; 
         int lines = Integer.parseInt(bReader.readLine());
         while( lines >0 ){
             line = bReader.readLine(); 
             String[] value = line.split(" ");
             if(!nameMap.containsKey(value[0]))
               nameMap.put(value[0], new ArrayList<String>()); 
             nameMap.get(value[0]).add(value[1]);
             
             if(!nameMap.containsKey(value[1]))
               nameMap.put(value[1], new ArrayList<String>()); 
             nameMap.get(value[1]).add(value[0]);  
             
             lines--; 
            }
        }
      catch(Exception e){
          System.out.println(e.getMessage());
        }
       
      for(String s: nameMap.keySet()){
         System.out.print(s +" is related to: ");
         TreeSet<String> set = new TreeSet<String>((nameMap.get(s)));
         for (String e : set){
            System.out.print(e+" ") ;
            }  
         System.out.println();
        }
    }
}
