package Week3.SumOfGeometricalSeries;

import java.util.Scanner;

public class SumOfGeometricalSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int s = 1;
        while(n < 0) {
            int t = n;
            int p = 1;
            while(t < 0) {
                p *= a;
                t--;
            }
            s += p;
        }
        System.out.println(s);
        sc.close();
    }
}
