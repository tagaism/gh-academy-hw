// package Week3.Balls;
// Aisultan solution
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Balls {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < l; i++) {
            arr.add(sc.nextInt());
        }
        sc.close();

        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < l; i++) {
            st.add(arr.get(i));
            if(st.size() < 3) {
                continue;
            }
            int a = st.pop();
            int b = st.pop();
            int c = st.pop();
            if(a != b || a != c) {
                st.add(c);
                st.add(b);
                st.add(a);
                continue;
            }
            while(i < l) {
                if(arr.get(i) != a) {
                    break;
                }
                i++;
            }
            i--;
        }
        for(int s : st) {
            System.out.printf("%d ", s);
        }
        System.out.println();
        System.out.println(l - st.size());
        // for(int i : arr) {
        //     System.out.printf("%d ", i);
        // }
        // System.out.println();
    }
}
