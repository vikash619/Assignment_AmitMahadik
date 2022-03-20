package com.company;
import java.util.Arrays;
import java.util.function.Consumer;

class Person{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Question8 {
    public static void main(String [] args){
        Thread t1 = new Thread(()-> {
            Arrays.asList(
                    new Person("vikash"),
                    new Person("akash"),
                    new Person("prakash")
            ).forEach((e) -> System.out.println(e.getName()));
        });

        t1.setName("list");
        t1.start();
    }
}
