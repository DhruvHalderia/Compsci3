import java.io.IOException;
import java.util.*; 
import java.io.*;
import java.util.Arrays;
public class MazeRunner
{ 
    public static void main(String[] args){

        try(BufferedReader test = new BufferedReader(new FileReader("maze.dat"))){
            String line = "";
            line = test.readLine(); 
            Scanner input = new Scanner(line);
            int num = input.nextInt();
            int num2 = input.nextInt();
            String[][] initialMaze = new String[num][num2];   
            int x = 0;
            while((line = test.readLine()) != null){
                List<String> locations = Arrays.asList(line.split(" "));
                for( int i = 0; i < locations.size(); i++){
                    initialMaze[x][i] = locations.get(i); 
                }
                x++; 
            }
            Maze user = new Maze(initialMaze);
            user.solveMaze(); 
            System.out.println(user);
        }
        catch (IOException e){
            System.out.println("This doesn't work");
        }
        System.out.println("\n");
        
        try(BufferedReader test = new BufferedReader(new FileReader("maze1.dat"))){
            String line = "";
            line = test.readLine(); 
            Scanner input = new Scanner(line);
            int num = input.nextInt();
            int num2 = input.nextInt();
            String[][] initialMaze = new String[num][num2];   
            int x = 0;
            while((line = test.readLine()) != null){
                List<String> locations = Arrays.asList(line.split(" "));
                for( int i = 0; i < locations.size(); i++){
                    initialMaze[x][i] = locations.get(i); 
                }
                x++; 
            }
            Maze user = new Maze(initialMaze);
            user.solveMaze(); 
            System.out.println(user);
        }
        catch (IOException e){
            System.out.println("This doesn't work");
        }
        System.out.println("\n");
        
        try(BufferedReader test = new BufferedReader(new FileReader("maze2.dat"))){
            String line = "";
            line = test.readLine(); 
            Scanner input = new Scanner(line);
            int num = input.nextInt();
            int num2 = input.nextInt();
            String[][] initialMaze = new String[num][num2];   
            int x = 0;
            while((line = test.readLine()) != null){
                List<String> locations = Arrays.asList(line.split(" "));
                for( int i = 0; i < locations.size(); i++){
                    initialMaze[x][i] = locations.get(i); 
                }
                x++; 
            }
            Maze user = new Maze(initialMaze);
            user.solveMaze(); 
            System.out.println(user);
        }
        catch (IOException e){
            System.out.println("This doesn't work");
        }
    }
}
