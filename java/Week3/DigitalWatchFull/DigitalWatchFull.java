// package Week3.DigitalWatchFull;

import java.util.Scanner;

public class DigitalWatchFull {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sec = num % 60;
        int min = (num - sec) / 60;
        int minD = min % 60;
        int hour = min / 60;
        int hourD = hour % 24;
        System.out.printf("%d:%02d:%02d%n", hourD, minD, sec);
        sc.close();
    }
}
