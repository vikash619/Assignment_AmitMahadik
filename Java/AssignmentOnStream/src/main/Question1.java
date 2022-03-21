package main;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Fruit{
    private String name;
    private int calories;
    private int price;
    private String color;

    public Fruit() {
        super();
    }

    public Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

class Calories implements Comparator<Fruit>{

    @Override
    public int compare(Fruit o1, Fruit o2) {
        Fruit f1 = (Fruit) o1;
        Fruit f2 = (Fruit) o2;
        Integer i1 = f1.getCalories();
        Integer i2 = f2.getCalories();
        return i2.compareTo(i1);
    }
}

class Colors implements Comparator<Fruit>{

    @Override
    public int compare(Fruit o1, Fruit o2) {
        Fruit f1 = (Fruit) o1;
        Fruit f2 = (Fruit) o2;
        String i1 = f1.getColor();
        String i2 = f2.getColor();
        return i1.compareTo(i2);
    }
}

class Price implements Comparator<Fruit>{

    @Override
    public int compare(Fruit o1, Fruit o2) {
        Fruit f1 = (Fruit) o1;
        Fruit f2 = (Fruit) o2;
        Integer i1 = f1.getPrice();
        Integer i2 = f2.getPrice();
        return i1.compareTo(i2);
    }
}


public class Question1 {
    public static List<String> reversort(ArrayList<Fruit> fruit){
        List<String> newFruits = fruit.stream().filter((e)-> e.getCalories() < 100)
                .sorted(new Calories())
                    .map((e) -> e.getName())
                        .collect(Collectors.toList());
        return  newFruits;
    }

    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits){
        ArrayList<Fruit> list = fruits.stream().sorted(new Colors()).collect(Collectors.toCollection(ArrayList::new));
        return fruits;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
        ArrayList<Fruit> list = fruits.stream().filter(e-> e.getColor() == "Red").sorted(new Price()).collect(Collectors.toCollection(ArrayList::new));
        return list;
    }

    public static void main(String [] args){
        ArrayList<Fruit> fruits = new ArrayList<Fruit>(
                Arrays.asList(
                        new Fruit("Apple",70,5,"Red"),
                        new Fruit("Lichi",75,6,"Red"),
                        new Fruit("Guava",80,7,"Green"),
                        new Fruit("Grapes",85,4,"Green"),
                        new Fruit("Banana",90,9,"Yellow")
                )
        );


        System.out.println("1. Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.");
        System.out.println(reversort(fruits));

        System.out.println("2. Display color wise list of fruit names.");
        ArrayList<Fruit> fr = sort(fruits);
        fr.forEach((e)-> System.out.println(e.getColor()+" -> "+e.getName()));

        System.out.println("3. Display only RED color fruits sorted as per their price in ascending order.");
        ArrayList<Fruit> RED = filterRedSortPrice(fruits);
        RED.forEach((e)-> System.out.println(e.getColor()+" -> "+e.getPrice()));


    }
}
