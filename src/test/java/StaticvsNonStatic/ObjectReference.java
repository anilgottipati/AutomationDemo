package StaticvsNonStatic;

public class ObjectReference {
     int x;
    ObjectReference(){

    }
    public static void main(String[] args) throws InterruptedException {
         ObjectReference org = new ObjectReference();
        System.out.println(org.x);

    }
}
