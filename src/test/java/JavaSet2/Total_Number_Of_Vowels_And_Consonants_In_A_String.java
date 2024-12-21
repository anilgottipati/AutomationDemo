package JavaSet2;

public class Total_Number_Of_Vowels_And_Consonants_In_A_String {

    public static void main(String[] args) throws InterruptedException {

        String ele = "How are you";
        int Count=0;
        for (int i = 0; i < ele.length(); i++) {
            System.out.println(ele.length());
            if(ele.charAt(i)=='a' || ele.charAt(i)=='e' || ele.charAt(i)=='i' || ele.charAt(i)=='0' || ele.charAt(i)=='u')
            {
                Count++;
            }
        }
        System.out.println("Number of Vowels"+Count);


    }
}
