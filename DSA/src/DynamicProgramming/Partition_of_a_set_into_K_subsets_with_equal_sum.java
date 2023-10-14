package DynamicProgramming;

public class Partition_of_a_set_into_K_subsets_with_equal_sum {


    public  static  boolean Subsetsum( int index ,int [] arr , int k) {

        if( index == 0) return ( arr[index] == k);
        if ( k == 0) return true;

        boolean NoTake = Subsetsum( index-1 , arr , k);

        boolean Take= false;
        if ( arr[index] <= k )
            Take = Subsetsum( index-1, arr , k - arr[index]);

        return Take || NoTake;
    }


    public  static boolean solve ( int [] arr ) {

        int tosum = 0;
        for (int i=0; i<arr.length; i++) {
            tosum += arr[i];
        }

        if ( tosum % 2 != 0)  {
            return  false;
        } else {

            int k = tosum/2;
            return Subsetsum( arr.length-1, arr, k);
        }


    }


    public static void main(String[] args) {

       int [] ar = {};
       int k = 0;
       boolean ans = solve(ar );
       System.out.println(ans);
    }

}
