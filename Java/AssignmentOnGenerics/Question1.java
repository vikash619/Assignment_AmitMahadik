package com.company;

import java.util.Set;
import java.util.HashSet;

class Employee{
    int id;
    String name;
    float salary;
    String department;

    public Employee(int id1, String name1, float salary1, String department1){
        id = id1;
        name = name1;
        salary = salary1;
        department = department1;
    };

    public void displayDetails(){
        System.out.println("ID "+id);
        System.out.println("Name "+name);
        System.out.println("Salary "+salary);
        System.out.println("Department "+department);
    }
}
public class Question1 {
    public static void main(String [] args){
        Set<Employee> set1 = new HashSet<>();
        set1.add(new Employee(1,"vikash",40000,"D1"));
        set1.add(new Employee(2,"Akash",80000,"D2"));

        for(Employee emp : set1){
            emp.displayDetails();
            System.out.println();
        }
    }
}
