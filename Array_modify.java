import java.util.Arrays;
import java.util.Scanner;

public class Array_modify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        // for (int i = 0; i < str.length; i++) {
        System.out.println(Arrays.toString(str));
        // break;
        // }
        str[1] = "Vishu";
        System.out.println("Modify :-" + Arrays.toString(str));
    }
}
