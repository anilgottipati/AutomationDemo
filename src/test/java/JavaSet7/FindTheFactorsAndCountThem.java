package JavaSet7;

public class FindTheFactorsAndCountThem {

    public static void main(String[] args) {

        int num= 12;
        int Count=0;
        for (int i=1;i<=num;i++){

            if(num % i==0){
                System.out.println("Total"+i+" ");
                Count++;
            }

        }
        System.out.println("The given number has "+Count +" factors");
    }
}
