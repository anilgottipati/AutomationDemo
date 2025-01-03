package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(new Integer(20));
        //Use Interfaces on Left HandSide
        List<Integer> list1=new ArrayList<>();
        for (int i=10;i<=100;i=i+10)
        {
            list1.add(i);
        }
        System.out.println(list1);
        list1.add(2,100);
        System.out.println("After Add"+list1);
        list1.set(3,200);
        System.out.println("After Replacement"+list1);

        List<Integer> list2=new ArrayList<>();
        for (int i=11;i<=51;i=i+10)
        {
            list2.add(i);
        }
//Addall from SecondList
        System.out.println("After AddAll"+list1);
        list1.addAll(3,list2);
        System.out.println("After AddAll"+list2);
        System.out.println("After AddAll"+list1);
//Contains
        if(list1.contains(51))
        {

        }
//Size
        for (int i=0;i<=list1.size();i++)
        {
            System.out.println("After AddAll"+i);
        }
//Remove
            list1.remove(4);
    }
}
