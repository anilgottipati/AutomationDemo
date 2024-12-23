package JavaSet4;

public class CountNumberOfDigitsInAGivenNumber {
    public static void main(String[] args) throws InterruptedException {

        int ele=5456768;
        int count=0;
        while(ele!=0)
        {
            count++;
             ele=ele/10;
        }
        System.out.println("Count Characters"+ count);
    }
}
