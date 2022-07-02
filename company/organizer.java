package com.company;
import java.lang.*;
import java.util.ArrayList;


public class organizer {
    private ArrayList<CreditCards> totalCards;
    public organizer(){
        totalCards = new ArrayList<CreditCards>();
        }
    public void addCard(double dining, double travel, double groceries, double gas, double other, String name, String company){
        totalCards.add(new CreditCards( dining,  travel,  groceries,  gas,  other,  name,  company));
    }
    public String getCardData(int num){

        return totalCards.get(num).toString();
    }

    public String getAllCards(){
        String ans = "";
        for(int i = 0; i < totalCards.size(); i++){
            ans = ans+""+i+" "+totalCards.get(i).getName()+"\n";
        }
        return ans;

    }
    public String toString(){
        int din = 0;
        int tra = 0;
        int gro = 0;
        int ga = 0;
        int oth = 0;

        for(int i = 0; i<totalCards.size(); i++){
            if((totalCards.get(i).getDining() * totalCards.get(i).getPointvalue()) > (totalCards.get(din).getDining() * totalCards.get(din).getPointvalue())){
                din = i;
            }
            if((totalCards.get(i).getTravel() * totalCards.get(i).getPointvalue()) > (totalCards.get(tra).getTravel() * totalCards.get(tra).getPointvalue())){
                tra = i;
            }
            if((totalCards.get(i).getGroceries() * totalCards.get(i).getPointvalue()) > (totalCards.get(gro).getGroceries() * totalCards.get(gro).getPointvalue())){
                gro = i;
            }
            if((totalCards.get(i).getGas() * totalCards.get(i).getPointvalue()) > (totalCards.get(ga).getGas() * totalCards.get(ga).getPointvalue())){
                ga = i;
            }
            if((totalCards.get(i).getOther() * totalCards.get(i).getPointvalue()) > (totalCards.get(oth).getOther() * totalCards.get(oth).getPointvalue())){
                oth = i;
            }
        }
        return "Best cards to use at these categories\n\nDining : "+totalCards.get(din).getName()+"\nGas : "+totalCards.get(ga).getName()+"\nTravel : "+totalCards.get(tra).getName()+"\nGroceries : "+totalCards.get(gro).getName()+"\nOther : "+totalCards.get(oth).getName();

    }

    }


