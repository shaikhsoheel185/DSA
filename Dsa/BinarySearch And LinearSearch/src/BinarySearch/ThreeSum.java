package BinarySearch;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> Sum (int []nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new LinkedList<>();

        for (int i=0; i< nums.length-2; i++) {


            if (i==0 || i>0 && nums[i]!=nums[i-1]) {

                int li=i+1; int hi=nums.length-1; int sum=0+nums[i];
                while (li<hi) {

                    if (nums[li]+nums[hi]==sum) {
                        res.add(Arrays.asList(nums[i],nums[li],nums[hi]));
                        
                        while (li<hi && nums[li]==nums[li+1]){
                            li++;
                        }
                        while (li<hi && nums[hi]==nums[hi-1]) {
                            hi--;
                        }

                        li++;
                        hi--;

                    } else if (nums[li]+nums[hi]>sum) {              // TC- 0(n2)
                        li++;                                        // Sc- 0(n)
                    }else {
                        hi--;
                    }
                }

            }
        }
        return res;
    }


    public static void main(String[] args) {
        int [] nums={-1,0,1,2,-1,-4};
        ThreeSum.Sum(nums);
    }
}
