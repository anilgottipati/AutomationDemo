package JavaSet2;

public class Given_String_Is_Palindrome {
    public static void main(String[] args) throws InterruptedException {

        String s = "level123";
        s = s.toLowerCase();

        // Reverse the string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        System.out.println("Number of Vowels"+rev);
    }
}
