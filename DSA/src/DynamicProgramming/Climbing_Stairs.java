package DynamicProgramming;

import java.util.Arrays;

public class Climbing_Stairs {





    public static int stairs ( int n, int [] dp) {

        if( n == 0) return 1;
        if( dp[n] != -1) return  dp[n];
        if( n < 0) return 0;

        int onestep = stairs(n-1,dp);
        int twostep = 1;
        if( n > 1) {
             twostep = stairs( n-2,dp);
        }

        return dp[n] = onestep+twostep;

    }



    public static void main(String[] args) {
        int n = 5; // You can change this value to test different cases
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        int ways = stairs(n-1,dp);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways);


    }

}