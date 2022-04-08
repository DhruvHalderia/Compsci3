import java.io.*;
import java.util.TreeSet; 
import java.util.Scanner;
import java.util.*;
public class oddsEven
{
   public static void main(String[] args){
       try(BufferedReader test = new BufferedReader(new FileReader("E:\\Code\\Java\\School\\Compsci3\\SetsPractive\\oddevent.dat"))){
          String line = ""; 
          Scanner input = new Scanner(line);
         while ((line = test.readLine()) != null){ 
          System.out.println(getOddEven(line)+"\n");
          input = new Scanner(line); 
        }
        
    }
        catch (IOException e){
       System.out.println("This doesn't work");
    }
    }
    public static String getOddEven(String x){
    String[] words = x.split(" "); 
    TreeSet<Integer> odd = new TreeSet<Integer>(); 
    TreeSet<Integer> even = new TreeSet<Integer>();
    for(int i = 0; i<words.length; i++){
      if (Integer.parseInt(words[i])%2==0)
        even.add(Integer.parseInt(words[i]));
      else 
        odd.add(Integer.parseInt(words[i]));
    }
    return "ODDS : "+odd.toString()+"\nEVENS : "+even.toString()+"\n";  
   }
}
