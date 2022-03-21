package main;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Trader1{
    private String name;
    private String city;

    public Trader1(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader1{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class Transaction{
    private Trader1 trader1;
    private int year;
    private int value;

    public Transaction(Trader1 trader1, int year, int value) {
        this.trader1 = trader1;
        this.year = year;
        this.value = value;
    }

    public Trader1 getTrader1() {
        return trader1;
    }

    public void setTrader1(Trader1 trader1) {
        this.trader1 = trader1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader1=" + trader1 +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
public class Question4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
        List<Transaction> newList = transactions.stream().filter(x -> x.getYear() == 2011).collect(Collectors.toList());
        return newList;
    }

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
        List<Integer> list = transactions.stream().filter(x -> x.getTrader1().getCity().equals("delhi")).map(x -> x.getValue()).collect(Collectors.toList());
        return list;
    }

    public static int highestTransaction(List<Transaction> transactions){
        Transaction max = transactions.stream().max(Comparator.comparing(Transaction::getValue)).orElse(null);
        return max.getValue();
    }

    public static int smallestTransaction(List<Transaction> transactions){
        Transaction min = transactions.stream().min(Comparator.comparing(Transaction:: getValue)).orElse(null);
        return min.getValue();
    }
    public static void main(String [] args){
        Trader1 t1 = new Trader1("vikash", "rishikesh");
        Trader1 t2 = new Trader1("prakash", "delhi");
        Trader1 t3 = new Trader1("aman", "delhi");
        Trader1 t4 = new Trader1("abhishek", "pune");

       List<Transaction> transactionList = new ArrayList<>(Arrays.asList(
               new Transaction(t1, 2011,200),
               new Transaction(t2, 2011,190),
               new Transaction(t3, 2009,180),
               new Transaction(t4, 2013,170)
       ));

        System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
        System.out.println(sortTransactions(transactionList));

        System.out.println("2. Print all transactions’ values from the traders living in Delhi.");
        System.out.println(transactionsValuesDelhi(transactionList));

        System.out.println("3. What’s the highest value of all the transactions?");
        System.out.println(highestTransaction(transactionList));

        System.out.println("4. Find the transaction with the smallest value.");
        System.out.println(smallestTransaction(transactionList));

    }
}
