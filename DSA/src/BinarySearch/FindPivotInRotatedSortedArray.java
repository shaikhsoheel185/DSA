package BinarySearch;

public class FindPivotInRotatedSortedArray {
    public static int FindPivot (int [] nums) {
        int li=0;
        int hi=nums.length;

        while (li<hi) {

            int mid=(li+hi) /2;

            if (nums[mid] >= nums[0]) {
                li=mid+1;
            }else {
                hi=mid;
            }
        }
        return li;
    }

    public static void main(String[] args) {
        int [] nums={11,12,13,14,7,8,9};
        int x =FindPivotInRotatedSortedArray.FindPivot(nums);
        System.out.print(x);
    }
}
