// package Week3.LastDigit;
import java.util.Scanner;

public class LastDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num % 10);
        sc.close();
    }
}