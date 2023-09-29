package BinarySearch;

public class SortColors {


        public static void sortColors(int[] nums) {
            int c0 = 0, c1 = 0;
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] == 0)
                {
                    c0++;
                }else if(nums[i] == 1)
                {
                    c1++;
                }
                nums[i] = 2;
            }


            for(int i = 0; i < c0 + c1; i++)
            {
                if(i < c0)
                {
                    nums[i] = 0;
                }else
                {
                    nums[i] = 1;
                }
            }
        }


    public static void main(String[] args) {
        int [] nums={2,0,2,1,1,0,1,1,2,1};

        SortColors.sortColors(nums);

        for (int i=0; i< nums.length; i++){
            System.out.print(nums[i]);
        }


    }
}
