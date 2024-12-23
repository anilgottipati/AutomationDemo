package JavaSet5;

public class SumofAllTheElementsInTheArray {

    public static void main(String[] args) throws InterruptedException {

        int[] a ={5,6,7};
        int num=0;
        for (int i=0;i<a.length;i++)
        {
            num=num+a[i];

        }
        System.out.println("Count Chracters"+ num);
    }
}
