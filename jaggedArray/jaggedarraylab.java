import java.util.Arrays; 

public class jaggedarraylab
{
    public static void main(String[] args) {
        int[][] jagArrOne = new int[10][];
        for (int i = 0; i < 10; i ++ ){
            jagArrOne[i] = new int[i+1]; 
        }
        System.out.println("Jagged Array A:\n");
        for(int[] x: jagArrOne)
            System.out.println(Arrays.toString(x)); 

        System.out.println();

        int[][] jagArrTwo = new int[10][];
        for(int i = 0; i< 10; i ++)
            jagArrTwo[i] = new int[(int)(Math.random() * 10)+1];     
        System.out.println("Jagged Array B\n"); 
        for(int[] x: jagArrTwo)
            System.out.println(Arrays.toString(x)); 

        System.out.println(); 

        for (int i = 0; i< jagArrTwo.length; i++){
            for (int x = 0; x<jagArrTwo[i].length; x++){
                jagArrTwo[i][x] =  (int)(Math.random() * 99)+1;
            }
        }
        System.out.println("Jagged Array C\n");
        for(int[] x: jagArrTwo)
            System.out.println(Arrays.toString(x)); 
        System.out.println("\n"); 
        int num = 0; 
        int rows = 0; 
        int[][] jagArrThree = new int[100][]; 
        for(int i = 0; i< 99; i +=num){ 
            num = (int)(Math.random() * 10)+1;
            jagArrThree[rows] = new int[num];
            if( (i+num) > 99){
                num = 99- i;   
            }
            jagArrThree[rows] = new int[num];
            rows++;
        }
        int[][] jagArrFour = new int[rows][]; 
        for(int i = 0; i< rows; i ++)
            jagArrFour[i] = jagArrThree[i];
            
        System.out.println("Jagged Array D\n");
            
        int tempNum = 0; 
        for (int i = 0; i< jagArrFour.length; i++){
            for (int x = 0; x<jagArrFour[i].length; x++){
                tempNum = (int)(Math.random() * 99)+1;
                while(has(jagArrFour, tempNum))
                 tempNum = (int)(Math.random() * 99)+1;
                jagArrFour[i][x] =  tempNum;
            }
        }
        for(int[] x: jagArrFour)
            System.out.println(Arrays.toString(x)); 
    }

    public static boolean has(int[][] arr, int x){
        for (int i = 0; i< arr.length; i++){
            for (int b = 0; b<arr[i].length; b++){
                if (arr[i][b] ==  x)
                    return true; 
            }
        }   
        return false;
    }
}