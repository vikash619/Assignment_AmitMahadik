package com.company;

class SearchArray{
    public boolean searchArray(int [] arr, int toCheckValue){
        boolean foundOrNot = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == toCheckValue){
                return foundOrNot = true;
            }
        }
        return foundOrNot;
    }
}
public class Assignment1Q7 {
    public static void main(String [] args){
        int [] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;

        SearchArray sa = new SearchArray();
        if(sa.searchArray(arr,valueToCheck)){
            System.out.println("Element Founded");
        }else{
            System.out.println("Element didn't founded");
        }
    }
}
