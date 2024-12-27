package JavaSet8;

import java.util.*;

public class ReverseAnArrayUsingJavaCollections {

    public static void main(String[] args) {

        Integer[] a = {4,3,2,7,8,6};

        List<Integer> list = Arrays.asList(a);
        Collections.reverse(list);
        System.out.println(list);


    }
}
