package StaticvsNonStatic;

public class StaticMethods {
    public static void main(String[] args) {
        System.out.println("Main");
        StaticMethods.Method1();
    }

    static void Method1()
    {
        System.out.println("Inside Method1");
    }

    static
    {
        System.out.println("Inside Static");
        StaticMethods.Method1();
    }
}
