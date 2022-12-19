package ArraysMatrix;

import java.util.Arrays;

public class LinearSearchElementInMatrixArray {
    public static int [] LinerSearchInMatrix (int [][]nums,int target) {



        for (int r=0; r<nums.length; r++) {
            for (int c=0; c<nums.length; c++) {
                if (nums [r][c] == target) {
                    return new int[]{r,c};
                }                                           // TimeComplexity O(N2)
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int [][] nums= {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,38,49},
                {33,34,38,55}
        };
        int target = 55;

        System.out.print(Arrays.toString(LinearSearchElementInMatrixArray.LinerSearchInMatrix(nums,target)));

    }
}
