import java.util.*;
public class yahtzeeRunner
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        yahtzee user = new yahtzee(); 
        int end = 0;
        int roll;

        String score;
        while (end != 13){
            System.out.println("Turn: "+(end+1)+"/13\n");
            System.out.println(user);
            System.out.println();

            roll = 0; 
            score = "r";
            String category;
            ArrayList<Integer> rolls = new ArrayList<>();
            for(int i = 0; i < 5; i++)
                rolls.add((int)(Math.random() * (6 - 1 + 1) + 1));
            while(roll < 2 && score.equals("r")){
                System.out.println("You rolled "+rolls);
                System.out.print("Do you want to roll <r> or score <s>");
                score = input.nextLine();
                System.out.println();
                if(score.trim().equals("r")){
                    String reroll;
                    System.out.print("which dice do you want to re-roll (enter 0 through 4 seperated by spaces): "); 
                    reroll = input.nextLine();
                    String[] reRollList = reroll.split(" ");
                    for(String i : reRollList){
                        rolls.set(Integer.parseInt(i),(int)(Math.random() * (6 - 1 + 1) + 1));   
                    }

                }
                roll++;
            }
            System.out.println("You rolled "+rolls);
            System.out.print("\nEnter a score category -> ones<1>, twos<2>, threes<3>, fours<4>, fives<5>, sixes<6>, 3kind<3k>, 4kind<4k>, fhouse<f>, sm str<s>, lg str<l>, yahtrollsee<y> chance<c> ");
            category = input.nextLine();
            System.out.println();
            while(user.getUsed(category)){
                System.out.print("Please select a category that is not used or a valid category: ");  
                category = input.nextLine();
            }
            System.out.println();
            placeScore(category, user, rolls);
            end++;

        }

        System.out.println(user+"\n\n Grand score ="+user.getTotal()); 
    }

    public static void placeScore(String x, yahtzee y, ArrayList<Integer> rolls){
        switch (x) {
            case "1" -> y.setOnes(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
            case "2" -> y.setTwos(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
            case "3" -> y.setThrees(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
            case "4" -> y.setFours(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
            case "5" -> y.setFives(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
            case "6" -> y.setSixes(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
            case "3k" -> y.setThreeKind(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
            case "4k" -> y.setFourKind(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
            case "f" -> y.setFhouse(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
            case "s" -> y.setSMStr(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
            case "l" -> y.setLGStr(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
            case "y" -> y.setYahtzee(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
            case "c" -> y.setChance(rolls.get(0), rolls.get(1), rolls.get(2), rolls.get(3), rolls.get(4));
        }
    }
}
