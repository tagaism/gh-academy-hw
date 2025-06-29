package LeetCode;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(solution("1010", "1011"));
    }
    private static String solution(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int c = 0;
        StringBuilder res = new StringBuilder();
        while(c > 0 || i >= 0 || j >= 0) {
            int aa = i < 0 ? 0 : a.charAt(i--) - '0';
            int bb = j < 0 ? 0 : b.charAt(j--) - '0';
            int temp = aa + bb + c;
            c = temp >= 2 ? 1 : 0;
            // if(temp >= 2) {
            //     c = 1;
            // } else {
            //     c = 0;
            // }
            res.append(temp % 2);
        }
        return res.reverse().toString();
    }
}
