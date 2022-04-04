
import java.util.Scanner;

public class Number_of_Day {
    private static final int N = 0;

    public static int day(int M, int N) {
        if (M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12) {
            return 31;
        } else if (M == 4 || M == 6 || M == 9 || M == 11) {
            return 30;
        }

        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int a = day(M, N);
        System.out.println(a);
    }

}
