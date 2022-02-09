package com.company;
import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3{
    int totalDeposit = 10000;
    int creditLimit = 2000;

    @Override
    public int getCash(){
        return totalDeposit+creditLimit;
    }
}

class SavingsAccount extends Assignment2Q3{
    int totalDeposit = 10000;
    int fixedDeposit = 5000;

    @Override
    public int getCash(){
        return totalDeposit+fixedDeposit;
    }
}
public class Assignment2Q3 {
    public static int totalCashInBank(ArrayList<Integer> list){
        int totalCash = 0;
        for(Integer i : list){
            totalCash += i;
        }
        return 0;
    }
    public int getCash(){
        return 0;
    }
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new CurrentAccount().getCash());
        list.add(new SavingsAccount().getCash());

        for(Integer i : list){
            System.out.println(i);
        }
    }
}
