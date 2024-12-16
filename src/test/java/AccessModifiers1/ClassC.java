package AccessModifiers1;

import AccesModifiers.ClassA;

public class ClassC extends ClassA {

    public static void main(String[] args) throws InterruptedException {


        ClassA obj=new ClassA();

//        System.out.println(obj.a); //Cant be access from Another Class
//        System.out.println(obj.b);//Cant be access from Another Class
//        System.out.println(obj.c);//Cant be access from Another Class
        System.out.println(obj.d);
        ClassC obj1=new ClassC();
       // System.out.println(obj1.b); //Cant Access in Another Package
        System.out.println(obj1.c);
        System.out.println(obj1.d);
    }
        
    }

