package com.company;
import java.util.List;
import java.util.function.UnaryOperator;

class Example implements UnaryOperator<String>{
    @Override
    public String apply(String str) {
        return str.toUpperCase();
    }
}
public class Question6 {
    public static void main(String [] args){
        List<String> list = List.of("vikas,akash,prakash");
        Question6 ob = new Question6();

    }
    public List<String> convertToUpperCase(List<String> list){
        list.replaceAll(new Example());
        return list;
    }
}
