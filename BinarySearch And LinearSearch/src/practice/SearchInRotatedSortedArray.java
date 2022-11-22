package practice;

import java.util.Enumeration;

public class SearchInRotatedSortedArray {
    public static int GetPivot (int[] nums) {
        int li=0;
        int hi=nums.length;

        while (li<hi) {

            int mid=(li+hi) /2;

            if (nums[mid]<nums[0]){
                hi=mid;
            }else {
                li=mid+1;
            }
        }
        return li;
    }


    public static int BiSearch(int[]arr,int li,int hi,int target){

        while (li<=hi){
            int mid=(li+hi)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if (arr[mid]<target){
                li=mid+1;
            }
            else {
                hi=mid-1;
            }


        }
        return -1;
    }

    public static int RotatedSortedArray (int [] nums,int target) {
        int Piv =GetPivot(nums);

        if (target >= nums[Piv] && target < nums[nums.length-1]){
            return BiSearch(nums,Piv,nums.length-1,target);
        }else {
            return BiSearch(nums,0,Piv,target);
        }

    }

    public static void main(String[] args) {
        int[] nums={40,45,49,55,61,11,16,33};

        int target=16;

        int res =SearchInRotatedSortedArray.RotatedSortedArray(nums,target);
        System.out.print(res);
    }
}
