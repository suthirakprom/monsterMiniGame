class Stdnt
{
    private int rollNum;
    private String name;

    public void setRollNum(int rollNum)
    {
        this.rollNum = rollNum;
    }
    public int getRollNum()
    {
        return rollNum;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}


public class Encapsulation {
    public static void main(String[] args) {

        Stdnt s1 = new Stdnt();
        s1.setRollNum(10);
        s1.setName("Jin Jason");

        System.out.println(s1.getRollNum());
        System.out.println(s1.getName());
    }
}
