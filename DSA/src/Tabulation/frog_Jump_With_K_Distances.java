package Tabulation;

//This is a follow-up question to “Frog Jump” discussed in the previous article.
//        In the previous question, the frog was allowed to jump either one or two steps at a time.
//        In this question, the frog is allowed to jump up to ‘K’ steps at a time. If K=4,
//        the frog can jump 1,2,3, or 4 steps at every index

public class frog_Jump_With_K_Distances {
    public  static  int frogJump (int index, int [] arr , int k , int [] dp) {
        dp[0] = 0;

        // Loop through the array to fill in the dp array
       for( int i = 1; i<arr.length; i++){
           int min = Integer.MAX_VALUE;

           // Loop to try all possible jumps from '1' to 'k'
           for (int j= 1; j<=k; j++ ) {

               if( i-j >= 0) {
                   int ksteps = dp[i-j] + Math.abs(arr[i] - arr[i-j]);
                   min = Math.min(ksteps,min);
               }
           }

           dp[i] = min;   // The result is stored in the last element of dp
       }

       return  dp[arr.length-1];

    }

    public static void main(String[] args) {
        int [] jump = {30, 10, 60, 10, 60, 50};
        int k = 2;

        int [] dp = new int[jump.length];


        int ans   = frogJump( jump.length-1, jump , k, dp);
        System.out.print( ans +" this is min value ");
    }
}


//    Time Complexity: O(N*K)
//
//        Reason: We are running two nested loops, where outer loops run from 1 to n-1 and the inner loop runs from 1 to K
//
//        Space Complexity: O(N)
//
//        Reason: We are using an external array of size ‘n’’.