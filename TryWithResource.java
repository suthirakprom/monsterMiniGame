import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResource {

    public static void main(String[] args) throws Exception {

        int n = 0;
        System.out.println("Enter the number: ");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            n = Integer.parseInt(br.readLine());
        }

        System.out.println(n);
    }

}
