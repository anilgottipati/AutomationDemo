package JavaSet2;

public class PowerOfNumber {
    public static void main(String[] args) throws InterruptedException {
        int Count = 3;
        int finalNum=Count;
       for (int i=0;i<=3;i++)
       {
           Count=finalNum*Count;

       }
        System.out.println("Power of Number"+Count);
    }
}