//package Week3.NextEvenNum;

import java.util.Scanner;

public class NextEvenNum {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = (n / 2) * 2 + 2;
        System.out.println(res);
        sc.close();
    }
}
