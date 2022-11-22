package BinarySearch;

public class FindNumberInReverselySortedArray {

    public static int BinarySearch(int [] arr , int start , int end ,  int target){

        while ( start <= end ) {

            int mid =  ( end + start ) / 2 ;

            if ( arr[ mid ] == target ) {
                return mid ;
            }

            else if (arr[ mid ] > target ) {
                start = mid + 1 ;
            }

            else {
                end = mid - 1 ;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int [] arr= {80 , 70 , 60 , 50 , 40 , 30 , 20 , 10 };

        int target = 10 ;
        int start = 0 ;
        int end = arr.length;


        int Result = FindNumberInReverselySortedArray.BinarySearch(arr,start,end,target);

        System . out . println ( Result ) ;

    }
}
