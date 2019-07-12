interface Demoz
{

    int num = 8;                        // this variable become a constant variable

    static void show()                  //static method
    {
        System.out.println("hi");
    }
}

class Demox implements Demoz
{
    public void show()
    {
        System.out.println("hello");
    }

}

public class StaticMethodInInterface {

    public static void main(String[] args) {

        Demox obj = new Demox();        // no need to create obj to call a method if we using static method

        Demoz.show();
        obj.show();

    }

}
