package JavaSet9;

import java.util.Arrays;

public class RightRotateAnArrayBy3Positions {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int size=a.length-1;

        for (int j=0;j<3;j++) {
            int last=a[size];
            for (int i = size; i > 0; i--) {
                a[i] = a[i - 1];

            }
            a[0] = last;
        }
        System.out.print(Arrays.toString(a));
    }
}
