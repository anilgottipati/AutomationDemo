package JavaSet12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeativeCharInAGivenString {

    public static void main(String[] args) {

        String a ="AMAZON";
        String ele = a.toLowerCase();
        char[] ele1 = ele.toCharArray();

        Map<Character,Integer> m= new HashMap<Character,Integer>();

        for (Character c :ele1)
        {
            if (m.containsKey(c))
            {
                m.put(c, m.get(c)+1);
            } else
            {
                m.put(c,1);
            }
        }

        for (int i=0;i<ele.length();i++)
        {
            char ele11 = ele.charAt(i);

            if(m.get(ele11)==1)
            {
                System.out.println("Character"+ele11+ "Repeated for");
                break;
            }
        }

    }
}
