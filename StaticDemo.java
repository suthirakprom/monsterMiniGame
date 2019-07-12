class Emp {
    int eid;
    int salary;
    static String ceo;

    public void show() {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }

    public Emp() {
        eid = 1;
        salary = 3000;
        System.out.println("in constructor");
    }


    static  {                               //when you load a class
        ceo = "Larry";
        System.out.println("in static");
    }
}



public class StaticDemo {
    public static void main(String[] args) {
        Emp jin = new Emp();
        jin.eid = 8;
        jin.salary= 2500;
        //Emp.ceo = "Suthirak";
        Emp jason = new Emp();
        jason.eid = 9;
        jason.salary = 4000;
       // Emp.ceo = "Suthirak";

        jin.show();
        jason.show();
    }
}
