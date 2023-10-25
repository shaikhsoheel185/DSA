package Tabulation;

public class Buy_and_Sell_Stock_Two_Two_Tabulation {


    public static int maxiprofit( int [] arr , int n, int [][] dp) {

        dp[n][0] = dp[n][1] = 0;
        int profit = 0;

        for ( int index = n-1; index >= 0; index--) {
            for ( int buy = 0; buy <= 1; buy++) {

                if ( buy == 0) {
                    profit = Math.max(  -arr[index] + dp[index+1][1],0 + dp[index+1][1]);
                } else {
                    profit = Math.max( arr[index] + dp[index+1][0], 0 + dp[index][1]);
                }
                dp[index][buy] = profit;
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int n = 6;
        int [] Arr = {7, 1, 5, 3, 6, 4};

        int [][] dp = new  int[n+1][2];
        int ans = maxiprofit( Arr , n , dp);

        System.out.println( " The maximum profit by selling the stock is  " + ans );
    }
}
