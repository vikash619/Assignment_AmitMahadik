package com.company;
import java.util.Date;

class Pair<key,value>{

    public key key1;
    public value value1;

    public Pair(key key1,value value1){
       this.key1 = key1;
       this.value1 = value1;
    };

    public key getKey(){
        return key1;
    }

    public value getValue() {
        return value1;
    }
}

public class Question4 {
    public static void main(String [] args){

        //it will accept only String as key and value
        Pair<String,String> p = new Pair("1","Hello");

        System.out.println("key "+p.getKey());
        System.out.println("value "+p.getValue());

        //it will save today's Date as string value
        Pair<String, Date> p2 = new Pair("2", new java.util.Date());

        System.out.println("key "+p2.getKey());
        System.out.println("value "+p2.getValue());
    }
}
