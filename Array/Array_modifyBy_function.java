package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_modifyBy_function {
    public static int modify(int[] arr) {
        return arr[1] = 99;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        modify(arr);
        System.out.println(Arrays.toString(arr));
    }
}
