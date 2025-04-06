// package Week3.NumOfZeros;

import java.util.Scanner;

public class NumOfZeros {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = 0;
        while(n > 0) {
            if(sc.nextInt() == 0) {
                z++;
            }
            n--;
        }
        System.out.println(z);
        sc.close();
    }
}
