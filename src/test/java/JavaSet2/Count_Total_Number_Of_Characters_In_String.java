package JavaSet2;



public class Count_Total_Number_Of_Characters_In_String {

    public static void main(String[] args) throws InterruptedException {

        String ele = "EWABAAB";

        for (int i=0;i<ele.length();i++)

        {
            for (int j=0;j<i;j++)
            {
                if(ele.charAt(i)==ele.charAt(j))
                {
                    System.out.println("Maximum char of1 "+ele.charAt(i));
                }
            }
//            System.out.print("Maximum char of "+ele.charAt(i));

        }



    }

}

