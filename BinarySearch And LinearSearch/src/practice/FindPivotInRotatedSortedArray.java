package practice;

public class FindPivotInRotatedSortedArray {

    public static int PivotRotatedArray (int [] nums) {
        int li=0;
        int hi=nums.length;
        while (li<hi) {

            int mid=(li+hi) /2;
            if (nums[mid] > nums[0]) {
                li=mid+1;
            }else {
                hi=mid;
            }
        }
        return li;
    }

    public static void main(String[] args) {
        int [] nums={30,40,50,60,70,10,20};

        int z =FindPivotInRotatedSortedArray.PivotRotatedArray(nums);
        System.out.print(z);
    }
}
