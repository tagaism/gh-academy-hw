// package Week3.LastClass;

import java.util.Scanner;

public class LastClass {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int time = 9 * 60 + num * 45; //time in mins wo brakes
        int brakes = num - 1;
        time += brakes * 5; // time in mins w 5mins brakes
        
        time += (brakes / 2) * 10;
        System.out.println(time / 60 + " " + (int)(time % 60));
        sc.close();
    }
}
