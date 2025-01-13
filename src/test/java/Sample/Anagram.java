package Sample;

import StaticvsNonStatic.StaticVariables;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

         int[] a= {2,1,3,8,6,64,0};
            int max=a[0];
            int min=a[0];
         for (int i=0;i<a.length;i++)
         {

             if (max<a[i])
             {
                 max=a[i];
             }
             if (min>a[i])
             {
                 min=a[i];
             }

         }
        System.out.println(max);
        System.out.println(min);













    }

}














