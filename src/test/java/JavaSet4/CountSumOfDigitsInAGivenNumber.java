package JavaSet4;

public class CountSumOfDigitsInAGivenNumber {
    public static void main(String[] args) throws InterruptedException {

        int ele=545;
        int count=0;
        while(ele!=0)
        {
           int num=ele%10;
           count=count+num;
             ele=ele/10;
        }
        System.out.println("Count Characters"+ count);
    }
}
