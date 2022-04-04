import java.util.Scanner;

public class SumOf_N_Odd {
    public static int SumOf_n_Odd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :- ");
            int n = sc.nextInt();
            int sum = SumOf_n_Odd(n);
            System.out.println("Sum of all odd no :- " + sum);
        }

    }
}
