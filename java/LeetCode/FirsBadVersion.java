package LeetCode;

public class FirsBadVersion {
    public static void main(String[] args) {

    }
    public static int solution(int n) {
        int l = 1;
        int r = n; 
        while(l < r) {
            int m = (l + r) / 2;
            if(isBadVer(m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
    public static boolean isBadVer(int n) {
        return n == 4;
    }
}
