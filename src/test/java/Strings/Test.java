package Strings;

public class Test {
    public static void main(String[] args) {

        ImmutableDemo m1 =new ImmutableDemo(1,"Auto");
        ImmutableDemo m2 =new ImmutableDemo(1,"Auto");
        System.out.println(m1); //it won't show the Values, instead of it showing Package Name, Class Name and hash code of a Object
        System.out.println(m2);
        String a =new String("Manual");
        System.out.println(a);//Immutable

        String S1="Hello";
        String S3="Hello";
        String S2="World";
        String S4="Hello";
        System.out.println("Before Concat:" + "\nS1"+S1 + "\nS2"+S2);
        S1.concat(S2);
        System.out.println("After Concat:" + "\nS1"+S1 + "\nS2"+S2 + "\nS2"+S3);
        //Below S1 and S2 will Share the Same Memory Location
        System.out.println("After Concat:" + "\nS1"+S1.hashCode() + "\nS2"+S2.hashCode() + "\nS2"+S3.hashCode());
//Remain same even after Concat as S1 and S2 are Immutable
        //If we do Concat the JVM will concat them but it will create a New
        //String called Hello World in memory
       S1= S1.concat(S2);
        System.out.println("After Concat:" + "\nS1"+S1 + "\nS2"+S2);
        String A="Test";
        String B="Test";
        System.out.println( A==B);//Compares the reference
        // Return True, because of String Pooling even A and B are two different Objects
        //they both Pointing to Same Memory Location
        System.out.println(A.contains(B));//Compares the Content
        String C=new String("Test");
        System.out.println(A==C);
        //Return False, Comparing A reference with C, since we are creating a New Object
        //JVM allocate a new Memory Allocation , won't use Existing
        System.out.println(A.equals(B));//Compares the Content , wont care about the Memory Location

    }
}
