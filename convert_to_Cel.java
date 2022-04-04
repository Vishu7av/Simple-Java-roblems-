import java.util.Scanner;

public class convert_to_Cel {
    public static int celsius(int c) {
        int f = (c - 32) * 5 / 9;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = celsius(c);
        System.out.println(a);
    }

}
