// package Week3.CheckIfThereAreElementsWithSameSign;

import java.util.Scanner;

public class CheckIfThereAreElementsWithSameSign {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        String counter = "NO";
        for(int i = 0; i < arr.length - 1; i++) {
            if((arr[i] > 0 && arr[i + 1] > 0) || (arr[i] < 0 && arr[i + 1] < 0)) {
                counter = "YES";
                break;
            }
        }
        System.out.println(counter);
        sc.close();
    }

}
