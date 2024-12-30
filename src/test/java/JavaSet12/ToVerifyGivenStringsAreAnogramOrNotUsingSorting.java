package JavaSet12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ToVerifyGivenStringsAreAnogramOrNotUsingSorting {

    public static void main(String[] args) {

        if (Anagrom("BAT", "TAB")) {
            System.out.print("Given Two Numbers Are Anogram");
        } else {
            System.out.print("Given Two Numbers Are Not Anogram");
        }

    }

    public static boolean Anagrom(String ele1, String ele2) {

        char[] a = ele1.toCharArray();
        char[] b = ele2.toCharArray();
        Arrays.sort(a); Arrays.sort(b);

        return Arrays.equals(a,b);


    }
}
