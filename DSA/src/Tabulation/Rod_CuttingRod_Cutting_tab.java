package Tabulation;
public class Rod_CuttingRod_Cutting_tab {
    public static int fun ( int [] price , int s ) {

        int n= price.length;
        int [][] dp = new int[n][s+1];

        for ( int i= 0; i<n; i++) {
            dp[0][i] =  i * price[i];
        }
        for ( int index = 1; index <n; index++) {
            for ( int N = 0; N <= s; N++) {
                int NoTake = dp[index-1][N];
                int Take = Integer.MIN_VALUE;
                int RodLength = index+1;
                if ( RodLength <= N ) {
                    Take = price[index] + dp[index][N- RodLength];
                }

                dp[index][N] = Math.max( Take , NoTake);
            }
        }
        return dp[n-1][s];
    }
    public static void main(String[] args) {

        int [] price = {5,6,1,4,2};
        int n = 5;

        int ans = fun( price , 5);
        System.out.println( ans);

    }
}
