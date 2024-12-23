package StaticvsNonStatic;

public class DefaultConstructor {

    int num;
    //Even if we wont create a Contructor , Java will create for us one default
//    DefaultConstructor(){
//        System.out.println("Inside Contructor");
//    }

    {
        System.out.println("Inside Non Static Block"); //Gets executed before connstructor Called
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main");
        new DefaultConstructor();
        new DefaultConstructor();
        new DefaultConstructor();

    }

    static {
        System.out.println("Inside Static Block"); //Gets executed before connstructor Called
    }
}
