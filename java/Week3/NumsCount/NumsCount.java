// package Week3.NumsCount;

import java.util.Scanner;

public class NumsCount {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int z = 0;
        int p = 0;
        int n = 0;
        while(num > 0) {
            int a = sc.nextInt();
            if(a == 0) {
                z++;
            } else if(a > 0) {
                p++;
            } else {
                n++;
            }
            num--;
        }
        System.out.printf("%d %d %d%n", z, p, n);
        sc.close();
    }
}
