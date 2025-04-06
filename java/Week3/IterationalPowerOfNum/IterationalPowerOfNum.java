// package Week3.IterationalPowerOfNum;

import java.util.Scanner;

public class IterationalPowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pow = sc.nextInt();
        int res = 1;
        while(pow > 0){
            res *= 2;
            pow--;
            
        }
        System.out.println(res);
        sc.close();
    }
}
