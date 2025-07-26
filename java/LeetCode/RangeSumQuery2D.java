package LeetCode;

public class RangeSumQuery2D {
    private int[][] prefixSums;
    public RangeSumQuery2D(int[][] matrix) {
        prefixSums = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                prefixSums[i][j] = 1;
            }
        }
    }

    public int getSumRange(int[][] matrix) {
        int sum = 0;
        return sum;
    }
}
