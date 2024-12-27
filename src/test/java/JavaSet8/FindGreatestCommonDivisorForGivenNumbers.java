package JavaSet8;

public class FindGreatestCommonDivisorForGivenNumbers {

    public static void main(String[] args) {

        int a= 6; int b= 12;

        int count=0;

        for (int i=1;i<=a && i<=b;i++)
        {
            if(a % i==0 && b % i==0)
            {
                count=i;
            }
        }
        System.out.println(count);




    }
}
