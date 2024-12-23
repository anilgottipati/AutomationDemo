package JavaSet4;

public class GivenNumberIsArmstrong {
    public static void main(String[] args) {

        int no=153;
        int rev=0;
        while(no!=0)
        {
            int num=no%10;
        rev=rev+(num*num*num);
        no=no/10;
        }
        System.out.println(rev);
    }
}
