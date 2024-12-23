package Sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        int a=123344;
        String ele3 = Integer.toString(a);
        String ele = "AAniLL";

        char[] ele1 = ele3.toCharArray();
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for (Character c : ele1) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);

            } else {
                m.put(c, 1);
            }
        }

        for (Character c : m.keySet()) {
            if (m.get(c) > 1) {
                System.out.println("After Swapping1 a ="+c);
            }
        }

    }
}
