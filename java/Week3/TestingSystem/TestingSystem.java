// package Week3.TestingSystem;

import java.util.Scanner;

public class TestingSystem {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int sysNum = sc.nextInt();
        int pupNum = sc.nextInt();
        if(sysNum == pupNum) {
            System.out.println("YES");
        } else {
            if(sysNum == 1) {
                System.out.println("NO");
            } else {
                if(pupNum == 1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}
