package JavaSet2;

public class Maximu_And_Minimum_Occurring_Character_In_A_String {

    public static void main(String[] args) throws InterruptedException {
        String Count="";
        String ele = "Grass is greener on the other side";

        for (int i = 0; i < ele.length(); i++) {

            for (int j=0;j<i;j++)
            {
                if(ele.charAt(i)==ele.charAt(j))
                {

                    System.out.println("Maximum char of "+ele.charAt(i));
                }
            }

        }
      


    }
}
