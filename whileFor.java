import java.util.Scanner;

public class whileFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        var num = input.nextInt();
        for(int i=1;i<=num;i++) {
            int k = 1;
            for (int j=0;j<i;j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();

        }
        System.out.println("------------------------------------");

        for (int i=1;i<5;i++) {
            char character = 'A';
            int acsii = (int) character;
            for (int j=0;j<i;j++){
                System.out.print(character + " ");
                character++;
            }
            System.out.println();
        }
        System.out.println("------------------------------------");

        for (int i=1;i<5;i++) {
            for (int j=1;j<=4;j++){
                if (i==1||i==4||j==1||j==4) {
                    System.out.print("$ ");
                } else if (i==2&&j==1||i==2&&j==4) {
                    System.out.print("$ ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
