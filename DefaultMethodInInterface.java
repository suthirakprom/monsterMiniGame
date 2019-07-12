interface Demo
{
    void abc();
    default void show()
    {
        System.out.println("In show");
    }
}

class DemoClass implements Demo
{
    public void abc()
    {
        System.out.println("in ABC");
    }
}

public class DefaultMethodInInterface {

    public static void main(String[] args) {

        Demo obj = new DemoClass();
        obj.show();
        obj.abc();
    }

}
