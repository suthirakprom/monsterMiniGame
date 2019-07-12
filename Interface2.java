interface Abc
{
    void show();

}

class Imp implements Abc
{
    public void show()
    {
        System.out.println("IMP");
    }
}

public class Interface2 {

    public static void main(String[] args) {

        Abc obj = new Imp();
        obj.show();

    }

}
