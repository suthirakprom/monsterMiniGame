class A1
{
    public void show()
    {
        System.out.println("in a show");
    }
}


public class Anonymous {

    public static void main(String[] args) {

        A1 obj = new A1() {                             //
            public void show()                          //  This is called anonymous class - it is a class
            {                                           //  without name. It is used to overload the main class.
                System.out.println("Im the best");      //  It is also a one-time use.
            }                                           //
        };

        obj.show();

    }

}
