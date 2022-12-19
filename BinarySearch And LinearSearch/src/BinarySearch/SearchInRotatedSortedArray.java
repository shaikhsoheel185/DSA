package BinarySearch;

public class SearchInRotatedSortedArray {

    public static int BinarSearch (int []nums,int target) {
        int li=0; int hi=nums.length-1;
        while (li<=hi) {
            int mid=(li+hi) /2;

            if (target==nums[mid]){
                return mid;
            }
            if (nums[0]<=nums[mid]){
                if (target<nums[mid] && target>=nums[0]){
                    hi=mid-1;
                }else {
                    li=mid+1;
                }
            }
            else {
                if (nums[mid]<=nums[hi]) {
                    if (target>= nums[mid] && target<=nums[hi]){
                        li=mid+1;
                    }else {
                        hi=mid-1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums={4,5,6,7,8,9,10,1,2,3};
        int target=5;
        int x =SearchInRotatedSortedArray.BinarSearch(nums,target);
        System.out.print(x);
    }
}
