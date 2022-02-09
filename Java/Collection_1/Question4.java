package com.company;

import java.util.List;
import java.util.LinkedList;

public class Question4 {
    public static boolean leapOrNot(String str){
        String [] str1 = str.split("-");
        int year = Integer.parseInt(str1[2]);
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0){
                    return true;
                }else{
                    return false;
                }
            } else{
                return true;
            }
        }else{
            return false;
        }
    }
    public static void main(String [] args){
        List<String> list = new LinkedList<String>();
        list.add("19-04-1997");
        list.add("13-02-1999");
        list.add("23-02-2000");

        for(int i = 0; i < list.size(); i++){
            System.out.println(leapOrNot(list.get(i)));
        }
    }
}
