// package Week3.NumOfTensForAnyNum;

import java.util.Scanner;

public class NumOfTensForAnyNum{
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 100) {
            System.out.println(Math.round(n / 10));
        } else {
            n = Math.round(n / 10);
            System.out.println(n % 10);
        }
        sc.close();
    }
}