interface Xyz           // functional interface can take only one method
{                       // or we can call it Lambda Expression
    void show();
}

public class FunctionalInterface {

    public static void main(String[] args) {

        Xyz obj = () -> {
            System.out.println("I'm the best"); // only work in functional interface
        };

        obj.show();
    }

}
