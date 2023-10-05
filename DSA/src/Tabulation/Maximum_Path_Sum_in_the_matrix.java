package Tabulation;

public class Maximum_Path_Sum_in_the_matrix {


    public static  int maxpathSum ( int [][] maze ) {

        int n = maze.length;
        int m = maze[0].length;
        int [][] dp = new int[n][m];


       

        for( int i=0; i<n; i++) {
            for ( int j =0; j<m; j++) {

                if ( i == 0 && j ==0) {
                    dp[i][j] = maze[0][0];
                } else {

                    int up = 0;
                    if (i >= 0) {
                        up = maze[i][j] +dp[i-1][j];
                    } else {
                        up += Integer.MIN_VALUE;
                    }

                    int left = 0;
                    if (j > 0) {
                        left = maze[i][j] + dp[i][j-1];
                    } else {
                        left += Integer.MIN_VALUE;
                    }

                    dp[i][j] =Math.max(left,up);

                }


            }
        }

        return dp[n-1][m-1];
    }


    public static void main(String[] args) {


        int[][] maze = {

                {5, 9, 6},
                {11, 5, 2},

        };

       int ans = maxpathSum( maze);
       System.out.println( ans + " this max sum ");
    }
}
