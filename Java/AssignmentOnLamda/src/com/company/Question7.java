package com.company;

import java.util.HashMap;

public class Question7 {
    public static void main(String [] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("surabh", 25000);
        map.put("harshit", 50000);
        map.put("adarsh", 50000);
        map.put("vikash", 0);

        Question7 ob = new Question7();
        System.out.println(ob.convertKeyValueToString(map));
    }

    public String convertKeyValueToString(HashMap<String , Integer> map){
        StringBuilder sb = new StringBuilder();
        map.entrySet().forEach((e)-> sb.append(e.getKey()).append("\n").append(e.getValue()).append("\n"));
        return sb.toString();
    }
}
