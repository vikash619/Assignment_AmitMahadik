package com.company;

import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost();
}

class Candy extends DesertItem {
    int Candies = 0;
    int cost = 80;

    public int addCandies(int candies){
        Candies = Candies + candies;
        return Candies;
    }

    @Override
    public int getCost(){
        return cost;
    }

}
class Cookie extends DesertItem {
    int Cookies = 0;
    int cost = 70;

    public int addCookies(int candies){
        Cookies = Cookies + candies;
        return Cookies;
    }

    @Override
    public int getCost(){
        return cost;
    }
}
class IceCream extends DesertItem {
    int iceCreams = 0;
    int cost = 90;

    public int addIceCreams(int candies){
        iceCreams = iceCreams + candies;
        return iceCreams;
    }

    @Override
    public int getCost(){
        return cost;
    }
}

public class Assignment2Q7 {

    private void selectRole(){
        System.out.println("Enter your role a) Owner b) Customer");
        Scanner sc = new Scanner(System.in);
        String role_of_person = sc.nextLine();

        if(role_of_person.equalsIgnoreCase("Owner")){
            roles("Owner");
        }else if(role_of_person.equalsIgnoreCase("Customer")){
            roles("Customer");
        }
    }

    private void roles(String roles){
        if(roles == "Owner"){
            addItem();
        }else if(roles == "Customer"){
            placeOrder();
        }
    }

    private void addItem(){
        System.out.println("1. Add Candies");
        System.out.println("2. Add Cookies");
        System.out.println("3. Add IceCream");

        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();
        if(selection == 1){
            addItemOperation(1);
        }else if(selection == 2){
            addItemOperation(2);
        }else if(selection == 3){
            addItemOperation(3);
        }else{
            System.out.println("Not a valid input...please try again");
        }
    }

    private void addItemOperation(int selected){
        Scanner sc = new Scanner(System.in);

        if(selected == 1){
            int quantity = 0;
            System.out.println("Number of Candies want to add ");
            quantity = sc.nextInt();

            Candy candy = new Candy();
            candy.addCandies(quantity);
            System.out.println("added successfully");
        }else if(selected == 2){
            int quantity = 0;
            System.out.println("Number of Cookies want to add ");
            quantity = sc.nextInt();

            Cookie cookie = new Cookie();
            cookie.addCookies(quantity);
            System.out.println("added successfully");
        }else if (selected == 3){
            int quantity = 0;
            System.out.println("Number of iceCream want to add ");
            quantity = sc.nextInt();

            IceCream iceCream = new IceCream();
            iceCream.addIceCreams(quantity);
            System.out.println("added successfully");
        }else{
            System.out.println("Please provide valid input");
        }
    }

    private void placeOrder(){
        System.out.println("1.Buy Candy");
        System.out.println("2.Buy Cookie");
        System.out.println("3.Buy IceCream");

        Scanner sc = new Scanner(System.in);
        int choosen = sc.nextInt();

        if(choosen == 1){
            placeOrderOperation(1);
        }else if (choosen == 2){
            placeOrderOperation(2);
        }else if(choosen == 3){
            placeOrderOperation(3);
        }else{
            System.out.println("Provide valid input");
        }
    }

    private void placeOrderOperation(int operation){
        Scanner sc = new Scanner(System.in);

        if(operation == 1){
            System.out.println("How much quantity uh want ?");
            int quantity = sc.nextInt();
            Candy c = new Candy();
            int cost = quantity * c.getCost();
            System.out.println("Pay $ "+cost/80);
        }else if(operation == 2){
            System.out.println("How much quantity uh want ?");
            int quantity = sc.nextInt();
            Cookie c = new Cookie();
            int cost = quantity * c.getCost();
            System.out.println("Pay $ "+cost/70);
        }else if(operation == 3){
            System.out.println("How much quantity uh want ?");
            int quantity = sc.nextInt();
            IceCream ic = new IceCream();
            int cost = quantity * ic.getCost();
            System.out.println("Pay $ "+cost/90);
        }else{
            System.out.println("Not a valid input");
        }
    }

    public static void main(String[] args) {
        Assignment2Q7 a = new Assignment2Q7();
        a.selectRole();
    }
}
