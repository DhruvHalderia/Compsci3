import java.io.*;
import java.util.*;
public class tower
{
    private Stack<Integer> towerRod;  
    private int amount, trials; 
    private String towerValue;
    public tower(int x, String word)
    {
     towerRod = new Stack<Integer>();   
     amount = x; 
     for(int i = x; i >0; i--){
      towerRod.push(i);
        }
     towerValue = word; 
     trials = -1; 
    }
    
    public Stack getStack(){
      return towerRod; 
    }
    
    public String getTowerValue(){
        return towerValue;
    }
    
    public void increase(){
        trials++; 
    }
    
    public int remove(){
     return towerRod.pop(); 
    }
    
    public void add(int x){
     towerRod.push(x);   
    }
    
    public int getTrials(){
     return trials;     
    }
    
    public int getAmount(){
        return amount; 
    }
    
    public String toString(){ 
    String ans = ""; 
    for(int x : towerRod)
     ans+= x+" "; 
    return ans; 
    }
    
}
