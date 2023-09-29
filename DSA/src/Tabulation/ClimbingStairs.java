package Tabulation;

import java.util.Arrays;

public class ClimbingStairs {


    public static int climbingStairs( int n ) {

        int [] dp = new int [n+1];

        dp[0] = 1;
        dp[1] = 2;

        for( int i = 2; i<n; i++) {

            int step1 = dp[i-1];
            int step2 = dp[i-2];

            dp[i] = step1+step2;
        }

        return  dp[n-1];

    }



    public static void main(String[] args) {
        int n = 5; // You can change this value to test different cases


        int ways =  climbingStairs (n);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways);


    }


}
