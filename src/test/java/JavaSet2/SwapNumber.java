package JavaSet2;

public class SwapNumber {
    public static void main(String[] args) throws InterruptedException {
        int a=10;
        int b=20;
        int temp=0;

        System.out.println("Before Swapping a ="+a);
        System.out.println("Before Swapping b ="+b);
        temp=a;
        a=b;
        b=temp;

        System.out.println("After Swapping a ="+a);
        System.out.println("After Swapping b ="+b);

    }
}
