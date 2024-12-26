package Strings;

public class StringMethods {

    public static void main(String[] args) {
        String a ="Test Automation";
        System.out.println("Before Concat:"  +a.length());
        System.out.println("Before Concat:"  +a.indexOf("t"));
        System.out.println("Before Concat:"  +a.charAt(3));
        System.out.println("Before Concat:"  +a.substring(2));
        System.out.println("Before Concat:"  +a.substring(5,9));
        String[] ele = a.split(" ");
        for (int i=0;i<ele.length;i++)
        {
            System.out.println("Before Concat:"  +ele[i]);
        }

        System.out.println("Before Concat:"  +a.replace("T","A"));
    }
}
