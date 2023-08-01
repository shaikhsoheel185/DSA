package practice;

// Given an m x n matrix and an integer x.
// In the matrix every row and column of the matrix is sorted in increasing order, find the position of x in the matrix if it is present.
// Otherwise, print Element not found.

import java.util.Arrays;

public class OptimizedSearchInMatrixArray {

    public static int[] Search ( int[][] matrix, int target ) {
        int r =0;
        int c =matrix[0].length-1;
        while (r < matrix.length && c >=0 ) {

            if (matrix[r][c] == target) {
                return new int[] {r,c};
            }
            if ( target > matrix[r][c] ) {
                r++;
            }else {
                c--;
            }
        }
        return new int[] {-1,-1};
    }

                                                             // TimeComplexity - O(max(mn))
                                                             // SpaceComplexity - O(1)
    public static void main(String[] args) {
        int [][] matrix= {

                {10,20,30,40,50},
                {11,22,33,44,55},
                {15,25,35,45,58}

        };
        int target= 44;

        int[] x =OptimizedSearchInMatrixArray.Search(matrix,target);
        System.out.print(Arrays.toString(x));
    }
}
