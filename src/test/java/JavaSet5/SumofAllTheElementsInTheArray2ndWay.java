package JavaSet5;

public class SumofAllTheElementsInTheArray2ndWay {

    public static void main(String[] args) throws InterruptedException {

        int[] a ={5,6,7};
        int num=0;
        for (int c: a)
        {
            num=num+c;
        }

        System.out.println("Count Chracters"+ num);
    }
}
