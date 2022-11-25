package Arrays_Problems;

public class RemoveDuplicatesFromSortedArray {

    public static void RemoveDuplicates (int [] nums) {
        int j=0;
        for (int i=0; i<nums.length-1; i++) {

                if (nums[i]!= nums[i+1]) {
                    nums[j]=nums[i];
                    j++;
                }


        }

        for (int i=0; i< nums.length-1; i++) {
            System.out.print(nums[i]);
        }
    }

    public static void main(String[] args) {
        int [] nums={1,1,1,1,2,2,2,2,3,3,4,4,4,4,5,5,5,5,5,6,6,7,7,7,8,8,8,9};
        RemoveDuplicatesFromSortedArray.RemoveDuplicates(nums);
    }

}
