package Week3.RecursiveFactorial;

import java.util.Scanner;
import java.util.Arrays;
public class RecursiveFactorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        System.out.println(factorial(n, memo));
    }

    public static int factorial(int n, int[] arr) {
        if(n == 1 || n == 0) {
            return 1;
        }
        if(n < 0) {
            throw new RuntimeException("The negative number is undefined for factorial!");
        }
        if(arr[n - 1] != 0) {
            return arr[n];
        }
        arr[n - 1] = arr[n - 1] * n;
        return factorial(n - 1, arr);
    }
    }