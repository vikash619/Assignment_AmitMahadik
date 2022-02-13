package com.company;

import java.sql.Array;

class Swapping<T1>{
    public <T1> void swapping(Integer arr[], Integer a, Integer b){
       Integer temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
        for(Integer i : arr){
            System.out.println(i);
        }
    }
}
public class Question3 {

    public static void main(String [] args){
        Swapping<Integer> sw = new Swapping<>();
        Integer arr[] = new Integer[]{1,2,3};
        sw.swapping(arr,0,1);

    }
}
