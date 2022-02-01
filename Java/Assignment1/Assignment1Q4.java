package com.company;

import java.util.Scanner;

class ResultDeclaration{
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks){
        String result = "";
        if(subject1Marks > 60 && subject2Marks > 60 && subject3Marks > 60){
            return result = "Passed";
        }else if((subject1Marks > 60 && subject2Marks > 60) || (subject2Marks > 60 && subject3Marks > 60) || (subject3Marks > 60 && subject1Marks > 60)){
            return result = "Promoted";
        }else{
            return result = "fail";
        }
    }
}
public class Assignment1Q4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double subject1Marks = sc.nextDouble();
        double subject2Marks = sc.nextDouble();
        double subject3Marks = sc.nextDouble();

        ResultDeclaration rd = new ResultDeclaration();
        System.out.println("Result = "+rd.declareResults(subject1Marks,subject2Marks,subject3Marks));
    }
}
