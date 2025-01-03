package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(new Integer(20));

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println("After"+itr.next());
        }

        }
    }

