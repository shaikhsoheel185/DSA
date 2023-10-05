package Tabulation;

//Given two values M and N, which represent a matrix[M][N].
//        We need to find the total unique paths from the top-left cell
//        (matrix[0][0]) to the rightmost cell (matrix[M-1][N-1]).
//
//        At any cell we are allowed to move in only two directions:- bottom and right.

public class Grid_Unique_Paths {

    public static  int uniquePath( int m ,int n ,int [][] dp) {

        for ( int row = 1; row < m; row++) {
            for ( int col =1; col < n; col++) {
                int    right = dp[row-1][col];
                int    down  = dp[row][col-1];

                dp[row][col] = right+down;
             }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 2;
        int [][] dp = new  int[m][n];

        // Initialize the first row and first column with 1
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        int path = uniquePath(  m ,  n ,  dp);
        System.out.println( path + " are number of unique paths ");

    }


}
