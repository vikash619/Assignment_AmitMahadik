package com.company;

class ArmstrongNumbetweenRange{
    static int getCube(int num){
        int cube = 1;
        for(int i=0; i<3; i++){
            cube = cube * num;
        }
        return cube;
    }
    public int [] armstrongNumbersInRange (int min, int max){
        int [] ArmStrongEle = new int[4];
        int index = 0;
        for(int i=min; i<max; i++){
            int sum = 0;
            int temp = i;
            while(temp != 0){
                int rem = temp % 10;
                sum = sum + getCube(rem);
                temp = temp / 10;
            }

            if(i == sum){
                ArmStrongEle[index] = i;
                index++;
            }
        }
        return ArmStrongEle;
    }
}

public class Assignment1Q2{
    public static void main(String [] args){
        int min = 100, max = 999;
        ArmstrongNumbetweenRange asr = new ArmstrongNumbetweenRange();
        int [] ArmStrongEle = asr.armstrongNumbersInRange(min,max);

        for(int index : ArmStrongEle){
            System.out.println(index);
        }
    }
}
