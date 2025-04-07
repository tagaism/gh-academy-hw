// package Week3.SumOfPowers;

import java.util.Scanner;

public class SumOfPowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        while(n > 0) {
            int t = n;
            int p = 1;
            while(t > 0) {
                p *= 2;
                t--;
            }
            s += p;
            n--;
        }
        System.out.println(s);
        sc.close();
    }
}
