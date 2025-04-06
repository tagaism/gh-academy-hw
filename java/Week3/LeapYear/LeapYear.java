// package Week3.LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean res = false;
        if(year % 4 == 0) {
            res = true;
        }
        if(year % 100 == 0) {
            res = false;
        }
        if(year % 400 == 0) {
            res = true;
        }

        System.out.println(res ? "YES" : "NO");
        sc.close();
    }
}
