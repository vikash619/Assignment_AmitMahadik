package com.company;

@FunctionalInterface
interface addition{
    public abstract double add(double a, double b);
}

@FunctionalInterface
interface substraction{
    public abstract double substract(double a, double b);
}

@FunctionalInterface
interface multiplication{
    public abstract double multiply(double a, double b);
}

@FunctionalInterface
interface division{
    public abstract double divide(double a, double b);
}

public class Question1{
    public static void main(String [] args){
        System.out.println("addition");
        addition ad = (double a, double b) -> (a+b);
        System.out.println(ad.add(10,20));

        System.out.println("substraction");
        substraction sb = (double a, double b) -> (a-b);
        System.out.println(sb.substract(20,10));

        System.out.println("multiplication");
        multiplication mp = (double a, double b) -> (a*b);
        System.out.println(mp.multiply(10,20));

        System.out.println("division");
        division di = (double a, double b) -> (a/b);
        System.out.println(di.divide(10,2));
    }
}