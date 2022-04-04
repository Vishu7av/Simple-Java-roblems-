import java.util.Scanner;

public class GreaterNo {
    public static int Greater(int a, int b) {

        if (a > b)

            return a;
        else
            return b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no :- ");
        int a = sc.nextInt();
        System.out.println("Enter second no :- ");
        int b = sc.nextInt();
        int ac = Greater(a, b);
        System.out.println(ac);

    }
}
