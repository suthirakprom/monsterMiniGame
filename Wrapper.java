public class Wrapper {

    public static void main(String[] args) {

        int i=5; //Primitive Datatype
        Integer ii = new Integer(i); // Boxing - Wrapping
        int j = ii. intValue(); // Unboxing - Unwrapping

        Integer value = i; // AutoBoxing

        int k = value; // AutoUnboxing
    }

}
