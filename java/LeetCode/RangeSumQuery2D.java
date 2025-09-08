package LeetCode;

public class RangeSumQuery2D {
    private int[][] prefixSums;
    /**
        * Constructor for the RangeSumQuery2D class.
        * Initializes the prefix sums matrix based on the input matrix.
        * The prefix sums matrix is used to efficiently calculate the sum of elements within a given rectangular region.
        *
        * @param matrix The input 2D matrix for which range sum queries will be performed.
        *               The matrix is assumed to be non-null and rectangular.
        */
    public RangeSumQuery2D(int[][] matrix) {
        //  j
        //i[3,0,1,4,2],
        // [5,6,3,2,1],
        // [1,2,0,1,5],
        // [4,1,0,1,7],
        // [1,0,3,0,5]
        prefixSums = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                int top = i == 0 ? 0 : prefixSums[i - 1][j];
                int left = j == 0 ? 0 : prefixSums[i][j - 1];
                int diag = i == 0 || j == 0 ? 0: prefixSums[i - 1][j - 1];
                prefixSums[i][j] = top + left - diag + matrix[i][j];
            }
        }
        //.      j
        //.i[ 3,  ,  ,  ,  ],
        //. [  ,  ,  ,  ,  ],
        //. [  ,  ,  ,  ,  ],
        //. [  ,  ,  ,  ,  ],
        //. [  ,  ,  ,  ,  ]
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        // (0,0)(0,1)
        //[3, 3, 4, 8,10],
        //[5,11,14,16,17],
        //[1, 3, 3, 4, 9],
        //[4, 5, 5, 6,13],
        //[1, 1, 4, 4, 9]
        int top = row1 == 0 ? 0 : prefixSums[row1 - 1][col2];
        int left = col1 == 0 ? 0 : prefixSums[row2][col1 - 1];
        int diag = row1 == 0 || col1 == 0 ? 0 : prefixSums[row1 - 1][col1 - 1];

        return prefixSums[row2][col2] - top - left + diag;
    }
}
