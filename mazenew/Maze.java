import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Maze
{
    private String [][] tester;  
    private String mazeOne, mazeTwo;
    private ArrayList<MazePoint> coordinates;  
    private ArrayList<MazePoint> mazeCoords; 
    private HashMap<MazePoint, ArrayList<MazePoint>> map;
    private String placesUsedone; 
    public Maze(String [][] x){
        tester = x;
        mazeOne = ""; 
        coordinates = new ArrayList<MazePoint>(); 
        mazeCoords = new ArrayList<MazePoint>(); 
        map = new HashMap<MazePoint, ArrayList<MazePoint>>();
        int coorNums = 0; 
        placesUsedone =""; 
        for (int i = 0; i < x.length; i++){
            for(int b =0; b <x[0].length; b++){
                if(x[i][b].equals("0")){
                    mazeCoords.add(new MazePoint(x[i][b],i,b));
                    map.put(mazeCoords.get(coorNums), new ArrayList<MazePoint>());    
                    coorNums++; 
                }
            }
        }
        for( MazePoint e : mazeCoords){
            map.put(e, new ArrayList<MazePoint>());
        }
        for(MazePoint e : mazeCoords){
            for( MazePoint i : mazeCoords){
                if(e.getRPosition() < x.length-1) {
                    if((e.getRPosition() +1) == i.getRPosition() && i.getCPosition() == e.getCPosition()){
                        if(map.get(e).contains(i) == false)
                            map.get(e).add(i); 
                        if(map.get(i).contains(e) == false)
                            map.get(i).add(e);  

                    }
                }
                if (e.getRPosition() > 0){
                    if((e.getRPosition() -1) == i.getRPosition() && i.getCPosition() == e.getCPosition()){
                        if(map.get(e).contains(i) == false)
                            map.get(e).add(i); 
                        if(map.get(i).contains(e) == false)
                            map.get(i).add(e);  

                    }
                }
                if(e.getCPosition() < x.length-1){
                    if((e.getCPosition() + 1) == i.getCPosition() && i.getRPosition() == e.getRPosition()){
                        if(map.get(e).contains(i) == false)
                            map.get(e).add(i); 
                        if(map.get(i).contains(e) == false)
                            map.get(i).add(e);  

                    }
                }
                if(e.getCPosition() > 0) {
                    if ((e.getCPosition() -1) == i.getCPosition() && i.getRPosition() == e.getRPosition()){
                        if(map.get(e).contains(i) == false)
                            map.get(e).add(i); 
                        if(map.get(i).contains(e) == false)
                            map.get(i).add(e);  

                    }
                }
            }
        }
    }

    public void solveMaze(){
        ArrayList<MazePoint> coordstemp = new ArrayList<MazePoint>(); 
        String[][] test1 = tester; 
        this.check(mazeCoords.get(0), mazeCoords.get(mazeCoords.size()-1), " "); 
    }

    public void check(MazePoint first, MazePoint second, String placesUsed)
    {
        if(map.get(first).contains(second))
        { 
            placesUsed+= " "+first.getCoordinates(); 
            placesUsed+= " "+second.getCoordinates(); 
            if(placesUsedone == "")
                placesUsedone = placesUsed; 
            else if(placesUsedone.length() > placesUsed.length())
                placesUsedone = placesUsed; 
            return;
        }
        placesUsed+= " "+first.getCoordinates(); 
        for(MazePoint e: map.get(first)){
            if (map.get(e).size()>0){
                if (placesUsed.length()< placesUsedone.length() || placesUsedone.length() == 0){
                if (placesUsed.contains(e.getCoordinates()) == false){
                    this.check(e,second,placesUsed);
                }
              }
            }
        }
    }

    public String toString(){
        String ans = placesUsedone.trim();
        List<String> locations = Arrays.asList(ans.split(" "));
        String[][] orig = new String[tester.length][tester[0].length]; 

        for(int i = 0; i< tester.length; i++){
            for (int x = 0; x< tester[0].length; x++){
                orig[i][x]= tester[i][x];   
            }
        }

        for(MazePoint e: mazeCoords){
            if(locations.contains(e.getCoordinates()))
                tester[e.getRPosition()][e.getCPosition()] = "-"; 
        }
        String ans1 = "";
        for(int i = 0; i< tester.length; i++){
            for (int x = 0; x< tester[i].length; x++){
                ans1+= orig[i][x]+ " ";   
            }
            ans1+="    "; 
            for (int b = 0; b<tester[i].length; b++){
                ans1+= tester[i][b] +" ";  
            }
            ans1+="\n"; 
        }
        int num = 0; 
        ans =""; 
        for(String e : locations){
            if (num == 10){
                ans += "\n"+e+" "; 
                num= 0; 
            }
            else 
                ans += e+" "; 
            num++; 

        }

        return ans1+"\n" +ans ; 
    }

}
