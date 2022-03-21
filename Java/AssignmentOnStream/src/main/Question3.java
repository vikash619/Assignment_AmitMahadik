package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Trader{
    private String name;
    private String city;

    public Trader(String name, String city) {
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
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class Question3 {
    public static List<String> printUniqueCities (List <Trader> traders) {
        List<String> unique_city = traders.stream().map(x -> x.getCity()).distinct().collect(Collectors.toList());
        return unique_city;
    }

    public static List<String> tradersFromPuneSortByName(List<Trader> traders) {
        List<String> trader_pune = traders.stream().filter(x -> x.getCity().equals("pune")).map(x -> x.getName()).collect(Collectors.toList());
        return trader_pune;
    }

    public static String allTrader3Names(List<Trader> traders) {
        String trader_names = traders.stream().map(x -> x.getName()).sorted().reduce("",(a,b) -> a+ " "+b);
        return trader_names;
    }

    public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) {
        ArrayList<Trader> trader_in_indore = traders.stream().filter(x -> x.getCity().equals("indore")).collect(Collectors.toCollection(ArrayList::new));
        return trader_in_indore;
    }

    public static void main(String [] args){
        List<Trader> traderList = new ArrayList<Trader>(Arrays.asList(
                new Trader("vikash", "indore"),
                new Trader("akash", "indore"),
                new Trader("rashu", "shyampur"),
                new Trader("aman", "raiwala"),
                new Trader("abhishek", "pune"),
                new Trader("shubham", "pune"),
                new Trader("gaurav", "pune")
        ));

        System.out.println("1. What are all the unique cities where the traders work? ");
        System.out.println(printUniqueCities(traderList));

        System.out.println("2. Find all traders from Pune and sort them by name.");
        System.out.println(tradersFromPuneSortByName(traderList));

        System.out.println("3. Return a string of all traders’ names sorted alphabetically.");
        System.out.println(allTrader3Names(traderList));

        System.out.println("4. Are any traders based in Indore?");
        System.out.println(areAnyTradersFromIndore(new ArrayList<Trader>(traderList)));
    }
}
