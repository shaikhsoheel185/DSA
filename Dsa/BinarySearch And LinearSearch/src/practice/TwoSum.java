package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int [] Sum (int []nums,int target) {

        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        int [] res=new int[2];

        for (int i=0;i<nums.length; i++ ) {

            if (map.containsKey(target-nums[i])) {
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i],i);

        }
        return res;
    }

    public static void main(String[] args) {

        int [] nums={3,2,5,8,7,11,10};
        int target= 11;

        int[] x =TwoSum.Sum(nums,target);
        System.out.print(Arrays.toString(x));

    }
}
