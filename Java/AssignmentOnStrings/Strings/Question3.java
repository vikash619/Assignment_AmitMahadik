public class Question3 {
    public static void main(String [] args){
        String str = "Java String pool refers to collection of Strings which are stored in heap";
        String str1 = str;
        System.out.println("Original "+str);
        System.out.println("lower case "+str.toLowerCase());
        System.out.println("lower case "+str.toUpperCase());
        System.out.println("replace 'a' with '$' "+str.replace('a', '$'));
        System.out.println("checking string matches or not :- "+str.equals(str1));
        System.out.println("Two method can use to check wether strings are equal are no 1) equals method 2) == operator");
    }
}
