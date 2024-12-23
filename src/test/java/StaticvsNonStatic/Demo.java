package StaticvsNonStatic;

public class Demo {

    static{//Creating a Object Reference in Static Block
        Demo org = new Demo();
        System.out.println(org);
    }

    public static void main(String[] args) throws InterruptedException {

    }
}
