package LeetCode;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7,1,5,3,6,4}));
    }

    private static int solution(int[] nums) {
        int minPriceSoFar = nums[0];
        int maxProfit = 0;
        for(int p : nums){
            if(p - minPriceSoFar > maxProfit) {
                maxProfit = p - minPriceSoFar;
            }

            if(p < minPriceSoFar) {
                minPriceSoFar = p;
            }
        }
        return maxProfit;
    }
}
