public class UserDefine {

    public static void main(String[] args) {

        int i,j;
        i=8;
        j=0;

        try
        {
            int k = i/j;

            if (k==0)
                throw new JinException();

            System.out.println(k);
        }
        catch (JinException e)
        {
            System.out.println("Error");
        }
    }

}
