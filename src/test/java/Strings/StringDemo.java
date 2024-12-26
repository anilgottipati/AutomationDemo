package Strings;

public class StringDemo {
    public static void main(String[] args)
    {
        String s1="Anil"; // String literal , we are assigning String literal directly to the String Object
        System.out.println(s1);
        //Since String is a Class, we can create a instance of it ,and the contructor is overloaded
        //to take different type of values
        String s2=new String("Anil");
        System.out.println(s2);
        char c[]= {'a','b','c'};
        String s3=new String(c);
        System.out.println(s3);
        byte b[]={65,66,67};
        String s4=new String(b);
        System.out.println(s4);
    }
}
