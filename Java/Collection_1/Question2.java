package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Set<Integer> s1 = new HashSet<>();

        for(int i=0; i<10; i++){
            int data = sc.nextInt();
            s1.add(data);
        };

        for(int i : s1){
            System.out.print(i+" ");
        }

    }
}
