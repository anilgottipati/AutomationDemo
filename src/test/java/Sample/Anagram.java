package Sample;

import StaticvsNonStatic.StaticVariables;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {

        int[] a = {3, 4, 3, 6, 9, 8};
        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }

        }
        System.out.println("Minimum Number"+max);
        System.out.println("Minimum Number"+min);

    }
}
