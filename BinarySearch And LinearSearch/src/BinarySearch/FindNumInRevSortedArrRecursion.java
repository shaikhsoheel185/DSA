package BinarySearch;

public class FindNumInRevSortedArrRecursion {
    public static int Search(int [ ] arr, int start, int end , int target ){
        while (start<=end){

            int mid = (start+end) /2 ;                                         // time complexity = 0(log n)

            if ( arr[mid] == target )
                return mid ;

            if (arr[mid] > target)

            return Search(arr,mid+1,end,target);

            return Search(arr,start,mid-1,target);


        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={701,605,509,404,311,301,10};

        int start=0;
        int end =arr.length-1;
        int target = 10;

        int res =FindNumInRevSortedArrRecursion.Search(arr,start,end,target);

        System.out.println(res);
    }
}
