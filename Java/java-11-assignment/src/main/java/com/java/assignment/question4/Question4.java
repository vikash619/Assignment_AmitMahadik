package com.java.assignment.question4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {
	public static void main(String [] args) throws FileNotFoundException {
		File file = new File("D:\\Capgemini Assignment\\java11\\java-11-assignment\\src\\main\\java\\com\\java\\assignment\\question4\\StudentList.txt");

		StringBuilder stringBuilder = new StringBuilder();
		
		ArrayList<String> list = new ArrayList<String>();
		try (Scanner in = new Scanner(file)) {
            while (in.hasNext()) {
                String line = in.nextLine();
//                System.out.println(line);
                if (!line.trim().isEmpty())
                    stringBuilder.append(line).append(" ");
                else { //this is where new line happens -> store the combined string to arrayList
                    list.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                }
            }
            
            //Below is to handle the last line, as after the last line there is NO empty line
            if (stringBuilder.length() != 0) {
                list.add(stringBuilder.toString());
            } //end if
            
            for (int i=0; i< list.size(); i++) {
                System.out.println(list.get(i));
            } //end for
            
        } catch (FileNotFoundException e) {
            System.out.println("Not found file: " + file);
        }
	}
}
