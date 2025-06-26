package LeetCode;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,2,3,3,3,3,4,4,4,4}));
    }
    private static int solution(int[] nums) {
        //                     i
        //[1,2,2,3,3,3,3,4,4,4,4]
        //               s
        int s = 2;
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[s-2]) {
                nums[s++] = nums[i];
            }
        }
        return s;
    }
}
