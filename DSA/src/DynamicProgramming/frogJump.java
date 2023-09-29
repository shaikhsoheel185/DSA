package DynamicProgramming;


//    Given a number of stairs and a frog, the frog wants to climb from the 0th stair to the (N-1)th stair.
//        At a time the frog can climb either one or two steps. A height[N] array is also given. Whenever the frog jumps
//        from a stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]), where abs() means the
//        absolute difference.
//        We need to return the minimum energy that can be used by the frog to jump from stair 0 to stair N-1.


public class frogJump {


    public static int frogJump ( int index ,int [] arr) {

        if( index == 0) return  0;

//        if ( index < 0) return  Integer.MAX_VALUE;

        int jump1 = frogJump( index-1, arr) + Math.abs( arr[index] - arr[index-1]);

        int jump2 = Integer.MAX_VALUE;

        if( index > 1) {
             jump2 = frogJump(index-2, arr) + Math.abs( arr[index] - arr[index-2]);
        }


        return  Math.min( jump1,jump2);
    }


    public static void main(String[] args) {

      int [] jump = {10, 20, 30, 10};

      int ans   = frogJump( jump.length-1, jump);
      System.out.print( ans +" this is min value ");
    }
}



