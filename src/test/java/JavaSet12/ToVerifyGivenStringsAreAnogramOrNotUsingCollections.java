package JavaSet12;

import java.util.HashMap;
import java.util.Map;

public class ToVerifyGivenStringsAreAnogramOrNotUsingCollections {

    public static void main(String[] args) {

        if (Anagrom("BAZ","TAB"))
        {
            System.out.print("Given Two Numbers Are Anogram");
        } else
        {
            System.out.print("Given Two Numbers Are Not Anogram");
        }

    }

    public static boolean Anagrom(String ele1,String ele2){

        Map<Character,Integer> m1= new HashMap<Character,Integer>();
        Map<Character,Integer> m2= new HashMap<Character,Integer>();
        for (int i=0;i<ele1.length();i++)
        {
            char a = ele1.charAt(i);
            if (m1.get(a)==null)
            {
                m1.put(a,1);
            } else
            {
                m1.put(a, m1.get(a)+1);
            }
        }

        for (int i=0;i<ele2.length();i++)
        {
            char a = ele2.charAt(i);
            if (m2.get(a)==null)
            {
                m2.put(a,1);
            } else
            {
                m2.put(a, m2.get(a)+1);
            }
        }
        return m1.equals(m2);
    }

}
