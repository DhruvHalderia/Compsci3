
import java.io.*;
import java.util.Scanner;
import java.util.*; 
public class magicSquare2Runner
{
  public static void main(String[] args){
    try(BufferedReader bReader = new BufferedReader(new FileReader("magic2.dat"))){
     String line = "";   
     while((line = bReader.readLine()) != null){
        int num = Integer.parseInt(line);
        magicSquare2 A = new magicSquare2(num); 
        for(int i = 1; i <= num*num; i++)
         A.add(i);

        System.out.print(A);
        System.out.println();
    }
        
    }
    catch(IOException e){
      System.out.println(e);
    }
    }  
}
