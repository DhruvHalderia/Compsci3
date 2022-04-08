

public class Birthday
{
    private int month, day; 
    
    
    public Birthday(int x, int y){
     month = x; 
     day = y; 
    }
    
    public int getMonth(){
        return month;
    }
   
    public int getDay(){
        return day;
    }
    
    public void setDay(int x){
       day = x; 
    }
    
    public void setMonth(int x){
       month = x; 
    }
    
    public String toString(){
        return "Month : "+month+" Day : "+day; 
    }
}
