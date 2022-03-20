package com.company;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Product{
    int check = 10;
}
public class Question3 {

    static void modifyValue(int value){System.out.println(value * value);};
//    static class product(){return d;}
    static void display(){}

    public static void main(String [] args){
        Product fs = new Product();
        Supplier<Boolean> supplier = () -> fs.check > 5;
        System.out.println(supplier.get());

        Consumer<Integer> consumer = Question3::modifyValue;
        consumer.accept(17);

        Predicate<Integer> list = (e)-> e<10;
        Boolean result = list.test(7);
        System.out.println(result);

        Function<Integer,Integer> testing = (e) -> e + e;
        System.out.println(3);
    }
}
