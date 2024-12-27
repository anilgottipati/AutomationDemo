package JavaSet14;

import java.util.Arrays;

public class PrintAlphabetPatternABBCCC {
    public static void main(String[] args) {
        int letter=65;

        for (int i=0;i<=5;i++)
        {

            for (int j=0;j<=i;j++)
            {
                System.out.print((char)(letter+i)+" ");
            }
            System.out.println();
        }
    }

}
