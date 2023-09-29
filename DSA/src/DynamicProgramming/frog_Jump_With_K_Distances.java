package DynamicProgramming;

//This is a follow-up question to “Frog Jump” discussed in the previous article.
//        In the previous question, the frog was allowed to jump either one or two steps at a time.
//        In this question, the frog is allowed to jump up to ‘K’ steps at a time.
//        If K=4, the frog can jump 1,2,3, or 4 steps at every index

import java.util.Arrays;

public class frog_Jump_With_K_Distances {


    public  static  int frogJump (int index, int [] arr , int k , int [] dp) {

        if( index == 0) return  0;
        int min = Integer.MAX_VALUE;

        if( dp[index] != -1) return  dp[index];

        for( int i = 1; i<=k; i++ ) {


            if( index-i >= 0) {
                int  ksteps = frogJump(index-i , arr, k, dp) + Math.abs( arr[index-i]- arr[index]);
                min = Math.min(ksteps,min);
            }


        }

        return dp[index] = min; // The result is stored in the last element of dp
    }


    public static void main(String[] args) {
        int [] jump = {30, 10, 60, 10, 60, 50};
        int k = 2;

        int [] dp = new int[jump.length];
        Arrays.fill(dp,-1);

        int ans   = frogJump( jump.length-1, jump , k, dp);
        System.out.print( ans +" this is min value ");
    }
}

//
//    Time Complexity: O(N *K)
//
//        Reason: The overlapping subproblems will return the answer in constant time.
//        Therefore the total number of new subproblems we solve is ‘n’.
//        At every new subproblem, we are running another loop for K times.
//        Hence total time complexity is O(N * K).
//
//        Space Complexity: O(N)
//
//        Reason: We are using a recursion stack space(O(N)) and an array (again O(N)).
//        Therefore total space complexity will be O(N) + O(N) ≈ O(N)