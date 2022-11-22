package BinarySearch;

public class FirstAndLastPositionInSortedArray {


    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = First(nums, target);
        res[1] = Last(nums, target);
        return res;
    }
    public static int First(int []arr,int target){
        int start= 0;
        int end = arr.length;
        int ans = -1;

        while (start<=end){

            int mid = (start+end) /2;

            if (arr[mid]>target) {

                end=mid-1;

            }
            else
            {
                start=mid+1;
            }

            if (arr[mid] == target){
                ans=mid;
                end=mid-1;
            }

        }

        return ans;
    }



    public static int Last(int []arr,int target){

        int start= 0;
        int end = arr.length;
        int ans = -1;

        while (start<=end){

            int mid = (start+end) /2;

            if (arr[mid]>target) {

                end=mid-1;

            }
            else
            {
                start=mid+1;
            }

            if (arr[mid] == target){
                ans=mid;
                start=mid+1;
            }

        }
        return ans;
    }



    public static void main(String[] args) {

        int [] nums = {2,5,6,6,7,8,9,10} ;

        int target=6;

        int [] s= FirstAndLastPositionInSortedArray.searchRange(nums,target);

        for (int i=0; i<s.length; i++){

            System.out.println(s[i]);
        }


    }
}
