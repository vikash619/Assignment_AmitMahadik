package com.company;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Question2 {

    private int totalPrice;
    private String status;

    public Question2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public static ArrayList<Question2> orderList(ArrayList<Question2> orders){
        ArrayList<Question2> newList = orders.stream()
                .filter(e -> e.totalPrice > 1000)
                    .filter(e -> e.status.contains("ACCEPTED") || e.status.contains("COMPLETED"))
                        .collect(Collectors.toCollection(ArrayList::new));
        return  newList;
    }
    public static void main(String [] args) {
        ArrayList<Question2> aList = new ArrayList<Question2>(Arrays.asList(
                new Question2(1001, "ACCEPTED"),
                new Question2(2002, "COMPLETED"),
                new Question2(999, "REJECTED"),
                new Question2(3003, "COMPLETED")));

        orderList(aList).stream().forEach(e-> System.out.println("Status "+e.status+" "+"Total price "+e.totalPrice));
    }
}
