
import java.util.*; 
public class magicSquare1
{
    private int amount, previousY, previousX, length; 
    private int[][] matrix; 
    public magicSquare1(int x){
        amount = x; 
        matrix = new int[amount][amount];
        previousY = amount/2; 
        previousX = amount-1; 
        for(int i = 0; i < amount; i++){
            for(int j = 0 ; j < amount; j++){
                matrix[i][j] = 0;  
            }
        }
        length = 0;
    }

    public void add(String x){
        String[] things = x.split(" ");  
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        for(String b :things){
            numbers.add(Integer.parseInt(b));
        }
        int y = 0;
        int i = 0; 
        for(Integer b: numbers){
            if(i == amount){
                i = 0;
                y++;
            }
            matrix[y][i] = b; 
            i++; 
        }
    }

    public boolean check(){
        int ans = 0; 
        int lastAns = amount*(amount*amount+1)/2 ;
        for(int i = 0; i< amount; i++){
            for(int j = 0 ; j < amount; j++){
                ans+= matrix[i][j];  
            } 
            if (ans != lastAns)
                return false;
            ans =0;
        }

        for(int i =0; i <amount; i++){
            ans+= matrix[i][i];  
        }
        if (ans != lastAns)
            return false;
        ans = 0; 
        for(int i =amount-1; i >=0; i--){
            ans+= matrix[i][i];  
        }
        if (ans != lastAns)
            return false;
        return true;   
    }

    public String toString(){
        String ans = ""; 
        for(int i = 0; i < amount; i++){
            for(int x = 0 ; x < amount; x++){
                ans += matrix[i][x] +" ";  
            }
            ans += "\n";
        }
        return ans;
    }
}
