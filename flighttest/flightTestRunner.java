
import java.io.IOException;
import java.util.*; 
import java.io.*;
import java.util.Arrays;
public class flightTestRunner
{
  public static void main( String[] args ) throws IOException
    {
      try(BufferedReader bReader = new BufferedReader(new FileReader("flightTimes.dat"))){
        String line = "";
        flightTest input;
        input = new flightTest(); 
        while((line = bReader.readLine()) != null){
          List<String> locations = Arrays.asList(line.split(" "));
//           System.out.println(locations.toString());
          input.add(locations.get(0), locations.get(1), locations.get(2)); 
        }
       input.solveMaze("AUSTIN", "SEATTLE");
       System.out.println(input);
       }
      catch(IOException e){
       System.out.println(e);   
       }
    }  
}
