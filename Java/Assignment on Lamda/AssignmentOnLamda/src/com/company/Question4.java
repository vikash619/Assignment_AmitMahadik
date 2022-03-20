package com.company;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Question4 {

    public ArrayList<String> removeOddLengthString(ArrayList<String> employeeList){
        Predicate<String> odd = (e) -> e.length() % 2 != 0;
        employeeList.removeIf(odd);
        return employeeList;
    }
    public static void main(String [] args){
        ArrayList<String> employeeList = new ArrayList<String>();
        employeeList.add("vikash");
        employeeList.add("akash");
        employeeList.add("prakash");
        employeeList.add("yash");

        Question4 ob = new Question4();
        ArrayList<String> newList = ob.removeOddLengthString(employeeList);
        newList.forEach(e-> System.out.println(e));

    }
}
