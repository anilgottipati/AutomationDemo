package JavaSet4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesWithHashSet {

    //HashSet won't hold the duplicate Values
    public static void main(String[] args) throws InterruptedException {
        int[] a={5,5,6,7,6,7,1,2,3,4};

        Set<Integer> m = new HashSet<Integer>();
        for (int i=0;i<a.length;i++)
        {
            m.add(a[i]);
        }
        System.out.println("Count Chracters"+ m);
        Integer[] ele = m.toArray(new Integer[m.size()]);
        System.out.println("Count Chracters1"+ Arrays.toString(ele));
    }
}
