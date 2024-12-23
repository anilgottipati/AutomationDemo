package JavaSet3;

public class PrintFibonacciSeriesNumber {
    public static void main(String[] args) throws InterruptedException {
        int a=0, b=1;
        int f=0;
        int Count=5;
        while(f<=Count)
        {
            f=a+b;
            a=b;
            b=f;
            System.out.print("  "+f);
        }

    }
}
