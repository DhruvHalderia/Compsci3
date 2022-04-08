import java.io.*;
import java.util.TreeSet; 
import java.util.Scanner;
import java.util.*;

public class MathSetRunner
{
    public static void main(String[] args){
      try(BufferedReader test = new BufferedReader(new FileReader("E:\\Code\\Java\\School\\Compsci3\\SetsPractive\\mathsetdata.dat"))){
          String line = ""; 
          String line2 = "";
          Scanner input = new Scanner(line);
       
          while ((line = test.readLine()) != null){ 
           line2 = test.readLine();
           System.out.println(getMath(line,line2));
           System.out.println (); 
           
          }
          
     }
        catch (IOException e){
       System.out.println("This doesn't work");
     }  
    }
    
    public static String getMath(String one, String two){
     String ans = ""; 
     MathSet user = new MathSet(one,two);   
     ans+= user+"\n";  
     ans+="union - "+user.union().toString()+"\n";
     ans+="intersection - "+user.intersection().toString()+"\n";
     ans+="difference A-B - "+user.differenceAMinusB().toString()+"\n";
     ans+="difference B-A - "+user.differenceBMinusA().toString()+"\n";
     ans+="symmetric difference - "+user.symmetricDifference().toString()+"\n";
     return ans;
    }
}
