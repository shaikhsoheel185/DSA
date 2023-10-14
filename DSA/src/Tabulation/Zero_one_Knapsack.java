package Tabulation;

public class Zero_one_Knapsack {

    public static int maxRob(int[] val, int[] wt, int weight) {
        int n = val.length;
        int m = weight;

        int[][] dp = new int[n + 1][m + 1]; // Increase dimensions by 1

        // Base Condition
        for (int i = 0; i <= m; i++) { // Start from 0
            dp[0][i] = 0; // Initialize with 0
        }

        for (int index = 1; index <= n; index++) { // Use <= for indexing
            for (int j = 0; j <= m; j++) {

                int NoTake = dp[index - 1][j];
                int Take = 0;
                if (wt[index - 1] <= j) { // Adjust index here
                    Take = val[index - 1] + dp[index - 1][j - wt[index - 1]]; // Adjust index here
                }

                dp[index][j] = Math.max(Take, NoTake); // Correct indexing here
            }
        }

        return dp[n][m]; // Return the value at dp[n][m]
    }
    public static void main(String[] args) {

        int [] wt =  { 1,2,4,5};
        int [] val = {5,4,8,6 };

        int weight = 5;
        int ans =maxRob( val , wt , weight);

        System.out.println(ans);
    }
}



