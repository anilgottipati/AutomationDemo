package JavaSet6;

public class FindNumberOfAccurancesOfACharacterInAGivenString {

    public static void main(String[] args)
    {
        String ele = "Hi How are you";

        System.out.print("Before   " + ele.length());

        System.out.print("After   " + ele.replace("H","").length());
    }

}
