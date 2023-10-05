package DynamicProgramming.TwoD;

//In this article, we will solve the most asked coding interview problem: Grid Unique Paths
//
//        Given two values M and N, which represent a matrix[M][N].
//        We need to find the total unique paths from the top-left cell (matrix[0][0])
//        to the rightmost cell (matrix[M-1][N-1]).
//
//        At any cell we are allowed to move in only two directions:- bottom and right.


import java.util.Arrays;

public class Grid_Unique_Paths {

    public  static  int uniquePath ( int [][] grid , int row , int col , int[][] dp) {

        if ( row == 0 && col == 0) return  1;
        if( row < 0 || col < 0) return  0;

        if( dp[row][col] != -1) return dp[row][col];

        int leftPath = uniquePath( grid , row , col-1, dp );
        int rightPath = uniquePath( grid , row-1 , col, dp);

        return dp[row][col] = leftPath + rightPath;
    }


    public static void main(String[] args) {


        int [][] grid = new int[3][2];
        int [][] dp = new  int[3][2];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        int path = uniquePath( grid , grid.length-1 , grid[0].length-1 , dp );
        System.out.println( path + " are number of unique paths ");
    }


}
