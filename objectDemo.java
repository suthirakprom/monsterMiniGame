class Calc {
    int num1;
    int num2;
    int res;

    public Calc() {
        num1=5;
        num2=5;
        System.out.println("in construchtor");
    }

    public Calc(int n, int a) {
        this.num1 = a;
        this.num2 = n;
    }
}


public class objectDemo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        Calc hello = new Calc(7, 8);

        System.out.println(obj.num1);
        System.out.println(hello.num2);
        System.out.println(hello.num1);
    }

}
