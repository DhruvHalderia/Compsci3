import java.util.*;
import java.util.ArrayList;
public class birthdayRunner
{
   public static void main(String[] args){
      ArrayList<Birthday> students = new ArrayList<Birthday>();
      Scanner input = new Scanner(System.in); 
      int people = 0;
      int trials = 0; 
      String printTrials = ""; 
      String again = "Y"; 
      while( again.equals("Y")){
      System.out.println("How many students are in the class? " );
      people = input.nextInt(); 
      System.out.println("How many trials do you want to run? "); 
      trials = input.nextInt(); 
      System.out.println("Do you want to see all the matching trial (Y or N)? ");
      printTrials = input.next();
      int month = 0;
      int day = 0;
      double prob = 1.0;
      double num = 364.0;
      int counterBirthdays = 0; 
      int  counter = 0; 
      
      
      for( int i = 0; i < people-1; i++){
         prob *= num/365.0; 
         num--; 
        }
      System.out.println("The theoretical probability of a match is: "+(1.0-(Math.round(prob*10000.0)/10000.0)));
      for(int h = 0; h<trials;h++){
      
      for (int i = 0; i <people; i++){
        month = (int)(Math.random()*(12-1))+1 ;  
        if (month == 1 || month == 3|| month== 5|| month == 7|| month == 8 || month == 10|| month == 12) 
         day = (int)(Math.random()*(31-1))+1; 
        else if (month == 4 || month == 6 || month == 9 || month == 11)
         day = (int)(Math.random()*(30-1))+1;  
        else 
         day = (int)(Math.random()*(28-1))+1;
        if (h == 0)
         students.add(new Birthday(month,day));
        else {
         students.get(i).setDay(day);
         students.get(i).setMonth(month);
        }
      }
         
         for (int x = 0; x < people; x++){
           for(int y = 0; y<people; y++){
               if(students.get(x).getMonth() == students.get(y).getMonth() && students.get(x).getDay() == students.get(y).getDay() && x!=y){
                   counterBirthdays++;
                   if(printTrials.equals("Y")&& x<y)
                     System.out.println("Found a Match on student "+(x+1)+", "+students.get(x).toString()); 
                }
            }
            }
         if (counterBirthdays != 0)
             counter++; 
      
        counterBirthdays = 0; 
          }
       System.out.println("Using "+people+" students and "+trials+" trials, the number where same birthday was present is: "+counter+" which is "+((double)counter/trials)*100+"%\n");
       System.out.println("Do you want to run another trial (Y or N)? ");
       again = input.next();
       System.out.println();
    }
}
}
