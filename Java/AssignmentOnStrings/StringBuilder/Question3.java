package com.company;

public class Question3 {
    public static void main(String [] args){
        String str1 = "This method returns the reversed object on which it was called";
        StringBuilder sb = new StringBuilder(str1);
        System.out.println("original "+sb);
        System.out.println("reverse "+sb.reverse());
    }
}
