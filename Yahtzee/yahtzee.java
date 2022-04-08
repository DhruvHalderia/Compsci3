import java.util.Arrays;
public class yahtzee{
    private final ScoreCard ones;
    private final ScoreCard twos;
    private final ScoreCard threes;
    private final ScoreCard fours;
    private final ScoreCard fives;
    private final ScoreCard sixes;
    private final ScoreCard threeSame;
    private final ScoreCard fourSame;
    private final ScoreCard fhouse;
    private final ScoreCard smStr;
    private final ScoreCard lgStr;
    private final ScoreCard yahtzee;
    private final ScoreCard chance;
    private int sum, bonus, total; 
    public yahtzee(){
        ones = new ScoreCard("ones"); 
        twos = new ScoreCard("twos"); 
        threes = new ScoreCard("threes");
        fours = new ScoreCard("fours"); 
        fives = new ScoreCard("fives"); 
        sixes = new ScoreCard("sixes"); 
        threeSame = new ScoreCard("3kind"); 
        fourSame = new ScoreCard("4kind"); 
        fhouse = new ScoreCard("fhouse"); 
        smStr = new ScoreCard("sm str"); 
        lgStr = new ScoreCard("lg str"); 
        yahtzee = new ScoreCard("yahtzee"); 
        chance = new ScoreCard("chance"); 
        sum = 0; 
        bonus = 0; 
        total = 0; 
    }

    public void setSum(int x){
        sum+=x; 
        if(sum >= 63 && bonus != 35){
            this.setBonus(35);
        }
    }

    public void setBonus(int x ){
        bonus+=x; 
        this.setTotal(x);
    }

    public void setTotal(int x){ 
        total += x;
    }

    public void setOnes(int x, int y, int z, int w, int q){
        int[] num = new int[]{x,y,z,w,q}; 
        int ans = 0; 
        for(int i : num){
            if(i == 1)
                ans+=1;
        }
        ones.setScore(ans);
        this.setSum(ans);
        this.setTotal(ans);
    }

    public void setTwos(int x, int y, int z, int w, int q){
        int[] num = new int[]{x,y,z,w,q}; 
        int ans = 0; 
        for(int i : num){
            if(i == 2)
                ans+=2;
        }
        twos.setScore(ans);
        this.setSum(ans);
        this.setTotal(ans);
    }

    public void setThrees(int x, int y, int z, int w, int q){
        int[] num = new int[]{x,y,z,w,q}; 
        int ans = 0; 
        for(int i : num){
            if(i == 3)
                ans+=3;
        }
        threes.setScore(ans);
        this.setSum(ans);
        this.setTotal(ans);
    }

    public void setFours(int x, int y, int z, int w, int q){
        int[] num = new int[]{x,y,z,w,q}; 
        int ans = 0; 
        for(int i : num)
            if(i == 4)
                ans+=4;
        fours.setScore(ans);
        this.setSum(ans);
        this.setTotal(ans);
    }

    public void setFives(int x, int y, int z, int w, int q){
        int[] num = new int[]{x,y,z,w,q};
        int ans = 0; 
        for(int i : num){
            if(i == 5)
                ans+=5;
        }
        fives.setScore(ans);
        this.setSum(ans);
        this.setTotal(ans);
    }

    public void setSixes(int x, int y, int z, int w, int q){
        int[] num = new int[]{x,y,z,w,q}; 
        int ans = 0; 
        for(int i : num){
            if(i == 6)
                ans+=6;
        }
        sixes.setScore(ans);
        this.setSum(ans);
        this.setTotal(ans);
    }

    public void setThreeKind(int x, int y, int z, int w, int q){
        int[] temp = new int[]{x,y,z,w,q}; 
        Arrays.sort(temp);
        int[] num = new int[5]; 
        int j = 0; 
        for (int i = 0; i<temp.length-1; i++){
            if(temp[i] != temp[i+1]){
                num[j] = temp[i];
                j++;
            }
        }
        if ((num[0] == num[1]) && (num[1] == num[2])){
            threeSame.setScore(x+y+z+w+q); 
            this.setTotal(x+y+z+w+q);
        }
        else if ((num[2] == num[3]) && (num[3] == num[4])){
            threeSame.setScore(x+y+z+w+q); 
            this.setTotal(x+y+z+w+q);
        }
        else 
            threeSame.setScore(0);
    }

