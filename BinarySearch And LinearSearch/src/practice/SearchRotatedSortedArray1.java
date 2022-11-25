package practice;

public class SearchRotatedSortedArray1 {

    public static int Search (int [] nums,int target) {
        int li=0;
        int hi=nums.length;

        while (li<=hi) {

            int mid=(li+hi) /2;

            if (nums[mid]==target) {
                return mid;
            }

            if (nums[mid] > nums[0]) {
                if (target >= nums[0] && target < nums[mid] ) {  // Left Part Sorted
                    hi=mid-1;
                }
                else {
                    li=mid+1;
                }
            }
            else {

                if (target>=nums[mid] && target <=nums[hi-1]) {
                    li=mid+1;
                }else {                               // Right Part Sorted
                    hi=mid-1;
                }

            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int [] nums={4,5,6,7,8,9,10,1,2,3};
        int target=3;
        int q  =SearchRotatedSortedArray1.Search(nums,target);
        System.out.print(q);
    }
}
