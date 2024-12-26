package JavaSet5;

public class SearhForGivenElementInAnArray {
    public static void main(String[] args) throws InterruptedException {

        int[] a = {5, 6, 7, 8, 9};
        int num=9;
        for (int i = 0; i < a.length; i++) {

            if (num==a[i])
            {
                System.out.println("Found");
            }

        }
    }
}
