package JavaSet9;

import java.util.Arrays;

public class SwapFirstAndLastArray {
    public static void main(String[] args) {

        int[] a= {5,4,6,7,9};
        int temp=a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp;
        System.out.print(Arrays.toString(a));

    }
}
