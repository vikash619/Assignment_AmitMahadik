package com.company;

import java.util.Arrays;
import java.util.List;

public class Question5 {
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String [] args){
        Question5 ob = new Question5();
        System.out.println(ob.processWords(ob.list));
    }

    public String processWords(List<String>list){
        StringBuilder sb = new StringBuilder();
        list.forEach((e)-> sb.append(e.charAt(0)));
        return sb.toString();
    }
}
