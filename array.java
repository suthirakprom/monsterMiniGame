import java.util.Arrays;
import java.util.Random;

public class array {

    public static void main(String[] args) {

        String[] name = {"Jin", "Hello", "Jack", "Suthirak"};

        for (String names:name)             // for each loop or enhanced for loop
        {
            System.out.println(names);
        }

        int[] numberArray = new int[10];

        for (int row:numberArray)
        {
            System.out.print(row);
        }
        System.out.println();

        int k = 1;
        while(k<=40)
        {
            System.out.print("-");
            k++;
        }
        System.out.println();

        String[][] multiArray = new String[10][10];

        for(int i=0;i<multiArray.length;i++)            // normal for
        {
            for (int j=0;j<multiArray[i].length;j++)
            {
                multiArray[i][j] = i + " " + j;
                System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.println("|");
        }

        k=1;
        while(k<=40)
        {
            System.out.print("-");
            k++;
        }
        System.out.println();

        for(String[] rows:multiArray)                       //enhanced for
        {                                                   // but this wouldn't be possible without assigning the value to the multiArray
            for (String columns:rows)
            {
                System.out.print("| " + columns + " ");
            }
            System.out.println("|");

        }


        char[][] boardGame = new char[10][10];
        for (char[] row:boardGame)
        {
            Arrays.fill(row, '*');
            System.out.println(row);
        }

        //sort array
        int[] sortArray = new int[10];
        for (int i=0;i<sortArray.length;i++)
        {
            sortArray[i] = (int) (Math.random() * 100);
        }

        Arrays.sort(sortArray);
        System.out.println(Arrays.toString(sortArray));  //toString method is needed for this to work

    }

}
