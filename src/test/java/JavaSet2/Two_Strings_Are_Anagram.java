package JavaSet2;

import java.util.Arrays;

public class Two_Strings_Are_Anagram {
    public static void main(String[] args) throws InterruptedException {

        String ele1 = "How";
        String ele2 = "wHo";
        if (ele1.length()!=ele2.length())
        {
            System.out.println("Not Anogram");
        }
        String a=ele1.toLowerCase();
        String b=ele2.toLowerCase();
        char[] String1=a.toCharArray();
        char[] String2=b.toCharArray();

        Arrays.sort(String1);
        Arrays.sort(String2);
        System.out.println(String1);
        System.out.println(String2);
        if(Arrays.equals(String1,String2)==true)
        {
            System.out.println("TRUE");
        }


    }
}
