package com.company;

import java.util.Scanner;
import java.lang.Math;

class SiCi{
    public double simpleInterest(double principalAmount, int time, double interestRate){
        double simpleInterest = (principalAmount * interestRate * time)/100;
        return simpleInterest;
    }

    public double compoundInterest(double principalAmount, int time, double interestRate){
        double compoundInterest = principalAmount * Math.pow((1+interestRate/100),time);
        return compoundInterest;
    }
}
public class Assignment1Q3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double principalAmount = sc.nextDouble();
        int time = sc.nextInt();
        double interestRate = sc.nextDouble();

        SiCi sici = new SiCi();
        System.out.println("Simple Interest = "+sici.simpleInterest(principalAmount,time,interestRate));
        System.out.println("Compound Interest = "+sici.compoundInterest(principalAmount,time,interestRate));
    }
}
