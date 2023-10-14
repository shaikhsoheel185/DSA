package Tabulation;

public class Coin_Change_Two_tab {


    public static int fun ( int [] arr , int target) {
        int n = arr.length;

        int [][] dp = new int[n][target+1];

        for ( int i=0; i<= target; i++) {
            if (i % arr[0] == 0)
                dp[0][i] = 1;
        }
        for ( int index = 1; index <n; index++) {

            for ( int Target = 0; Target<= target; Target++) {
                int NoTake  = dp[ index-1][Target];
                int Take = 0;
                if ( arr[index] <= Target) {
                    Take = dp[index][Target-arr[index]];
                }

                dp[index][Target] = Take+NoTake;

            }
        }

        return dp[n-1][target];
    }

    public static void main(String[] args) {


        int [] arr= { 1,2,3};

        int Target = 4;

        int ans = fun(  arr , Target);
        System.out.println(ans);

    }
}
