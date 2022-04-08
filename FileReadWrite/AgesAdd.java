import java.io.*;
import java.util.Scanner;

public class AgesAdd
{
    public static void main(String[] args){
      int sum = 0; 
        
      try(PrintWriter fileOut = new PrintWriter(new BufferedWriter(new FileWriter("E:\\Code\\Java\\School\\Compsci3\\FileReadWrite\\fools.txt")))){
        BufferedReader test = new BufferedReader(new FileReader("E:\\Code\\Java\\School\\Compsci3\\FileReadWrite\\Filetest.txt")) ;
        String line = "";
        while ((line = test.readLine()) != null){
          Scanner input = new Scanner(line);
          while (input.hasNext()){
              fileOut.println( input.next());
              int num = input.nextInt(); 
              sum+=num; 
              fileOut.println(num);
            }
        }
         fileOut.println("Sum of all ages is : "+sum); 
       }
      catch(IOException e){
            System.out.println("CS3 students are the best!");
            System.out.println(e.getMessage());
        }
    }
}
