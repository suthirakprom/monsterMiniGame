import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList num = new ArrayList();
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jin Jason");
        names.add("Suthirak");
        names.add("Thirak");
        names.add("Saneath");
        names.add(2, "Sokjin");
        names.set(0, "Bopha");
        names.remove(3);

        for (int i=0;i<names.size();i++)                        // this for show the same output as
        {
            System.out.print("| " +names.get(i) + " ");
        }
        System.out.println("|");

        for (String name:names)                               // this for is same as the above for
        {
            System.out.print("| " + name + " ");
        }
        System.out.println("|");

        Iterator indivItem = names.iterator();
        while (indivItem.hasNext())
        {
            System.out.print("| " + indivItem.next() + " ");
        }
        System.out.println("|");                               //this is the print of Iterator
    }
}