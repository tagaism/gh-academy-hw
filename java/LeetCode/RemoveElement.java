package LeetCode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(solution(arr, 2));
    }
    private static int solution(int[] arr, int val) {
        int pointer = 0;
        for(int n : arr) {
            if(n != val) {
                arr[pointer] = n;
                pointer++;
            }
        }
        return pointer;
    }
}
