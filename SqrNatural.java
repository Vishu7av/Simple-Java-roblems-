import java.util.*;
import java.io.*;

public class SqrNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Sqr_Sum(n);
        System.out.println(n);

    }

    public static int Sqr_Sum(int n) {

        if (n == 0) {
            return -1;
        }
        return n * (n + 1) * (2 * n + 1) / 6;
    }
}