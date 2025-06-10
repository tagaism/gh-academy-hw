package LeetCode;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1,3,5,7},{10,11,16,20},{23,30,34,50}
        };
        System.out.println(solution(matrix, 10));
    }
    private static boolean solution(int[][] matrix, int target) {
        int arrIdx = getArrIdx(matrix, target, 0, matrix.length - 1);
        return binarySearch(matrix[arrIdx], target, 0, matrix[arrIdx].length - 1);
    }

    private static int getArrIdx(int[][] matrix, int target, int l, int r) {
        if(l > r) {
            if(r < 0) {
                return 0;
            }
            return (l + r) / 2;
        }
        int m = (l + r) / 2;
        int len = matrix[0].length - 1;
        if(target >= matrix[m][0] && target <= matrix[m][len]) {
            return m;
        }
        if(target <= matrix[m][0]) {
            r = m - 1;
        }
        if(target >= matrix[m][len]) {
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
