package java.week_one;
import java.util.Scanner;
public class week_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String str = sc.next();
        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Integer: " + i);
        sc.close();
    }
}
