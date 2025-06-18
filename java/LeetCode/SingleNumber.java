package LeetCode;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2,4,234,4,4,234,2342352};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int ans = 0;
        for(int n : arr) {
            ans = ans ^ n;
        }
        return ans;
    }
}
