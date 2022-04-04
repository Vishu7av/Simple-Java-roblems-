import java.util.Scanner;

public class Avg_of_threeNo {
    public static int SumOfNumber(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        return avg;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first no :- ");
            int a = sc.nextInt();
            System.out.println("Enter the second  no :- ");
            int b = sc.nextInt();
            System.out.println("Enter the third no :- ");
            int c = sc.nextInt();
            int avg = SumOfNumber(a, b, c);
            System.out.println(avg);
        }
    }

}
