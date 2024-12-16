package AccesModifiers;

public class ClassA {
    //These are Non Static Members, to Access need to create a Object
private int a=30;
int b=40;
protected int c=50;
public int d=60;

    public static void main(String[] args) throws InterruptedException {

        
ClassA obj=new ClassA();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

    }
        
    }