    public void setFourKind(int x, int y, int z, int w, int q){
        int[] num = new int[]{x,y,z,w,q}; 
        Arrays.sort(num);
        if ((num[0] == num[1]) && (num[1] == num[2]) && num[2] == num[3]){
            fourSame.setScore(x+y+z+w+q); 
            this.setTotal(x+y+z+w+q);
        }
        else if ((num[2] == num[3]) && (num[3] == num[4]) && num[1] == num[2]){
            fourSame.setScore(x+y+z+w+q); 
            this.setTotal(x+y+z+w+q);
        }
        else 
            fourSame.setScore(0);
    }

    public void setFhouse(int x, int y, int z, int w, int q){
        int[] num = new int[]{x,y,z,w,q}; 
        Arrays.sort(num);
        if ((num[0] == num[1]) && (num[1] == num[2] && (num[3] == num[4]))){
            fhouse.setScore(25); 
            this.setTotal(25);
        }
        else if((num[2] == num[3]) && (num[3] == num[4] && (num[0] == num[1]))){
            fhouse.setScore(25); 
            this.setTotal(25);
        }
        else 
            fhouse.setScore(0);
    }

    public void setSMStr(int x, int y, int z, int w, int q){
        int[] num = new int[]{x,y,z,w,q}; 
        Arrays.sort(num); 
        if(((num[0] + 1 == num[1]) && (num[1] +1 == num[2]) && (num[2]+1 == num[3])) ||((num[1] + 1 == num[2]) && (num[2] +1 == num[3]) && (num[3]+1 == num[4]))){
            smStr.setScore(30); 
            this.setTotal(30);
        }
        else 
            smStr.setScore(0);
    }

    public void setLGStr(int x, int y, int z, int w, int q){
        int[] num = new int[]{x,y,z,w,q}; 
        Arrays.sort(num);  
        if((num[0] + 1 == num[1]) && (num[1] +1 == num[2]) && (num[2]+1 == num[3]) && (num[3] + 1 == num[4])){
            lgStr.setScore(40);
            this.setTotal(40);
        }
        else
            lgStr.setScore(0);
    }

    public void setYahtzee(int x, int y, int z, int w, int q){
        if ((yahtzee.getScore() == 50) && (y == z && z == w && w == q && q == x))
            this.setBonus(100); 

        if(y == z && z == w && w == q && q == x){
            yahtzee.setScore(50);
            this.setTotal(50);
        }
        else
            yahtzee.setScore(0);
    }

    public void setChance(int x, int y, int z, int w, int q){
        chance.setScore(x+y+z+w+q);
        this.setTotal(x+y+z+w+q);
    }

    public boolean getUsed(String x){
        return switch (x) {
            case "1" -> ones.getStatus();
            case "2" -> twos.getStatus();
            case "3" -> threes.getStatus();
            case "4" -> fours.getStatus();
            case "5" -> fives.getStatus();
            case "6" -> sixes.getStatus();
            case "3k" -> threeSame.getStatus();
            case "4k" -> fourSame.getStatus();
            case "f" -> fhouse.getStatus();
            case "s" -> smStr.getStatus();
            case "l" -> lgStr.getStatus();
            case "y" -> yahtzee.getStatus();
            case "c" -> chance.getStatus();
            default -> true;
        };
    }

    public int getTotal(){
        return total;   
    }

    public String toString(){
        return ones+"\n"+twos +"\n"+threes+"\n"+fours+"\n"+fives+"\n"+sixes+"\n-----\nsum\t"+sum+"\nbonus\t"+bonus+"\n-----\n"+threeSame+"\n"+fourSame+"\n"+fhouse+"\n"+smStr+"\n"+lgStr+"\n"+yahtzee+"\n"+chance+"\n-----\ntotal\t"+total;
    }
}
