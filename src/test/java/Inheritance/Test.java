package Inheritance;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Car c=new Car();
        System.out.println(c.fuel());

        Bus b=new Bus();
        System.out.println(b.fuel());
        Bike bi=new Bike();
        System.out.println(bi.fuel());
    }

}
