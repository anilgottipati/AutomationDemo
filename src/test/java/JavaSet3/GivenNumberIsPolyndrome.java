package JavaSet3;

import Inheritance.ChildInheritance;

public class GivenNumberIsPolyndrome {
    public static void main(String[] args) throws InterruptedException {

        int ele=8912321;
        int rev=0;
        while(ele!=0)
        {
        int reminder=ele%10;

//        rev=0*10+reminder;
            rev=0+reminder;

        ele=ele/10;
            System.out.print(rev);
        }

    }

}
