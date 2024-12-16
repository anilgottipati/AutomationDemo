package AccesModifiers;

public class ClassB {

    public static void main(String[] args) throws InterruptedException {

        ClassA obj=new ClassA();

//        System.out.println(obj.a); Cant be access from Another Class
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
        


    }
        
    }

