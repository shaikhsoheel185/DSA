package Tabulation;

//Problem Statement:
//
//        Given an array of ‘N’  positive integers, we need to return the maximum
//        sum of the subsequence such that no two elements of the subsequence are
//        adjacent elements in the array.
//
//        Note: A subsequence of an array is a list with elements of the array
//        where some elements are deleted ( or not deleted at all) and the elements
//        should be in the same order in the subsequence as in the array.


public class Maximum_sum_of_non_adjacent_elements {


    public static int maxSum( int [] arr , int index) {

        int [] dp = new int[arr.length+1];
        dp[0] = arr[0];

        for( int i = 1; i<arr.length; i++) {

            int noTake = 0 + dp[i-1];
            int Take = Integer.MIN_VALUE;
            if(i > 1) {
                Take = arr[i] + dp[i-2];
            }
            dp[i] = Math.max( noTake,Take);

        }

        return  dp[arr.length-1];
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,1,3,5,8,1,9};

        int ans = maxSum(arr ,arr.length-1);
        System.out.print(ans + " is the Maximum sum of non adjacent elements are");
    }
}
