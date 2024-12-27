package Sample;

import StaticvsNonStatic.StaticVariables;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        int number = 12;
        int countOfFactors = 0;
        for(int i=1;i<=number;i++) {
            if(number %i == 0) {
                System.out.println(i);
                countOfFactors++;
            }

        }
        System.out.println("The given number has "+countOfFactors +" factors");
}

}










