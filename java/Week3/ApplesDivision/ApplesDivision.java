// package Week3.ApplesDivision;

import java.util.Scanner;

public class ApplesDivision {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int apples = sc.nextInt();
        System.out.println(apples / students);
        sc.close();
    }    
}