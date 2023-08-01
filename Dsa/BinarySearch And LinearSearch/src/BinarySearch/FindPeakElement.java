package BinarySearch;

public class FindPeakElement {
    public static int peakElement(int [] arr, int li, int hi, int mid){

        while (li<=hi){

            mid = ( li + hi ) / 2 ;

            if( arr[mid] > arr[ mid - 1 ] && arr [mid]  > arr[mid + 1] ){
                return mid;
            }

            if ( arr[mid] > arr[mid -1] ){

                li = mid+1 ;
            }
            else {
                hi = mid - 1 ;
            }


        }
        return -1;
    }
    public static void main(String[] args) {
                                                         //       Time = O(log n)  Space= O(1)
        int [] arr={1,4,7,9,15,13,11,3,1};

        int li= 0 ;
        int hi= arr.length-1 ;
        int mid= ( li+hi ) /  2 ;

        int result= FindPeakElement.peakElement(arr,li,hi,mid) ;

        if ( result == -1 ){
            System.out.println("<-- Not Found -->");
        }

        else {
            System.out.println(" --> " + result);
        }
    }
}
