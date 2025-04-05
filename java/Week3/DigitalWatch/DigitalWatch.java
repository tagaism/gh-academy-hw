// package Week3.DigitalWatch;

import java.util.Scanner;
public class DigitalWatch{
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int hours;
        int mins = num % 60;
        num = num - mins;
        hours = num / 60;
        int dispH = hours % 24;
        System.out.printf("%d %d%n", dispH, mins);
        sc.close();
    }
}