package DynamicProgramming.TwoD;

import java.util.Arrays;

public class Grid_Unique_Paths_TWO {

    static int mazeObstaclesUtil(int n, int m, int[][] maze, int[][] dp) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Base conditions
                if (i > 0 && j > 0 && maze[i][j] == -1) {
                    dp[i][j] = 0; // If there's an obstacle, no paths can go through here.
                    continue;
                }
                if (i == 0 && j == 0) {
                    dp[i][j] = 1; // There's one valid path to the start cell.
                    continue;
                }

                int up = 0;
                int left = 0;

                // Check if moving up is possible
                if (i > 0)
                    up = dp[i - 1][j];

                // Check if moving left is possible
                if (j > 0)
                    left = dp[i][j - 1];

                // Calculate the number of paths by adding paths from above and from the left
                dp[i][j] = up + left;
            }
        }

        // The final result is stored in the bottom-right cell of the DP matrix
        return dp[n - 1][m - 1];
    }

    // Main function to calculate the number of paths through the maze
    static int mazeObstacles(int n, int m, int[][] maze) {
        int dp[][] = new int[n][m];

        // Initialize the DP matrix with -1
        for (int row[] : dp)
            Arrays.fill(row, -1);

        // Call the helper function starting from the top-left cell
        return mazeObstaclesUtil(n, m, maze, dp);
    }

    public static void main(String args[]) {
        // Define the maze
        int[][] maze = {
                {0, 0, 0},
                {0, -1, 0},
                {0, 0, 0}
        };

        int n = maze.length;
        int m = maze[0].length;

        // Calculate and print the number of paths through the maze
        System.out.println(mazeObstacles(n, m, maze));
    }
}
