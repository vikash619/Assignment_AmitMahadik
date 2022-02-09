package com.company;
import java.util.Comparator;
import java.lang.Comparable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
    public Integer ID;
    public String Name;
    public String Department;
    public Double Salary;

    public Employee(Integer ID, String Name, String Department, Double Salary){
        this.ID = ID;
        this.Name = Name;
        this.Department = Department;
        this.Salary = Salary;
    };

    public Integer getID(){
        return ID;
    }

    public String getName(){
        return Name;
    }

    public String getDepartment(){
        return Department;
    }

    public Double getSalary(){
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Department='" + Department + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getID().compareTo(o.getID());
    }
}

class SortByID implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getID().compareTo(o2.getID());
    }
}

class SortByName implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByDepartment implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }
}

class SortBySalary implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
}

public class Question3 {
    public static void main(String [] args){

        Employee e1 = new Employee(1, "vikash","A1",40000.0);
        Employee e2 = new Employee(2, "akash","B1",50000.0);
        Employee e3 = new Employee(3, "prakash","C1",30000.0);
        Employee e4 = new Employee(4, "avinash","D1",35000.0);

        System.out.println("Press 'a' to sort by ID");
        System.out.println("Press 'b' to sort by Name");
        System.out.println("Press 'c' to sort by Department");
        System.out.println("Press 'd' to sort by Salary");

        System.out.println();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        switch (str){
            case "a" : Set<Employee> emp = new TreeSet<Employee>(new SortByID());
                       emp.add(e1);
                       emp.add(e2);
                       emp.add(e3);
                       emp.add(e4);

                       for(Employee e : emp){
                           System.out.println(e);
                       }
                       break;

            case "b" : Set<Employee> emp1 = new TreeSet<Employee>(new SortByName());
                emp1.add(e1);
                emp1.add(e2);
                emp1.add(e3);
                emp1.add(e4);

                for(Employee e : emp1){
                    System.out.println(e);
                }
                break;

            case "c" : Set<Employee> emp2 = new TreeSet<Employee>(new SortByDepartment());
                emp2.add(e1);
                emp2.add(e2);
                emp2.add(e3);
                emp2.add(e4);

                for(Employee e : emp2){
                    System.out.println(e);
                }
                break;

            case "d" : Set<Employee> emp3 = new TreeSet<Employee>(new SortBySalary());
                emp3.add(e1);
                emp3.add(e2);
                emp3.add(e3);
                emp3.add(e4);

                for(Employee e : emp3){
                    System.out.println(e);
                }
                break;
        }
    }
}
