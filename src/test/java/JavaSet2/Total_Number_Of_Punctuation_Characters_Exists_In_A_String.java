package JavaSet2;

public class Total_Number_Of_Punctuation_Characters_Exists_In_A_String {


    public static void main(String[] args) throws InterruptedException {

        String ele = "He??..said,?";
        int Count=0;
        for (int i = 0; i < ele.length(); i++) {
            System.out.println(ele.length());
            if(ele.charAt(i)==','||ele.charAt(i)=='?' ||ele.charAt(i)=='.')
            {
                Count++;
            }
        }
        System.out.println("Count Chracters"+Count);

    }
}
