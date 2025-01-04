package Sample;

import StaticvsNonStatic.StaticVariables;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

       String ele="Test Automation";
       String temp="";
        char[] ele1 = ele.toCharArray();
       for (int i=ele1.length-1;i>=ele1.length-3;i--)
       {
           temp= ele.charAt(i)+temp;
       }
        System.out.println("Count Characters "+ temp);
        }




    }
















