class Calc1
{
    public int add(int ... n)
    {
        int sum = 0;
        for (int i:n)
        {
            sum = sum + i;
        }
        return sum;

    }
}


public class variableArgument {
    public static void main(String[] args) {
        Calc1 obj = new Calc1();
        System.out.println(obj.add(9,10,7,4));

    }
}
