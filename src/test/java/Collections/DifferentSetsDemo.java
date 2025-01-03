package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class DifferentSetsDemo {

    public static void main(String[] args) {
        Random obj = new Random();

        Set<Integer> hs = new HashSet<>();

        for (int i = 0; i <=5; i++) {
            int ele = obj.nextInt(100);
            System.out.println("Number" + ele);
            hs.add(ele);
        }
        //HashSet Won't Maintain the Order
        System.out.println("Before" + hs);

    }
}
