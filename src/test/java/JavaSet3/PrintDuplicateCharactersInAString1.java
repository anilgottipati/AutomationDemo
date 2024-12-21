package JavaSet3;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharactersInAString1 {

    public static void main(String[] args)
    {
        String ele="HHHHHow How Are Are";
        char[] ele1 = ele.toCharArray();

       Map<Character,Integer> m=new HashMap<Character,Integer>();
       for (Character c: ele1)
       {
           if(m.containsKey(c))
           {
               m.put(c,m.get(c)+1);
           } else {
               m.put(c,1);
           }
       }
       for (Character c:m.keySet())
       {
           if(m.get(c)>1)
           {
               System.out.println("Character"+c+ "Repeated for" +m.get(c));
           }
       }

    }

}
