package Tabulation;

public class Longest_Common_Substring_tab {

    public static int lcs ( String A, String B){

        int n = A.length();
        int m = B.length();
        int ans=0;
        int max = 0;
        int [][] dp = new int[n][m];

        for ( int i=0; i<n; i++) {
            dp[0][i] = 0;
        }
        for ( int i=0; i<m; i++) {
            dp[i][0] =0;
        }

        for ( int index1 =1; index1<=n; index1++) {
            for ( int index2 =1; index2<=m; index2++) {

                if ( A.charAt(index1-1) ==B.charAt( index2-1) ){
                    dp[index1][index2] = dp[index1-1][index2-1] +1;
                    max = Math.max(dp[index1][index2] , max);
                }  else  {

                    dp[index1][index2]= 0;
                }


            }
        }
        return max;
    }


    public static void main(String[] args) {

        String s1 = "acd";
        String s2 = "ced";

        int n= s1.length();
        int m= s1.length();

        int ans = lcs( s1, s2);
        System.out.println(ans);
    }
}
