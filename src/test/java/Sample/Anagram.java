package Sample;

import StaticvsNonStatic.StaticVariables;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        String ele= "FLIPKART";
        String lastThreeChar="";
        for (int i=ele.length()-1;i>=ele.length()-3;i--)
        {
            lastThreeChar=ele.charAt(i)+lastThreeChar+"";
        }
        System.out.print(lastThreeChar);




    }
}












