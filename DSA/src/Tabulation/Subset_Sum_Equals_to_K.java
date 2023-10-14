package Tabulation;

public class Subset_Sum_Equals_to_K {


    public static boolean subsetSum(int [] arr , int k) {

        int n = arr.length;
        boolean [][] dp = new boolean[n][k+1];
        for (int i =0; i<n; i++) dp[i][0] = true;

        if ( arr[0] <=k) dp[0][arr[0]] = true;

        for ( int index=1; index< n; index++) {
            for ( int target=1; target<= k; target++ ){

                boolean NoTake = dp[index-1][target];

                boolean Take = false;
                if ( arr[index] <= target) {
                    Take = dp[index-1][target-arr[index]];
                }
                dp[index][target] = Take || NoTake;
            }
        }

        return dp[n-1][k];
    }


    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        int k =4;
        boolean ans = subsetSum(arr , k);

        System.out.println( ans);
    }
}
