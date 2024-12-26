package JavaSet6;

public class RemoveSpecialCharactersSpacesFromTheString {
    public static void main(String[] args) throws InterruptedException {

        String ele =" Ytgh&^& (*) #@#$ASAAAAAAYHJHJ";

       String ele1 = ele.replaceAll("[^A-Za-z0-9]","");
        System.out.println(ele1);

    }

}
