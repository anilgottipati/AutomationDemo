package JavaSet6;

public class FirstAndLastCharAreEqual {
    public static void main(String[] args)
    {
        char c[]= {'a','b','r','z'};

        if (c[0]==c[c.length-1])
        {
            System.out.print("Equal");
        } else {
            System.out.print("Not Equal");
        }
    }
}
