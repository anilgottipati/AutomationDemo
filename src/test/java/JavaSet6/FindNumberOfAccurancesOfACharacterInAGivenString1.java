package JavaSet6;

public class FindNumberOfAccurancesOfACharacterInAGivenString1 {

    public static void main(String[] args)
    {
        String ele = "Hi How HHH are you";
        char[] c = ele.toCharArray();
        int Count=0;
        for (Character a:c)
        {
            if ('H'==a)
            {
                Count++;

            }
        }
        System.out.print("Before   " + Count);

    }

}
