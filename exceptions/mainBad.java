import java.util.*;  
public class mainBad 
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        boolean tryAgain = true;
        do{
            try{
                System.out.println("Enter Your First Number: "); 
                int num = input.nextInt(); 
                BadInputException p1 = new BadInputException(num);
                tryAgain = false;
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input, please try again: ");
                input.nextLine();
            }
        } while( tryAgain ); 
    }
}
