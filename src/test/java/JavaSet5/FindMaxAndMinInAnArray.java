package JavaSet5;

public class FindMaxAndMinInAnArray {
    public static void main(String[] args) {
        int[] a ={1,5,4,7,8,10};
        int max=a[0];
        int min=a[0];
        for (int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }

            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Minimum Number"+max);
        System.out.println("Minimum Number"+min);
    }
}