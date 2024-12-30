package JavaSet12;

public class GivenNumberIsPowerOfFour {

    public static void main(String[] args) {

        int num=64;

        while(num>0)
        {
            int reminder=num%4;
            if(reminder!=0)
            {
                break;
            }
            num=num/4;
            if(num==1)
            {
                System.out.print("Given Number Is Power of 4");
            }

        }
    }
}
