package Collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LinkedHashSet {

    public static void main(String[] args) {
        Random obj = new Random();

        Set<Integer> hs = new java.util.LinkedHashSet<>();

        for (int i = 0; i <=5; i++) {
            int ele = obj.nextInt(100);
            System.out.print("Number   " + ele);
            hs.add(ele);
        }
        //HashSet Won't Maintain the Order
        System.out.print("Before   " + hs);

    }
}
