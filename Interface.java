interface Writer1
{
     void write();
}
class Pens implements Writer1
{
    public void write()
    {
        System.out.println("is a Pen");
    }
}
//class Pencils extends Writer1
//{
//    public void write()
//    {
//        System.out.println("is a Pencil");
//    }
//}
class Kits
{
    public void doSth(Writer p)
    {
        p.write();
    }

}

public class Interface {

    public static void main(String[] args) {

        Writer p = new Pen();
        Writer pc = new Pencil();

        Kits k = new Kits();

        k.doSth(pc);
        k.doSth(p);

    }

}
