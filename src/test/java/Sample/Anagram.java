package Sample;

import StaticvsNonStatic.StaticVariables;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        int[] a= {1,2,3,4,4,5,5,6,7,8,9,9};
        int j=0;
        Set<Integer> m= new HashSet<Integer>();
        for (int i=0;i<a.length;i++){

                m.add(a[i]);

            }
        System.out.println("Count Characters" +m);
        }




    }
















