package JavaSet9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RightRotateAnArrayBy1Position {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int size=a.length-1;
        int last=a[size];
        for (int i=size;i>0;i-- )
        {
            a[i]=a[i-1];

        }
        a[0]=last;
        System.out.print(Arrays.toString(a));
    }
}
