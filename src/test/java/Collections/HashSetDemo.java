package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Random obj=new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0;i<10;i++)
        {
            int ele = obj.nextInt(5);
            list.add(ele);
        }
        System.out.println("Before"+list);

        Set<Integer> s=new HashSet<>(list);
        System.out.println("After"+s);
    }

}
