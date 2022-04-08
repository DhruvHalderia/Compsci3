import java.util.Scanner;
import java.util.*;
public class Maze
{
  private int rPos, cPos, cellNum, colls,rows;
  private String [][] tester; 
  private String [][] original; 
  private MazePoint[][] arr;
  private String mazeOne, mazeTwo;
  private ArrayList<String> coordinates;  
  public Maze(int x, int b){
    rPos = 0;
    cPos = 0; 
    colls = b;
    rows = x;
    tester = new String[x][b];
    original = new String[x][b];
    arr = new MazePoint[x][b];
    cellNum = 0;
    mazeOne = ""; 
    coordinates = new ArrayList<String>(); 
    }
  
  public int getRPosition(){
    return rPos;   
    }
  
  public int getCPosition(){
    return cPos; 
    }
 
  public void setRPosition(int x){
      rPos = x;
    }
  
  public void setCPosition(int x){
      cPos = x; 
    }
  
  public void setMaze(int x){
    tester[rPos] [cPos] = ""+x;
    original[rPos] [cPos] = ""+x;
    cPos++;
    if (cPos == colls){
      cPos = 0;
      rPos++;
    }
    
      }
   
   public void solveMaze(){
      for(int r = 0; r<tester.length; r++){
         for(int c = 0; c<tester[0].length;c++){
              arr[r][c] = new MazePoint(tester[r][c],r,c); 
              cellNum++;               
            } 
        }
      
      tester[0][0] = "-";
      tester[tester.length-1][tester[0].length-1] = "-"; 
      int r = 0;
      int c = 0; 
      coordinates.add(arr[0][0].getCoordinates());    
      
      
      while ( r!= rows-1 || c!=colls-1){
       
          if (c<colls-1 && arr[r][c+1].getStatus() && !arr[r][c+1].getOnPath()){
             tester[r][c+1] = "-"; 
             arr[r][c].setOnPath(); 
             c++; 
             coordinates.add(arr[r][c].getCoordinates());
             
        } else if(r < rows-1 && arr[r+1][c].getStatus() && !arr[r+1][c].getOnPath()){
              tester[r+1][c] = "-"; 
              arr[r][c].setOnPath(); 
              r++; 
              coordinates.add(arr[r][c].getCoordinates());
              
        } else if (c>0 && arr[r][c-1].getStatus() && !arr[r][c-1].getOnPath()){
             tester[r][c-1] ="-"; 
             arr[r][c].setOnPath(); 
             c--; 
             coordinates.add(arr[r][c].getCoordinates());
             
        }
       else if (r>0 && arr[r-1][c].getStatus() && !arr[r-1][c].getOnPath()){
              tester[r-1][c] = "-"; 
              arr[r][c].setOnPath(); 
              r--; 
              coordinates.add(arr[r][c].getCoordinates());
              
        }
       
       
       else if (r<rows-1 && arr[r+1][c].getStatus() && arr[r+1][c].getOnPath()){
             tester[r][c] = "0"; 
             arr[r][c].setOffPath(); 
             arr[r][c].setOffStatus();
             r++; 
             coordinates.remove(coordinates.size()-1);
             
        }
       else if (r>0 && arr[r-1][c].getStatus() && arr[r-1][c].getOnPath()){
           tester[r][c] = "0"; 
           arr[r][c].setOffPath(); 
           arr[r][c].setOffStatus();
           r--; 
           coordinates.remove(coordinates.size()-1);
           
        }
       else if (c<colls-1 && arr[r][c+1].getStatus() && arr[r][c+1].getOnPath()){
           tester[r][c] = "0"; 
           arr[r][c].setOffPath(); 
           arr[r][c].setOffStatus();
           c++;
           coordinates.remove(coordinates.size()-1);
           
        }
       else if (c>0 && arr[r][c-1].getStatus() && arr[r][c-1].getOnPath()){
           tester[r][c] = "0"; 
           arr[r][c].setOffPath(); 
           arr[r][c].setOffStatus();
           c--;
           coordinates.remove(coordinates.size()-1);
           
        }
      }
       coordinates.add(arr[tester.length-1][tester[0].length-1].getCoordinates()); 
    }
    
    public String toString(){
        String ans="";
        for(int x=0; x<tester.length; x++){
         for(int y=0; y<tester[0].length; y++)
           ans = ans + original[x][y]+" "; 
           
         ans = ans+"              "; 
         for(int y=0; y<tester[0].length; y++)
           ans = ans + tester[x][y]+" "; 
           
         ans = ans+"\n";
             } 
    
        ans = ans+"\n";
        for (int i =0; i<coordinates.size()-1; i++) {
         ans = ans + coordinates.get(i)+" ";
         if ((i+1)%10 == 0)
          ans = ans+"\n";
        }           
        return ans; 
    }
  
}
