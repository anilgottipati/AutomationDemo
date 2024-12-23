package JavaSet2;

import java.util.HashMap;
import java.util.Map;

public class SwapNumberDelete {

    public static void main(String[] args)
    {
        String name="HAniAH";
        char[] a=name.toCharArray();
        Map<Character,Integer> m= new HashMap<Character,Integer>();

        for(Character c:a)
        {
            if(m.containsKey(c))
            {
                m.put(c, m.get(c)+1);
            } else {
                m.put(c,1);
            }
        }
        for(Character c:m.keySet())
        {
            if(m.get(c)>1)
            {
                System.out.println("Character"+c+ "Repeated for" +m.get(c));
            }
        }
    }
}
