import java.util.*; 
import java.io.*;
public class Tester{
   public static void main(String[] args){
    Map<String, String> nameMap = new HashMap<String, String>(); 
    
    Map<String, ArrayList<String>> fruitMap = new HashMap<String, ArrayList<String>>(); 
     try(BufferedReader bReader = new BufferedReader(new FileReader("test1.txt"))){
          String line =  ""; 
          while((line = bReader.readLine()) !=null){
              String[] values = line.split(", ");
              nameMap.put(values[0],values[1].trim()); 
              String fruit = values[2].trim(); 
              if(!fruitMap.containsKey(fruit))
               fruitMap.put(fruit, new ArrayList<String>()); 
              fruitMap.get(fruit).add(values[1]);
            }
          
        }
       catch(Exception e){
           System.out.println(e.getMessage());
        }
    for(String e : nameMap.keySet())
     System.out.println(e + " = " + nameMap.get(e)); 
    for (String e : fruitMap.keySet())
     System.out.println(e + " Fav Fruit "+fruitMap.get(e)); 
     
  }
}
