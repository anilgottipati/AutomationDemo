package JavaSet6;

public class RemoveWhiteSpacesFromTheString {
    public static void main(String[] args) throws InterruptedException {

        String ele ="A B C D E ";

       String ele1 = ele.replaceAll("\\s","");
        System.out.println(ele1);

    }

}
