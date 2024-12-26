package JavaSet5;

public class MissingElementInAnArray {
    public static void main(String[] args) {

        int[] a={1,2,3,4,6};

        int num=0;
        for (int i=0;i<=6;i++){
            num=num+i;
            System.out.println(num);
        }
        int Sum=0;
        for (int c: a){
            Sum=Sum+c;
            System.out.println(Sum);
        }
        System.out.println(num);
    }
}
