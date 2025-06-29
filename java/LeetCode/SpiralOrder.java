package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{2, 5, 8},{4, 0, -1}};
        
        System.out.println(solution(arr));
    }

    private static List<Integer> solution(int[][] matrix) {
        //      l   r 
        // top[[1,2,3,4]
        //     [5,6,7,8]
        // bot [9,10,11,12]]
        //[]
        ArrayList<Integer> res = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while(top <= bottom || left <= right) {
            //1. through top from l to r;
            for(int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            //2. through r from top to bottom;
            for(int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            //3. through bottom from r to l;
            if(top > bottom) {
                break;
            }
            for(int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;
            //4. through l from bottom to top;
            if(left > right) {
                break;
            }
            for(int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }

        return res;
    }
}
