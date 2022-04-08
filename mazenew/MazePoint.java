
public class MazePoint
{
   private int rPos, cPos;
   private boolean open, onPath;
   private String point;  
   public MazePoint(String x, int r, int c){
      point = x; 
      rPos = r; 
      cPos= c; 
      if(x.equals("0"))
       open = true; 
      else 
       open = false;
      onPath = false; 
    }
    
   public void setOffStatus(){
     open = false; 
    }
   public void setOnPath(){
       onPath = true; 
    }
   
   public void setOffPath(){
       onPath =false ; 
    }
    
   public String getCoordinates(){
     return "("+rPos+","+cPos+")";    
    }
   
   public boolean getOnPath(){
      return onPath;  
    }
    
   public boolean getStatus(){
       return open; 
    }
   
   public String getPoint(){
       return point; 
    }
    
   public int getRPosition(){
      return rPos;  
    }
    
   public int getCPosition(){
      return cPos;  
    }
}
