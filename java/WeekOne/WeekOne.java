import java.util.Scanner;
public class WeekOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Integer: " + i);
        sc.close();
    }
}
