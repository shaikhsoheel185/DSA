package BinarySearch;

import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public  static int BinarySearch (int []arr , int li , int hi , int Target ) {

        while ( li <= hi ) {                         // BinarySearch Recursive

            int  mid = ( li + hi ) / 2 ;

            if ( arr [mid] == Target )

                return mid ;

            if ( arr[mid] < Target )

                return BinarySearch( arr, mid+1, hi, Target);

                return BinarySearch( arr, li, mid-1, Target);
        }
        return -1 ;
    }
    public static void main(String[] args) {

        int [] arr={112,234,367,498,513,523,540,645,700};

        Scanner sc = new Scanner ( System . in ) ;

        int Target = 700 ;
        int li = 0 ;
        int hi = arr.length-1 ;


        int Result = BinarySearchUsingRecursion. BinarySearch ( arr , li , hi , Target ) ;

        if ( Result == -1 ) {
            System.out.println (" Not Found ") ;
        }

        else {                                                               // Time Complexity --> O(log n)
            System.out.println (" ---> " + Result ) ;                            // Space Complexity--> O(log n)
        }

    }
}
