import java.io.*;
import java.util.Scanner;

public class MazeRunner
{ 
    public static void main(String[] args){
        try(BufferedReader test = new BufferedReader(new FileReader("E:\\Code\\Java\\School\\Compsci3\\MazeProject\\basicMaze.dat"))){
   String line = "";
   line = test.readLine(); 
   Scanner input = new Scanner(line);
   int num = input.nextInt();
   int num2 = input.nextInt();
   Maze user = new Maze(num,num2);
           
    for(int r = 0; r<num;r++){
       line = test.readLine(); 
       input = new Scanner(line);  
        for(int x = 0; x<num2;x++){
        user.setMaze(input.nextInt());    
       }
   } 
  
   user.solveMaze(); 
   System.out.println (user);
  }
    catch (IOException e){
       System.out.println("This doesn't work");
    }
    System.out.println("\n");
   try(BufferedReader test = new BufferedReader(new FileReader("E:\\Code\\Java\\School\\Compsci3\\MazeProject\\maze3.dat"))){
   String line = "";
   line = test.readLine(); 
   Scanner input = new Scanner(line);
   int num = input.nextInt();
   int num2 = input.nextInt();
   Maze user = new Maze(num,num2);
           
    for(int r = 0; r<num;r++){
       line = test.readLine(); 
       input = new Scanner(line);  
        for(int x = 0; x<num2;x++){
        user.setMaze(input.nextInt());    
       }
   } 
  
   user.solveMaze(); 
   System.out.println (user);
  }
    catch (IOException e){
       System.out.println("This doesn't work");
    }
   System.out.println("\n");
   try(BufferedReader test = new BufferedReader(new FileReader("E:\\Code\\Java\\School\\Compsci3\\MazeProject\\bigmaze5.dat"))){
   String line = "";
   line = test.readLine(); 
   Scanner input = new Scanner(line);
   int num = input.nextInt();
   int num2 = input.nextInt();
   Maze user = new Maze(num,num2);
           
    for(int r = 0; r<num;r++){
       line = test.readLine(); 
       input = new Scanner(line);  
        for(int x = 0; x<num2;x++){
        user.setMaze(input.nextInt());    
       }
   } 
  
   user.solveMaze(); 
   System.out.println (user);
  }
    catch (IOException e){
       System.out.println("This doesn't work");
    }
 }
}
