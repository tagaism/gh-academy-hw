package LeetCode;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1},{10},{50}
        };
        System.out.println(solution(matrix, 20));
    }
    private static boolean solution(int[][] matrix, int target) {
        int arrIdx = getArrIdx(matrix, target, 0, matrix.length - 1);
        return binarySearch(matrix[arrIdx], target, 0, matrix[arrIdx].length - 1);
    }

    private static int getArrIdx(int[][] matrix, int target, int l, int r) {
        int m = (l + r) / 2;
        if(l > r) {
            return r < 0 ? 0 : m;
        }
        int lastIdx = matrix[0].length - 1;
        if(target >= matrix[m][0] && target <= matrix[m][lastIdx]) {
            return m;
        }
        if(target <= matrix[m][0]) {
            r = m - 1;
        }
        if(target >= matrix[m][lastIdx]) {
            l = m + 1;
        }
        return getArrIdx(matrix, target, l, r);
    }
    
    private static boolean binarySearch(int[] arr, int target, int l, int r) {
        if(l > r) {
            return false;
        }
        int m = (l + r) / 2;
        if(arr[m] == target) {
            return true;
        }
        if(target > arr[m]) {
            l = m + 1;
        }
        if(target < arr[m]) {
            r = m - 1;
        }
        return binarySearch(arr, target, l, r);
    }

}
