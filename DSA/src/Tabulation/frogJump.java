package Tabulation;

//    Given a number of stairs and a frog, the frog wants to climb from the 0th stair to the (N-1)th stair.
//        At a time the frog can climb either one or two steps. A height[N] array is also given. Whenever the frog jumps
//        from a stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]), where abs() means the
//        absolute difference.
//        We need to return the minimum energy that can be used by the frog to jump from stair 0 to stair N-1.

public class frogJump {


    public static int frogJump ( int index ,int [] arr) {

        int [] dp = new int[ arr.length+1];
        int n= arr.length;

        dp[0] = 0;

        for( int i =1; i<n; i++) {

            int jump1 = dp[i-1] + Math.abs( arr[i-1] - arr[i]);
            int jump2 = Integer.MAX_VALUE;
            if( i > 1) {
                jump2 = dp[i-2] + Math.abs( arr[i-2] - arr[i]);
            }

            dp[i] = Math.min(jump1, jump2);
        }


        return  dp[n-1];
    }



    public static void main(String[] args) {

        int [] jump = {10, 20, 30, 10};

        int ans   = frogJump( jump.length-1, jump);
        System.out.print( ans +" this is min value ");
    }
}
