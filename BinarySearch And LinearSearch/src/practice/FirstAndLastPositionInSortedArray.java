package practice;

public class FirstAndLastPositionInSortedArray {

    public static int FirstAndLast(int[] nums,int target) {
        int li=0;
        int hi=nums.length-1;
        int ans;

        while (li<hi) {

            int mid=(li+hi) /2;

             if (target<nums[mid]) {
                hi=mid-1;
            } if (target>nums[mid]) {
                 li=mid+1;
            }else {
                 ans=mid;

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums={2,5,6,6,7,8,9,9,9,10} ;


    }
}
