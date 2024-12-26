package Strings;

public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println("Before Concat:"  +sb.capacity());
        sb.append("Test");
        sb.append("Automation for Web Application");
        System.out.println("Before Concat:"  +sb);
        System.out.println("Before Concat:"  +sb.capacity());

        StringBuffer sb1 = new StringBuffer("acdrt");
        sb1.reverse();
        System.out.println("Before Concat:"  +sb1);
        System.out.println("Before Concat:"  +sb1.insert(2,"A"));
    }
}
