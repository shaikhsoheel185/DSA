package Tabulation;

import java.util.Arrays;

public class Longest_Common_Subsequence {

    public  static  int lcs ( String A , String B) {

        int len1 =0;
        int len2 =0;
        int n = A.length();
        int m = B.length();
        int [][] dp = new int[n+1][m+1];

        for ( int i = 0; i<=n; i++) dp[i][0] = 0;

        for ( int j =0; j<=m; j++ ) dp[0][j] = 0;

        for (int i =1; i<=n; i++) {
            for ( int j=1; j<=m; j++) {

                if( A.charAt(i-1) == B.charAt(j-1)) dp [i][j] = 1 + dp[i-1][j-1];
                    // If the characters at the current indices are the same, increment the LCS length

                else {

                    len1 = dp[i-1][j];
                    len2 = dp[i][j-1];

                    // If the characters are different, choose the maximum LCS length by either
                  // excluding a character in s1 or excluding a character in s2
                    dp[i][j] = Math.max(len1,len2);
                }



            }
        }

        return dp[n][m];    // Return the length of the Longest Common Subsequence (LCS)
    }


    public static void main(String[] args) {



        String s1 = "acd";
        String s2 = "ced";

        int n= s1.length();
        int m= s1.length();


        // Call the lcs function and print the result
        System.out.println("The Length of Longest Common Subsequence is " + lcs(s1, s2));
    }

    
}
