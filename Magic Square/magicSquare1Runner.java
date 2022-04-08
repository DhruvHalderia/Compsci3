import java.io.*;
import java.util.Scanner;
import java.util.*; 
public class magicSquare1Runner
{
    public static void main(String[] args){
        try(BufferedReader bReader = new BufferedReader(new FileReader("magic1.dat"))){
            String line = "";     
            int trials = Integer.parseInt(bReader.readLine()); 
            int boxSize = 0; 
            while((line = bReader.readLine()) != null){
                int num = Integer.parseInt(line);
                magicSquare1 A = new magicSquare1(num); 
                line = bReader.readLine();

                A.add(line);

                System.out.print(A);
                if(A.check())
                    System.out.println("MAGIC SQUARE\n");
                else 
                    System.out.println("NOT MAGIC SQUARE\n");
            }

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
