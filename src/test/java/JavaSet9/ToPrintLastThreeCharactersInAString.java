package JavaSet9;

public class ToPrintLastThreeCharactersInAString {

    public static void main(String[] args) {

        String ele= "ANILKUMAR999TIO";
        String lastthreeLetters="";
        char[] ele1 = ele.toCharArray();

        for (int i =ele1.length-1;i>=ele1.length-3;i--){
            lastthreeLetters=ele1[i]+lastthreeLetters;
            System.out.print(ele1[i]);
        }
        System.out.print(lastthreeLetters);

    }
}
