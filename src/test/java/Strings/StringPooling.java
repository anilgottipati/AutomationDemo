package Strings;

public class StringPooling {
    public static void main(String[] args)
    {
        //String class is Immutable
        //once an object of a String is created, then in Properties or State cannot be changed
        String s1="Test"; //Example JVM allocated a Memory 123 for Test in String Pool which is seperate Memory Location
       // String s1="Auto";//JVM will create a separate memory and won't be overwritten
        //Advantages
        // Performance -- If we create another String S2="Test", it will point to Same memory instead of creating another String "Test" in Memory
        //Thread Safe -- If Multiple Threads accessing the Same String and if one thread manipulates
        //the value while other threads still reading we are ok, since one thread changes the
        // value it will Point to different Memory Location and the other threads still access the
        //old Values
    }

}
