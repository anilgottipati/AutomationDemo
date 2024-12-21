package JavaSet2;



public class Count_Total_Number_Of_Characters_In_String {

    public static void main(String[] args) throws InterruptedException {

        String ele = "Hi How are doing Today";
        int Count=0;
        for (int i = 0; i < ele.length(); i++) {
           if(ele.charAt(i)!=' ')
            {
                Count++;
            }
        }
        System.out.println(Count);
    }
}

