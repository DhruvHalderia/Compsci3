import java.io.*;
import java.util.*; 
public class SantaSoftware implements Comparable<SantaSoftware>
{
    private String name, address; 
    private int age, overall;

    public SantaSoftware(String n){
        name = n;  
        overall = 0; 
        address = this.getAddy();
        age = (int)(Math.random() * (10 - 1 + 1) + 1);
    }

    public String getName(){
        return name;       
    }

    public void setOverall(int nice, int naughty){
        overall = nice - naughty;
    }

    public Comparable getOverall(){
        return overall;  
    }

    public void setAge(int x){
        age = x; 
    }

    public int getOverallInt(){
        return overall;  
    }

    @Override
    public int compareTo(SantaSoftware x){
        return x.getOverall().compareTo(this.getOverall());
    }

    public String getAddy(){
        String ans = " Side Street";
        for (int i = 0; i<3; i++)
            ans = (int)(Math.random() * (5 - 1 + 1) + 1) + ans;
        return ans; 
    }

    public String getOrder(){
        return name+" "+address;   
    }

    @Override
    public String toString(){
        return name+"("+age+" years old)"+" is nice level = "+overall+", "+address;    
    }
}
