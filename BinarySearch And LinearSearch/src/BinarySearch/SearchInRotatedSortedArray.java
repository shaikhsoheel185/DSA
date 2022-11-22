package BinarySearch;

public class SearchInRotatedSortedArray {
    public static int GetPivot (int[]nums) {
        int li=0;
        int hi=nums.length;

        while (li<hi) {

            int mid =(li+hi) /2;

            if (nums[mid]>nums[0]){
                li=mid+1;
            }else {
                hi=mid;
            }
        }
        return li;
    }
    public static int BinarySearch(int [] nums,int li, int hi, int target) {
        while(li<=hi) {

            int mid=(li+hi) /2;

            if (nums[mid] == target) {
                return mid;
            }

            if (target<nums[mid]) {
                hi=mid-1;
            }else {
                li=mid+1;
            }
        }
        return -1;
    }

    public static int SearchInRoatatedArray (int[] nums,int li,int hi,int target) {
        int Pivot = GetPivot(nums);

        if (target >=Pivot && target < nums[nums.length-1]) {
            return BinarySearch (nums,Pivot,hi,target);         // For The Second Array
        }else {
            return BinarySearch (nums,li,Pivot,target);         // For The First Array
        }
    }

    public static void main(String[] args) {
         int [] nums = {100,110,120,130,140,60,65,80,90,95};
         int li=0;
         int hi= nums.length;
         int target=90;

         int Result =SearchInRotatedSortedArray.SearchInRoatatedArray(nums,li,hi,target);
         System.out.print(Result);

    }
}
