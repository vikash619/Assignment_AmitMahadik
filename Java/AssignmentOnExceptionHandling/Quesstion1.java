package com.company;
import java.util.Scanner;

class DivideByZero{
    //this function will throw exception when divide by zero will happen
    public void divideByZero(int a, int b){
        try{
            int c = a / b;
            System.out.println(c);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }
    }
}

public class Quesstion1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        DivideByZero dbz = new DivideByZero();
        dbz.divideByZero(a,b);
    }
}
