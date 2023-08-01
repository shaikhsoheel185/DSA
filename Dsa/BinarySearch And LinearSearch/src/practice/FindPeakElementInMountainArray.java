package practice;

public class FindPeakElementInMountainArray {

    public static int MountainArray(int [] nums) {
        int li =0;
        int hi =nums.length-1;

        while (li<hi){

            int mid= (li+hi) /2;

            if (nums [mid] < nums[mid+1]){
                li=mid;

            } else {
                hi=mid;
            }

            if (nums[mid]>nums[mid-1] && nums[mid] > nums[mid+1]) {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums= {4,8,10,7,6,3,2};
        int a =FindPeakElementInMountainArray.MountainArray(nums);
        System.out.print(a);
    }
}
