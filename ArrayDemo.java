public class ArrayDemo {
    public static void main(String[] args) {

        int arr[][] = {

                {1,2,3,4},
                {5,6,7,8},
                {9,8,7,6},
                {2,4,6,1}
        };

        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("------------------------------");

        int arr1[][] = {

                {1,2,3,4},
                {5,6,7,8,6},
                {9,8,7},
                {2,4,6,1,7,1}
        };

        for (int i=0;i<arr1.length;i++)
        {
            for (int j=0;j<arr1[i].length;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
