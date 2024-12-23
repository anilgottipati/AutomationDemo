package JavaSet4;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesWithHashSet {

    //HashSet won't hold the duplicate Values
    public static void main(String[] args) throws InterruptedException {
        int[] a={5,5,6,7,6,7,1,2,3,4};
        int rev=0;
        Set<Integer> m = new HashSet<Integer>();
        for (int i=0;i<a.length;i++)
        {
            if(m.add(a[i])==false)
            {
                System.out.println("Count Chracters"+ a[i]);
            }
//            if(m.contains(a[i]))
//            {
//               rev=0+a[i];
//                System.out.println("Count Chracters"+ rev);
//            } else {
//                m.add(a[i]);
//            }
        }


    }
}
