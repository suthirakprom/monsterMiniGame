abstract class Human        // Abstract class
{
    public abstract void eat();     //Abstract method
    public void walk()
    {

    }
}

class Man extends Human //Concrete Class
{
    public void eat()
    {

    }
}

public class Abstract {

    public static void main(String[] args) {

        Human obj = new Man();

    }

}
