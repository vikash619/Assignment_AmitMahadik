package com.company;
import java.util.Scanner;

class ArmstrongOrNot{
    static int getCube(int num){
        int cube = 1;
        for(int i=0; i<3; i++){
            cube = cube * num;
        }
        return cube;
    }
    public boolean armstrongCheck(int num){
        boolean armOrNot = false;
        int temp = num;
        int sum = 0;
        while(temp != 0){
            int rem = temp % 10;
            sum = sum + getCube(rem);
            temp = temp / 10;
        }
        if(num != sum){
            return armOrNot;
        }
        return armOrNot = true;
    }
}

public class Assignment1Q1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        ArmstrongOrNot number = new ArmstrongOrNot();
        boolean armOrNot = number.armstrongCheck(num);
        System.out.println(num+" Number is ArmStrong True/False : "+" "+armOrNot);
    }
}
