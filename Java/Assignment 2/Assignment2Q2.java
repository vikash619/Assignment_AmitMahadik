package com.company;
import java.util.ArrayList;
import java.util.Scanner;

class Manager extends Assignment2Q2{
    int incentive = 5000;
    @Override
    public int getSalary(int Salary, int extraHours){
        return (incentive*extraHours)+Salary;
    }

    @Override
    public int totalEmployee(ArrayList<Integer> employeeSalaries){
        int total = 0;
        for(Integer i : employeeSalaries){
            total += i;
        }
        return total;
    }
}

class Labour extends Assignment2Q2{
    int overTime = 500;
    @Override
    public int getSalary(int Salary, int extraHours){
        return (overTime*extraHours)+Salary;
    }

    @Override
    public int totalEmployee(ArrayList<Integer> employeeSalaries){
        int total = 0;
        for(Integer i : employeeSalaries){
            total += i;
        }
        return total;
    }
}
public class Assignment2Q2 {
    public int getSalary(int Salary, int extraHours){
        return 0;
    };

    public int totalEmployee(ArrayList<Integer> employeeSalaries){
        return 0;
    }
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int Salary = 10000;

        Scanner sc = new Scanner((System.in));

        System.out.println("What are you ?");
        System.out.println("Press 'a' for Manager");
        System.out.println("Press 'b' for Labour");
        System.out.println("Press 'c' for exit");
        String choice = sc.next();
        char chr = choice.charAt(0);

        while(chr != 'c'){

            if(chr == 'a'){
                System.out.println("How many extra hours you worked");
                int extraHours = sc.nextInt();
                Manager m = new Manager();
                list.add(m.getSalary(Salary, extraHours));
            }

            if (chr == 'b'){
                System.out.println("How many extra hours you worked");
                int extraHours = sc.nextInt();
                Labour l = new Labour();
                list.add(l.getSalary(Salary, extraHours));
            }

            if(chr == 'c'){
                break;
            }

            System.out.println("What are you ?");
            System.out.println("Press 'a' for Manager");
            System.out.println("Press 'b' for Labour");
            System.out.println("Press 'c' for exit");

            choice = sc.next();
            chr = choice.charAt(0);
        }

        for(Integer l : list){
            System.out.println(l);
        }

        Manager m = new Manager();
        System.out.println("Total Salary of employees = "+m.totalEmployee(list));
    }
}
