package com.company;
import java.util.Scanner;

public class Question2
{
    static void validate (int a, int b){
        if(b == 0){
            throw new UnsupportedOperationException("Can not be divided by zero");
        }
        else {
            int c  = a / b;
            System.out.println(c);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try
        {
            validate(a,b);
        }
        catch (UnsupportedOperationException ex)
        {
            System.out.println("Can't divide by zero");
        }
    }
}