import java.io.*;
import java.util.Scanner;

public class InOut
{
    public static void main(String[] args){
        int sum = 0;
        try(BufferedReader bReader = new BufferedReader(new FileReader("U:\\compsci3\\Filetest.txt"))){
            String line = "";
            
      while( (line = bReader.readLine()) != null){
            
                System.out.println(line);
//                 Scanner input = new Scanner(line);
//                 sum += input.nextInt() + input.nextInt();
//                 System.out.println("  " + sum);
            }
// System.out.println(sum);
        }
        catch(IOException e){
            System.out.println("CS3 students are the best!");
            System.out.println(e.getMessage());
        }
            
        try(PrintWriter fileOut = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\dennis_bonsall\\Downloads\\fools.txt")))){
            fileOut.println("the total sum for all numbers = " + sum);    
            
          
        }
        catch(IOException e){
            System.out.println("I hate writing files");
            
        }
        
}
}