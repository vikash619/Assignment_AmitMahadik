package com.company;
import java.util.Map;
import java.util.TreeMap;

class Contact implements Comparable{
    private Long PhoneNumber;
    private String Name;
    private String Email;
    private Gender gender;
    public enum Gender{
        Male,Female;
    };

    public Contact(Long PhoneNumber, String Name, String Email, Gender gender){
        this.PhoneNumber = PhoneNumber;
        this.Name = Name;
        this.Email = Email;
        this.gender = gender;
    };

    @Override
    public String toString() {
        return "Contact{" +
                "PhoneNumber=" + PhoneNumber +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", gender=" + gender +
                '}';
    };

    public Long getPhoneNumber(){
        return PhoneNumber;
    };

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
public class Question1 {
    public  static void main(String [] args){
        Contact c1 = new Contact(7895961759L,"vikash", "vikash@gmail.com", Contact.Gender.Male);
        Contact c2 = new Contact(7895961758L,"Akash","akash@gmail.com",Contact.Gender.Male);

        Map<Long, Contact> m1 = new TreeMap<>();
        m1.put(c1.getPhoneNumber(), c1);
        m1.put(c2.getPhoneNumber(),c2);

        //first method to print key + value
//        m1.forEach((key,value)-> System.out.println(value));

        //Print Key
        for(Map.Entry<Long,Contact> c : m1.entrySet()){
            System.out.println("Key => "+c.getKey());
        };

        //Print value
        for(Map.Entry<Long,Contact> c : m1.entrySet()){
            System.out.println("Value => "+c.getValue());
        };

        //second method to print key + value
        for(Map.Entry<Long,Contact> c : m1.entrySet()){
            System.out.println("Key => "+c.getKey() + " Value => "+c.getValue());
        };
    }
}
