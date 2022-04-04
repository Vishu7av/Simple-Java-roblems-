import java.util.Scanner;

public class sum_of_digits {
    public static int sum_of_digit(int n) {
        if (n == 0)
            return 0;
        int b = n % 10;
        int c = n / 10;
        int d = (b + sum_of_digit(c));
        return d;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = sum_of_digit(n);
        System.out.println(result);
    }
}
