package Sample;

import StaticvsNonStatic.StaticVariables;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        int[] a = {5,4,1,2,6};
        int size =a.length-1;
        int last=a[size];
        for (int i=size;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=last;
        System.out.print(Arrays.toString(a));




    }
}












