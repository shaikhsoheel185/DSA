package Tabulation;

//Coin Change 2 (DP – 22)
//        Problem Link: Ways to Make a Coin Change
//
//        We are given an array Arr with N distinct coins and a target.
//        We have an infinite supply of each coin denomination.
//        We need to find the number of ways we sum up the coin values to give us the target.
//        Each coin can be used any number of times

public class Minimum_Coins_tab {


    public static int minimumCoins( int [] arr , int Target) {
        int n = arr.length;
        int [][] dp = new int [n][Target+1];
        for( int i = 0; i<= Target; i++) {

            if ( i % arr[0] == 0 ) {
                dp[0][i] = i/arr[0];
            } else  {
                dp[0][i] = Integer.MAX_VALUE;
            }
        }

        for ( int index = 1; index<n; index++) {
            for ( int tar=0; tar<= Target; tar++ ) {

                int NoTake = dp[index-1][tar];
                int Take = Integer.MAX_VALUE;

                if ( arr[index] <= tar) {
                    Take = 1 + dp[index][tar-arr[index]];
                }

                dp[index][tar] = Math.min(Take,NoTake);
            }
        }

        return dp[n-1][Target];

    }

    public static void main(String[] args) {

        int [] arr = {1,2,3};
        int Target = 7;

        int ans = minimumCoins( arr , Target);
        System.out.println(ans);
    }
}
