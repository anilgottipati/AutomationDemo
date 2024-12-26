package JavaSet15;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortArrayInDecendingOrderUsingBuiltInFunctions {

    public static void main(String[] args) {

        int[] a ={4,3,5,2,7,6,9};
        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
        Integer[] b ={4,3,5,2,7,6,9};
        Arrays.sort(b, Collections.reverseOrder());
        System.out.print(Arrays.toString(b));
    }
}
