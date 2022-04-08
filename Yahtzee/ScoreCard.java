
public class ScoreCard
{
    private int score; 
    private boolean used; 
    private String category; 
    public ScoreCard (String x){
        score = -1; 
        used = false;
        category = x; 
    }

    public int getScore(){
        return score -1; 
    }

    public boolean getStatus(){
        return used;   
    }

    public void setStatus(){
        used = true;    
    }

    public String getName(){
        return category;    
    }

    public void setScore(int x){
        score = x;
        used = true; 
    }

    public String toString(){

        return category+"\t"+score;    
    }

}
