package DynamicProgramming;

//Longest Increasing Subsequence | (DP-41)
//        In the coming articles, we will discuss problems related to ‘Longest Increasing Subsequence’.
//        Before proceeding further, let us understand the “Longest Increasing Subsequence”,
//        or rather what is a “subsequence”?
//
//        A subsequence of an array is a list of elements of the array where some elements
//        are deleted ( or not deleted at all) and they should be in the same order in the
//        subsequence as in the original array.
//
//        For example, for the array: [2,3,1] ,
//        the subsequences will be [{2},{3},{1},{2,3},{2,1},{3,1},{2,3,1}} but {3,2}
//        is not a subsequence because its elements are not in the same order as the original array.



public class longest_increasing_subsequence {

    public static  int lis ( int index, int prev, int [] arr, int n) {

        if ( index == n) return 0;

        int noTake = 0 + lis( index +1, prev, arr, n);

        int Take = 0;

        if ( prev == -1 || arr[index] > arr[prev]) {
            Take = 1 + lis( index +1, index, arr, n);
        }

        return  Math.max(Take, noTake);


    }


    public static void main(String[] args) {


        int arr[] = {10, 9, 2, 5, 3, 7, 101, 18};

        int n = arr.length;


        int ans = lis( 0, -1, arr, n);
        System.out.println("The length of the longest increasing subsequence is " + ans);
    }
}
