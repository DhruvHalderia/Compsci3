package com.company;

public class CreditCards {
    private double dining, gas, travel, groceries, other;
    private double pointvalue;
    private String name, company;

    public CreditCards(double d, double t, double gr, double g, double o, String n, String c) {
        dining = d;
        gas = g;
        travel = t;
        groceries = gr;
        name = n;
        company = c;
        other = o;

        switch (company) {
            case "Chase":
            case "American Express":
                pointvalue = .02;
                break;
            case "Citi":
            case "Wells Fargo":
            case "Capital One":
            case "Bank of America":
                pointvalue = .01;
                break;
        }
    }

    public String getName(){
        return name;
    }

    public double getDining(){
        return dining;
    }

    public double getGas(){
        return gas;
    }

    public double getTravel(){
        return travel;
    }

    public double getGroceries(){
        return groceries;
    }

    public double getOther(){
        return other;
    }

    public double getPointvalue(){ return pointvalue;}

    public String toString(){
           return ""+name+"\nDining : "+dining+"\nGas : "+gas+"\nTravel : "+travel+"\nGroceries : "+groceries+"\nOther : "+other;
        }

    }

