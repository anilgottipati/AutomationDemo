package JavaSet10;

public class MultiplyTheCorrespondingElementsOfTwoArrays {
    public static void main(String[] args) {

        int[] a ={1,2,3,4,5};
        int[] b ={5,4,3,2,1};
        String ele="";
        int size=a.length-1;

        for(int i=0;i<=size;i++)
        {
            ele=ele+a[i]*b[i];
            System.out.print(a[i]*b[i]+" ");
        }
//        System.out.print(ele);

    }
}
