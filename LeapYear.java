import java.util.Scanner;

public class LeapYear {
    public static int Leap_year(int y) {
        if (y % 400 == 0 || y % 4 == 0) {
            return 1;
        } else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int a = Leap_year(y);
        System.out.println(a);
    }

}
