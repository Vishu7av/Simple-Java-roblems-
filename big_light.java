import java.util.Scanner;

public class big_light {
    public static int BigLight(int h1, int h2, int v1, int v2) {
        if (v1 >= v2) {
            return 0;
        }
        int difference = h1 - h2;
        int differ_rent = v2 - v1;
        if (difference % differ_rent == 0) {
            return 1;
        } else
            return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        int differ_rent;
        int difference;
        int a = BigLight(h1, h2, v1, v2);
        System.out.println(a);
    }

}
