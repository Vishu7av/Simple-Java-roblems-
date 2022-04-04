import java.util.Scanner;

public class angle_triangle {
    public static int angle_Triangle(int a, int b, int c) {
        int maxSide = a;
        if (b > maxSide) {
            maxSide = b;
        }
        if (c > maxSide) {
            maxSide = c;
        }
        if (2 * maxSide * maxSide > a * a + b * b + c * c) {
            return 3;
        } else if (2 * maxSide * maxSide == a * a + b * b + c * c) {
            return 2;
        } else
            return 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = angle_Triangle(a, b, c);
        System.out.println(d);
    }
}
