package com.company;
import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
        double taxAmount;
        if(ctc >= 500000 && ctc < 1000000){
            taxAmount = (30 * ctc) / 100;
        }else if(ctc >= 300000 && ctc < 500000){
            taxAmount = (20 * ctc) / 100;
        }else if(ctc >= 181000 && ctc < 300000){
            taxAmount = (10 * ctc) / 100;
        }else{
            taxAmount = 0;
        }
        return taxAmount;
    }
}
public class Assignment1Q5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int ctc = sc.nextInt();

        TaxAmount ta = new TaxAmount();
        System.out.println("Tax Amount "+ta.calculateTaxAmount(ctc));
    }
}
