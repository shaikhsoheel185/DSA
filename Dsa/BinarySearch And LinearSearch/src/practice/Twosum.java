package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosum {
    public static int[] Sum(int[]nums,int target) {
        int [] res=new int[2];
        Map<Integer,Integer> map= new HashMap<>();
        for (int i=0; i< nums.length-2; i++) {

            if (map.containsKey(target-nums[i])){
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
        int[] z =Twosum.Sum(nums,target);
        System.out.print(Arrays.toString(z));
    }
}
