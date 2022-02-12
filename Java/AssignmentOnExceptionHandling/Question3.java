package com.company;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String str){
        super(str);
    }
};

class IllegalBankTransaction extends Exception{
    public IllegalBankTransaction(String str){
        super(str);
    }
};

class Bank{
    int account_balance ;
    public Bank(int amount) {
        try {
            if (amount > 0) {
                account_balance = amount;
            } else {
                throw new IllegalBankTransaction("Account Balance Cab't be Negative");
            }
        } catch (IllegalBankTransaction ie) {
            System.out.println(ie);
        }
        account_balance = amount;
    };

    public void showBalance(){
        System.out.println("Current Balance "+account_balance);
    };

    public void withdraw(int withdraw_amount){
        try{
            try{
                if(withdraw_amount < 0){
                    throw new IllegalBankTransaction("Can't withdraw negative amount");
                }
            }catch(IllegalBankTransaction ie){
                System.out.println(ie);
            }

            if(withdraw_amount > account_balance){
                throw new InsufficientBalanceException("Insufficient Balance in account");
            }else{
                account_balance = account_balance - withdraw_amount;
                System.out.println("Take your amount "+withdraw_amount);
            }
        }catch(InsufficientBalanceException ie){
            System.out.println(ie);
        }
    };
}

public class Question3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you account balance");
        int amount = sc.nextInt();
        Bank b = new Bank(amount);

        int withdrawAmount;
        int choice = 1;
        int choice2;
        while(choice != 0){
            System.out.println("Press 0 for exit");
            System.out.println("Press 1 for withdraw");
            choice2 = sc.nextInt();

            if(choice2 == 1){
                System.out.println("Enter amount to withdraw");
                withdrawAmount = sc.nextInt();
                b.withdraw(withdrawAmount);
            }

            if(choice2 == 0){
                System.out.println("are you sure want to exit ? Press 0");
                choice = sc.nextInt();
            }
        }
    }
}
