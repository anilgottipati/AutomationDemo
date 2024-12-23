package JavaSet5;

import java.util.Arrays;

public class CompareTwoArrays {
    public static void main(String[] args) {

        int[] a= {5,4,3,2,1,0};
        int[] b= {5,4,3,2,1};

        if (Arrays.equals(a,b)==true){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}
