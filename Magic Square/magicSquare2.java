
public class magicSquare2
{
    private int amount, previousY, previousX, length; 
    private int[][] matrix; 
    public magicSquare2(int x){
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

    public void add(int x){
        if(length == 0){
            matrix[amount/2][amount - 1] = x;
            previousY = amount/2; 
            previousX = amount-1; 
            length++;
            return;       
        }
        int nextY = previousY; 
        int nextX = previousX; 
        nextY--; 
        nextX++;
        if(nextY < 0){
            nextY = amount-1;   
        }
        if(nextY == amount)
            nextY = 0; 
        if (nextX ==amount)
            nextX = 0;
        if (nextX <0)
            nextX = amount -1; 

        while(matrix[nextY][nextX] !=0){
            nextX = nextX - 2 ; 
            nextY++; 
            if(nextY < 0){
                nextY = amount-1;   
            }
            if(nextY >= amount)
                nextY = 0; 
            if (nextX >=amount)
                nextX = 0;
            if (nextX <0)
                nextX = amount + nextX; 
        }
        previousY = nextY; 
        previousX = nextX; 
        matrix[nextY][nextX] = x; 
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
