package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        organizer user1 = new organizer();
        int entry = 1;
        System.out.println("Pointer");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        while(entry != 0) {
        System.out.print("\nPress 1 to enter a new card, 2 to view all cards in collection, 3 to view the best cards to maximise cash back, 4 to view card specifics, 0 to end the program: ");
        entry = input.nextInt();
        if(entry == 1){
            System.out.print("\nCards Name : ");
            String name = input2.nextLine();
            System.out.println("\nEnter the category points: ");
            System.out.print("Dining points: ");
            double dining = input.nextDouble();
            System.out.print("\nTravel points: ");
            double travel = input.nextDouble();
            System.out.print("\nGas points: ");
            double gas = input.nextDouble();
            System.out.print("\nGroceries points: ");
            double groceries = input.nextDouble();
            System.out.print("\nOther points: ");
            double other = input.nextDouble();
            System.out.print("\nCompany Name: ");
            String company = input2.nextLine();
            user1.addCard(dining, travel, groceries, gas, other, name, company);
        }
        if(entry == 2) {
            System.out.println("\n"+user1.getAllCards());
        }
        if (entry == 3){
            System.out.println(user1);
        }
        if (entry == 4){
            System.out.println("\n"+user1.getAllCards());
            System.out.println("Type the card number you want to see the data for: ");
            int cardNum = input.nextInt();
            System.out.println("\n"+user1.getCardData(cardNum));

        }

        if(entry != 2 && entry != 3 && entry != 4 && entry != 1 && entry != 0)
            System.out.println("\nPlease Try Again");
        }

        }

    }

