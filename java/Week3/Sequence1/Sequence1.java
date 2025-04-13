package Week3.Sequence1;

import java.util.Scanner;

public class Sequence1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l=in.nextInt();
        int[][] arr = new int[l][3];
        for(int i=0; i < l; i++){
            arr[i][0] = in.nextInt();//a 5
            arr[i][1] = in.nextInt();//b 3
            arr[i][2] = in.nextInt();//n 5
        }
        in.close();
    
        for(int i = 0; i < arr.length; i++) {
            int n = arr[i][2];
            int s = arr[i][0];
            for(int j = 0; j < n; j++) {                
                int b = arr[i][1];
                int term = (int)Math.pow(2, j) * b;
                s += term;
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
-9_223_372_036_854_775_808 to 9_223_372_036_854_775_807

