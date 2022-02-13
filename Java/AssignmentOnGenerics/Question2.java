package com.company;

import java.util.HashMap;
import java.util.Map;
import java.lang.Math;
import java.util.Random;

public class Question2 {
    public static void main(String [] args){

        Map<Integer,Double> map1 = new HashMap<>();
        Random random = new Random();

        for(int i = 0; i < 10; i++){
            int temp = random.nextInt();
            double temp1 = random.nextDouble();
            map1.put(temp, temp1);
        }
    }
}
