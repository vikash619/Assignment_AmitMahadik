package com.company;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@interface Test{}

class A{

    @Test
    public void testing(){
        System.out.println("@Test applying on Method Level");
    }
}
public class Question1 {
    public static void main(String [] main){
        A a = new A();
        a.testing();
    }
}
