import java.io.*;
import java.util.*;
public class SantaSoftwareRunner
{
    public static void main(String[] args){
        ArrayList<String> childName = new ArrayList<String>(Arrays.asList("Micheal","Dorothy", "Jose", "LeBron", "Andrew", "Cate", "Leonard", "Trey", "Isa", "Colby"));
        ArrayList<SantaSoftware> child = new ArrayList<SantaSoftware>(); 
        Map<SantaSoftware, ArrayList<String>> niceMap = new HashMap<SantaSoftware, ArrayList<String>>(); 
        Map<SantaSoftware, ArrayList<String>> naughtyMap = new HashMap<SantaSoftware, ArrayList<String>>();
        Hashtable<SantaSoftware, Stack<String>> presents = new Hashtable<SantaSoftware, Stack<String>>();
        PriorityQueue<SantaSoftware> queue = new PriorityQueue<SantaSoftware>(); 
        for( String s : childName)
            child.add(new SantaSoftware(s));

        for(SantaSoftware c : child){
            niceMap.put(c, new ArrayList<String>());
            naughtyMap.put(c, new ArrayList<String>());
            presents.put(c, new Stack<String>());            
        }

        int status = 6;
        Scanner input = new Scanner(System.in);
        Scanner putIn = new Scanner(System.in);
        child.get(0).setAge(12);
        child.get(1).setAge(2);
        child.get(2).setAge(14);
        while(status != 8){
            System.out.println("Santa's WorkShop\n1 - print list of children being monitored\n2 - record a nice action\n3 - record a naughty action\n4 - update nice/naughty state\n5 - print the Christmas Eve route\n8 - exit");    
            System.out.print("\nEnter Menu selection: ");
            status = input.nextInt();

            if(status == 1){
                for (int i = 0; i<child.size(); i++)
                    System.out.println(i+" "+child.get(i));   
            }

            if(status == 2){
                for (int i = 0; i<child.size(); i++)
                    System.out.println(i+" "+child.get(i));
                System.out.print("\nSelect the child you want to add a nice action to: ");
                int selection = input.nextInt(); 
                System.out.print("\n\nEnter a description of the nice action: ");
                String words = putIn.nextLine(); 
                niceMap.get(child.get(selection)).add(words);
                System.out.println("\nNice List");
                for(SantaSoftware s : child )
                    System.out.println(s.getName()+" "+niceMap.get(s));
                System.out.println("\nNaughty List");
                for(SantaSoftware s : child)
                    System.out.println(s.getName()+" "+naughtyMap.get(s));    
            }

            if(status == 3){
                for (int i = 0; i<child.size(); i++)
                    System.out.println(i+" "+child.get(i));
                System.out.print("\nSelect the child you want to add a naughty action to: ");
                int selection = input.nextInt(); 
                System.out.print("\n\nEnter a description of the naughty action: ");
                String words = putIn.nextLine(); 
                naughtyMap.get(child.get(selection)).add(words);
                System.out.println("\nNice List");
                for(SantaSoftware s : child )
                    System.out.println(s.getName()+" "+niceMap.get(s));
                System.out.println("\nNaughty List");
                for(SantaSoftware s : child)
                    System.out.println(s.getName()+" "+naughtyMap.get(s));
            }

            if (status == 4){
                for(SantaSoftware s : child)
                    s.setOverall(niceMap.get(s).size(), naughtyMap.get(s).size()); 
                for (int i = 0; i<child.size(); i++)
                    System.out.println(i+" "+child.get(i)); 
                for(SantaSoftware s : child){
                    if(presents.get(s).empty() && s.getOverallInt() > -1)
                        presents.get(s).push("Present");
                    else if (presents.get(s).empty() && s.getOverallInt() < 0)
                        presents.get(s).push("Coal");
                    else if (presents.get(s).peek().equals("Present") && s.getOverallInt() > -1)
                        presents.get(s).push("Present");
                    else if (presents.get(s).peek().equals("Coal") && s.getOverallInt() < 0)
                        presents.get(s).push("Coal");
                    else{ 
                        presents.get(s).pop();
                        if(s.getOverallInt() == 0)
                            presents.get(s).push("Present");
                        if(s.getOverallInt() == -1)
                            presents.get(s).push("Coal");
                    }
                }
                System.out.println("\nList of Presents");
                for(SantaSoftware s : child)
                    System.out.println(s.getName()+" "+presents.get(s));    
            }

            if (status == 5) {
                for(SantaSoftware s : child)
                    queue.add(s);
                boolean print = true;
                while(print) 
                {
                    SantaSoftware e = queue.poll();
                    if(e == null) 
                        print = false;
                    else
                        System.out.println(e.getOrder()+ " "+presents.get(e).size()+ " "+presents.get(e).peek()+" (s)");
                }
            }

            System.out.println();
        }

    }
}