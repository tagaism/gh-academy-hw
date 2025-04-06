// package Week3.NSum;

import java.util.Scanner;

public class NSum {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while(n > 0) {
            res += sc.nextInt();
            n--;
        }
        System.out.println(res);
        sc.close();
    }
}
