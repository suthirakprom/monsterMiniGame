class Writer
{
    public void write()
    {

    }
}
class Pen extends Writer
{
    public void write()
    {
        System.out.println("is a Pen");
    }
}
class Pencil extends Writer
{
    public void write()
    {
        System.out.println("is a Pencil");
    }
}
class Kit
{
    public void doSth(Writer p)
    {
        p.write();
    }

}

public class Abstract2 {

    public static void main(String[] args) {

        Pen p = new Pen();
        Pencil pc = new Pencil();

        Kit k = new Kit();

        k.doSth(pc);
        k.doSth(p);

    }

}
