package StaticvsNonStatic;

public class NonStaticMembers {

    int num;
    NonStaticMembers(){
        System.out.println("Inside Contructor");
    }

    {
        System.out.println("Inside Non Static Block"); //Gets executed before connstructor Called
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main");
        new NonStaticMembers();
        new NonStaticMembers();
        new NonStaticMembers();

    }

    static {
        System.out.println("Inside Static Block"); //Gets executed before connstructor Called
    }
}
