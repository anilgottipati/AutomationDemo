package JavaSet7;

public class CapitilizeTheFirstLetterToCaps {

    public static void main(String[] args) {

        String orignalStatement="this is my first statement";

        String[] words = orignalStatement.split(" ");
        String finalStatement = "";
        for(String word : words) {
            char[] ca = word.toCharArray();
            char c = ca[0];
            String firstChar = String.valueOf(c).toUpperCase();
            String capitializedWord = firstChar;
            for(int i=1;i<ca.length;i++) {
                capitializedWord = capitializedWord + ca[i];
            }
            finalStatement = finalStatement + capitializedWord +" ";
        }
        System.out.println(finalStatement);
    }

}
