package StaticvsNonStatic;

public class StaticBlocks {
    public static void main(String[] args) {
        System.out.println("Main");

    }

    static{
        System.out.println("Static Block1");
    }

    static{
        System.out.println("Static Block2");
    }
}
