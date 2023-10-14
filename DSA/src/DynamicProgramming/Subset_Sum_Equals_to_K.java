package DynamicProgramming;

public class Subset_Sum_Equals_to_K {
    public  static  boolean Subsetsum( int index ,int [] arr , int k) {

        if( index == 0) return ( arr[index] == k);
        if ( k == 0) return true;

        boolean NoTake = Subsetsum( index-1 , arr , k);

        boolean Take= false;
        if ( arr[index] <= k )
         Take = Subsetsum( index-1, arr , k - arr[index]);

        return Take || NoTake;
    }


    public static void main(String[] args) {

        int [] arr = { 1,2,3,4};
        int k = 4;


        if (Subsetsum(arr.length-1 ,arr ,k))
            System.out.println("Subset with the given target found");
        else
            System.out.println("Subset with the given target not found");

    }
}
