
import java.util.Scanner;

public class Prime_Or_Not {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        int N;
        int count = 0;
        // Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter any Integer : ");
        N = sc.nextInt();

        for (i = 2; i <= N / 2; i++) {
            if (N % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0 && N != 1) {
            System.out.println(N + " :-- is a Prime");
        } else {
            System.out.println(N + " :-- is Not Prime");
        }
    }

}
