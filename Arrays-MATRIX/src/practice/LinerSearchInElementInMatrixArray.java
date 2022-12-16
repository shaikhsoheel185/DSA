package practice;

import java.util.Arrays;

public class LinerSearchInElementInMatrixArray {

    public static int[] Search (int [][] matrix, int target) {

        for (int r=0; r < matrix.length; r++ ) {
            for (int c=0; c< matrix[0].length; c++) {
                if ( matrix [r] [c] == target ) {
                    return new int[]{r,c};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {

        int [][] matrix = {                           // TimeComplexity - O(n2);
                                                      // Sc- O(1);
                {10,20,30,40},
                {15,25,35,45},
                {28,29,38,49},
                {33,34,38,55}
        };

        int target= 55;

        System.out.print(Arrays.toString(LinerSearchInElementInMatrixArray.Search(matrix,target)));
    }
}
