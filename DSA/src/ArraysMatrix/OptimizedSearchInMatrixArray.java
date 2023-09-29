package ArraysMatrix;

import java.util.Arrays;

public class OptimizedSearchInMatrixArray {

    public static int[] SearchInMatrixArray (int[][] matrix,int target) {

        int r=0;
        int c=matrix[0].length-1;                   // TimeComplexity = O(max(mn))
                                                    // SpaceComplexity = O(1)

        while (r < matrix.length && c >= 0 ) {

            if ( target == matrix [r][c] ) {
                 return new int[]{r,c};
            }
            if ( target > matrix [r][c] ) {
                r++;
            }else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] matrix= {
                {10,20,30,40,50},
                {11,22,33,44,55},
                {15,25,35,45,58}
        };



      //  System.out.print(Arrays.toString(OptimizedSearchInMatrixArray.SearchInMatrixArray(matrix,target)));    int target=33;
    }
}
