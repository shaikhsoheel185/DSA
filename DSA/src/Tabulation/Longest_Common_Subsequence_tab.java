package Tabulation;

public class Longest_Common_Subsequence_tab {

    public static int lcs(String str1, String str2){
        // Write your code here.

        int n = str1.length();
        int m = str2.length();
        int ans=0;
        int [][] dp = new int [n+1][m+1];


        for( int i=0; i<=n; i++ ) dp[i][0] = 0;

        for( int i=0; i<=m; i++ ) dp[0][i] = 0;

        for( int i= 1; i<= n; i++) {
            for( int j= 1; j<= m; j++) {

                if( str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(dp[i][j], ans);
                }

                else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String s1 = "abcjklp";
        String s2 = "acjkp";

        // Call the lcs function and print the result
        System.out.println("The Length of Longest Common Substring is " + lcs(s1, s2));

    }
}
