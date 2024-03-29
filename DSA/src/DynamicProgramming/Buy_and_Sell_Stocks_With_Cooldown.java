package DynamicProgramming;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//        Find the maximum profit you can achieve. You may complete as many transactions as you like
//        (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
//
//        After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
//        Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the
//        stock before you buy again).
//
//
//
//        Example 1:
//
//        Input: prices = [1,2,3,0,2]
//        Output: 3
//        Explanation: transactions = [buy, sell, cooldown, buy, sell]


import java.util.Arrays;

public class Buy_and_Sell_Stocks_With_Cooldown {

    public static int maxProfit( int index, int [] arr , int n, int buy, int [][] dp) {

        if ( index >= n ) return 0;
        if ( dp[index][buy] != -1) return dp[index][buy];

        int profit = 0;

        if ( buy == 0) {

            int left = 0 + maxProfit( index+1, arr, n, 0, dp);
            int right= -arr[index]+ maxProfit( index+1, arr,n, 1,dp);
            profit =Math.max(left, right);
        }
        if ( buy == 1) {
            int left = 0 + maxProfit( index+1, arr, n, 1, dp);
            int right = arr[index] + maxProfit(index+2,arr,n, 0,dp);
            profit= Math.max(left,right);
        }

        return  dp[index][buy] = profit;
    }


    public static void main(String[] args) {


//        int prices[] = {4, 9, 0, 4, 10};
        int prices[] = { 1,2,3,0,2};
        int [][] dp = new  int[prices.length][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = maxProfit( 0 ,prices, prices.length, 0, dp);
        System.out.println("The maximum profit by selling the stock is  " +ans );
    }
}
