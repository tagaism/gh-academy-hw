package Week3.RecursiveFactorial;

import java.util.Scanner;

public class RecursiveFactorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
    }

    private static long factorial(int num) {
        if(num == 1) {
            return num;
        }
        return num * factorial(num - 1);
    }
}