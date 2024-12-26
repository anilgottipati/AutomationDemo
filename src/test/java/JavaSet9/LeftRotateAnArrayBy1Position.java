package JavaSet9;

import java.util.Arrays;

public class LeftRotateAnArrayBy1Position {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int size=a.length-1;
        for (int j=0;j<3;j++) {
            int last = a[0];
            for (int i = 0; i < size; i++) {
                a[i] = a[i + 1];
            }
            a[size] = last;
        }
        System.out.print(Arrays.toString(a));
    }
}
