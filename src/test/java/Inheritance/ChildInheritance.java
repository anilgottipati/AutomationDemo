package Inheritance;

public class ChildInheritance extends ParentInheritence{
    void Child()
    {
        System.out.println("Child");
    }

    void Parent()
    {
        super.Parent();
        System.out.println("GrandParents");
    }
}
