import java.io.*;
import java.util.*;
public class towerRunner
{
    public static void main(String[] args) {
        int amount = 4; 
        tower A = new tower(amount,"A"); 
        tower B = new tower(0,"B"); 
        tower C = new tower(0,"C");
        print(B,C,A, amount);
        solve(amount, A,C,B, amount);
        
    }

    public static void solve(int n, tower from, tower to, tower extra,  int amount){
        if(n ==0)
            return; 
        solve(n - 1, from, extra, to, amount);
        to.add(from.remove());
        print(from,extra,to, amount);
        solve(n - 1, extra, to, from,amount);
    }

    public static void print(tower from, tower to, tower extra, int amount){
        from.increase();
        to.increase(); 
        extra.increase();
        Stack<Integer> fromStack = new Stack<Integer>(); 
        fromStack.addAll(from.getStack());
        Stack<Integer> toStack = new Stack<Integer>();
        toStack.addAll(to.getStack());
        Stack<Integer> extraStack = new Stack<Integer>(); 
        extraStack.addAll(extra.getStack());
        if(fromStack.size() < amount){
            while(fromStack.size() != amount)
                fromStack.push(0);
        }
        if(toStack.size() < amount){
            while(toStack.size() != amount)
                toStack.push(0); 
        }
        if(extraStack.size() < amount){
            while(extraStack.size() != amount)
                extraStack.push(0);
        }
        for (int i = 0; i <amount; i++){

            if(from.getTowerValue().equals("A")){

                if(fromStack.peek() == 0){
                    fromStack.pop();  
                    System.out.print("* ");
                }
                else 
                    System.out.print(fromStack.pop()+" "); 
            }
            else if (to.getTowerValue().equals("A")){

                if(toStack.peek() == 0){
                    toStack.pop();  
                    System.out.print("* ");
                }
                else 
                    System.out.print(toStack.pop()+" ");
            }
            else {

                if(extraStack.peek() == 0){
                    extraStack.pop();  
                    System.out.print("* ");
                }
                else 
                    System.out.print(extraStack.pop()+" ");
            }

            if(from.getTowerValue().equals("B")){

                if(fromStack.peek() == 0){
                    fromStack.pop();  
                    System.out.print("* ");
                }
                else 
                    System.out.print(fromStack.pop()+" "); 
            }
            else if (to.getTowerValue().equals("B")){

                if(toStack.peek() == 0){
                    toStack.pop();  
                    System.out.print("* ");
                }
                else 
                    System.out.print(toStack.pop()+" ");
            }
            else {

                if(extraStack.peek() == 0){
                    extraStack.pop();  
                    System.out.print("* ");
                }
                else 
                    System.out.print(extraStack.pop()+" ");
            }

            if(from.getTowerValue().equals("C")){

                if(fromStack.peek() == 0){
                    fromStack.pop();  
                    System.out.print("* ");
                }
                else 
                    System.out.print(fromStack.pop()+" "); 
            }
            else if (to.getTowerValue().equals("C")){

                if(toStack.peek() == 0){
                    toStack.pop();  
                    System.out.print("* ");
                }
                else 
                    System.out.print(toStack.pop()+" ");
            }
            else {

                if(extraStack.peek() == 0){
                    extraStack.pop();  
                    System.out.print("* ");
                }
                else 
                    System.out.print(extraStack.pop()+" ");
            }
            System.out.println();
        }
        System.out.println("A B C\nTrials: "+from.getTrials()+"\n"); 
    }
}
