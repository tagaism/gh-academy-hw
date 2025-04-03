// package Week3.Hypothenuse;

import java.util.Scanner;

public class Hypothenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        sc.nextLine();
        if(side1 <= 0 || side2 <= 0) {
            System.err.println("Invalid input");
        } else {
            CalculateHypothenuse(side1, side2);
        }
        sc.close();
    }

    public static double CalculateHypothenuse(int side1, int side2) {
      return Math.sqrt(Math.pow(side1, side2)); 
    }
}
