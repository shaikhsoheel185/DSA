package BinarySearch;

public class RemoveDuplicatesFromSortedArray {

    public static int RemoveDuplicates (int []nums) {
        int n=nums.length;

                if(n < 2) return n;
                int id = 1;
                for(int i = 1; i < n; ++i)
                    if(nums[i] != nums[i-1]) nums[id++] = nums[i];
                return id;

                // after removing duplicates from sorted  array return size of new array

    }
    public static void main(String[] args) {
        int [] nums={1,1,2,2,2,3,3,3,4};
        int q =RemoveDuplicatesFromSortedArray.RemoveDuplicates(nums);
        System.out.print(q);
    }
}
