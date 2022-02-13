package com.company;

public class Question1{
    public static void main(String [] args) {
        String str1 = "StringBuffer";
        String str2 = "“is a peer class of String";
        String str3 = "that provides much of";
        String str4 = "the functionality of strings";

        StringBuffer sb = new StringBuffer();
        sb.append(str1);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);

        System.out.println(sb);

    }
}
