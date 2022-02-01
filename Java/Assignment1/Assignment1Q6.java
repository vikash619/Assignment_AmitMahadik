package com.company;

import java.util.Scanner;

class Login{
    String userId = "Ajay";
    String password = "password";
    String credentialCheck = "";
    Scanner sc = new Scanner(System.in);

    public String loginUser(){
        int count = 3;

        while(count != 0) {
            System.out.println("Enter UserID");
            String userId1 = sc.nextLine();
            System.out.println("Enter Password");
            String password1 = sc.nextLine();

            int len1 = userId1.length();
            int len2 = password1.length();
            int len3 = userId.length();
            int len4 = password.length();

            if (userId.charAt(0) == userId1.charAt(0) && userId.charAt(len3 - 1) == userId1.charAt(len1 - 1)) {
                if (userId.equals(userId1)) {
                    if (password.charAt(0) == password1.charAt(0) && password.charAt(len4 - 1) == password1.charAt(len2 - 1)) {
                        if (password.equals(password1)) {
                            return credentialCheck = "Welcome "+userId;
                        }
                    }
                }
            } else {
                --count;
                System.out.println("You have entered wrong credential. please enter the right credential");
            }
        }
        return credentialCheck = "Please contact Admin";
    }
}
public class Assignment1Q6 {
    public static void main(String [] args){
        Login lg = new Login();
        System.out.println(lg.loginUser());
    }
}
