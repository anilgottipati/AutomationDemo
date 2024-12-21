package JavaSet2;

public class EvenNumber {
    public static void main(String[] args) throws InterruptedException {

        int finalNum=0;
       for (int i=1;i<=10;i++)
       {
           if(i%2==0)
           {
               finalNum=finalNum+i;
           }

       }
        System.out.println("Power of Number"+finalNum);
    }
}
