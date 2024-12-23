package JavaSet4;

public class FindDuplicateElementsInArrayUsingIndex {
    public static void main(String[] args) throws InterruptedException {

        int[] a= {5,4,3,4,5,3,2,1};
        for(int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("Count Characters"+ a[i]);
                }
            }
        }
    }
}
