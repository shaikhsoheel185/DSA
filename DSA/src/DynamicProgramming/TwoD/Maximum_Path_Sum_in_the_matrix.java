package DynamicProgramming.TwoD;

import java.util.Arrays;

public class Maximum_Path_Sum_in_the_matrix {

    public  static  int maxPathSum(int [][] maze , int row, int col , int [][] dp) {

        if ( row == 0 && col == 0) return  maze[row][col];

        if( row < 0 || col < 0) return Integer.MIN_VALUE;
        if ( maze[row][col] != -1) return dp[row][col];

        int up = maze[row][col] + maxPathSum( maze , row , col , dp);
        int left = maze[row][col] + maxPathSum( maze ,row ,col , dp);

        return dp[row][col] =  Math.max( up , left);

    }


    public static void main(String[] args) {


        int[][] maze = {

                {5, 9, 6},
                {11, 5, 2},


        };

        int [][] dp = new  int[maze.length][maze[0].length];



        for (int row[] : dp)
            Arrays.fill(row, -1);


        int ans = maxPathSum( maze, maze.length-1, maze[0].length-1 , dp);

        System.out.println( ans+   " " +  "Max path sum");
    }

}
