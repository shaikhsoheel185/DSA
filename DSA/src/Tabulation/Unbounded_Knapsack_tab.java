package Tabulation;

import java.awt.desktop.SystemEventListener;

public class Unbounded_Knapsack_tab {

    public static int fun ( int [] wt , int val [], int weight) {

        int n = wt.length;

        int [][] dp = new int[n][weight+1];

        // Base condition: Initialize the dp array for the first item
        for (int i = wt[0]; i <= weight; i++) {
            dp[0][i] = ((int) i / wt[0]) * val[0];
        }

        for ( int index = 1; index<n; index++) {
            for ( int  w = 0; w<= weight; w++ ) {

                int NoTake = dp[index-1][w];
                int Take = Integer.MIN_VALUE;
                if ( wt[index] <= w) {
                    Take = val[index] + dp[index][w-wt[index]];
                }
                dp[index][w] = Math.max(Take ,NoTake);

            }
        }

        return dp[n-1][weight];
    }


    public static void main(String[] args) {


        int [] wt = { 2,4,6};
        int [] val = {5,11,13};

        int weight = 10;
        int ans = fun( wt , val , weight);
        System.out.println(ans);

    }
}
