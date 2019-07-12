class Calculator                    //super
{
    public int add(int i, int j)
    {
        return i+j;
     }
}

class CalcAdv extends Calculator    //sub
{
    public int sub(int i, int j)
    {
        return i-j;
    }
}

class CalcVeryAdv extends CalcAdv   //sub
{
    public int mul(int i, int j)
    {
        return i*j;
    }

    public int dev(int i, int j)
    {
        return i/j;
    }
}


public class InherutanceDema {
    public static void main(String[] args) {

        CalcVeryAdv c1 = new CalcVeryAdv();
        int sum = c1.add(5,4);
        int sub = c1.sub(6,3);
        int mul = c1.mul(8,8);
        int dev = c1.dev(10,5);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(dev);

    }
}
