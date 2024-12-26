package JavaSet4;

import java.util.Arrays;

public class DeleteDuplicatesFromSortedArrayUsingIndex {
    public static void main(String[] args) {

        int[] a ={1,2,2,3,4,4,5,6,7,7,8,8,9};

        int size=a.length-1;
        int j=0;
        for (int i=0;i<size;i++)
        {
            if (a[i]!=a[i+1])
            {
               a[j]=a[i];
               j++;
            }

        }
        a[j]=a[a.length-1];
//        System.out.print(Arrays.toString(a));
        for (int k=0;k<=j;k++)
        {
            System.out.print(a[k]+ " ");
        }
    }
}
