package JavaSet5;

import java.util.Arrays;

public class CompareTwoArraysWithoutBuildInMethods {
    public static void main(String[] args) {

        int[] a= {5,4,3,2,1};
        int[] b= {5,4,3,2,1};
boolean comparision =false;
        for (int i=0;i<a.length;i++) {


            if (a[i] != b[i]) {
                comparision = false;
                break;
            } else {
                comparision = true;
            }
        }

        if(comparision){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

    }
}
