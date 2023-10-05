package Tabulation_And_Optimization;

public class Maximum_sum_of_non_adjacent_elements {

    public static int maxSum( int [] arr, int index) {

        int pre = arr[0];
        int pre2 = 0;

        for ( int i=1; i<arr.length; i++) {

            int noTake = pre;
            int Take = Integer.MIN_VALUE;
            if( i > 1) {
                Take =  arr[i] + pre2;
            }

            int cur =Math.max(noTake,Take);

            pre2 = pre;
            pre = cur;
        }

        return  pre;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,1,3,5,8,1,9};

        int ans = maxSum(arr ,arr.length-1);
        System.out.print(ans + "  is the Maximum sum of non adjacent elements are");
    }
}
