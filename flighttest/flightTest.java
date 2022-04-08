import java.util.*; 
import java.util.Map;
import java.util.TreeMap;
import static java.lang.System.*;
import java.util.Arrays; 
public class flightTest
{
    private TreeMap<String, ArrayList<String>> map;
    private TreeMap<String, ArrayList<String>> map2;
    private int shortestTime;
    private String placesUsedFin; 
    public flightTest()
    {
       map = new TreeMap<String, ArrayList<String>>();
       map2 = new TreeMap<String, ArrayList<String>>(); 
       shortestTime = -1;
       placesUsedFin = ""; 
    }
    
    public void add(String x, String y, String u){ 
     if(map.containsKey(x)== false)
        map.put(x, new ArrayList<String>()); 
     map.get(x).add(y); 
     if(map.containsKey(y)== false)
        map.put(y, new ArrayList<String>()); 
     map.get(y).add(x);
     String temp = x+" "+y; 
     map2.put(temp, new ArrayList<String>());
     map2.get(temp).add(u);
       }
     
    public void solveMaze(String x, String y){
        this.check(x,y,"", 0);   
    }

    public void check(String first, String second, String placesUsed, int time)
    {
      if(map.get(first).contains(second))
       {
        placesUsed+= " "+first; 
        placesUsed+= " "+second;
        String tempy = first+" "+second;
        time += Integer.parseInt(map2.get(tempy).get(0)); 
         if(shortestTime == -1){
          shortestTime = time; 
          placesUsedFin = placesUsed; 
        }
         else if(shortestTime> time){
          shortestTime = time;
          placesUsedFin = placesUsed; 
        }
         return;
        }
      placesUsed+= " "+first; 
      for(String e: map.get(first)){
        if (map.get(e).size()>0){
            if (placesUsed.contains(e) == false){
            String temp = first+" "+e;
            int num =Integer.parseInt(map2.get(temp).get(0)); 
            this.check(e,second,placesUsed,(time + num));
          }
        }
        }
    }

    public String toString()
    {
      List<String> locations = Arrays.asList(placesUsedFin.split(" ")); 
      String ans = ""; 
      for(int i = 1; i< locations.size(); i++){
          if(i == locations.size()-1)
           ans += locations.get(i); 
          else 
           ans += locations.get(i)+" goes to ";  
        }

      return ans+"\nTotal time "+shortestTime+" minutes ";
         
    }
}