import java.util.Scanner;

public class Convert_To_F {
    public static int fahrenheit(int c) {
        return ((9 * c) / 5) + 32;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int celsius = fahrenheit(c);
        System.out.println(celsius);
    }
}