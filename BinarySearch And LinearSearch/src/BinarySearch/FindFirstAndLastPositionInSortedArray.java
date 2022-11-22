package BinarySearch;

public class FindFirstAndLastPositionInSortedArray{

    public static void SearchRange (int[] nums,int target) {
     int[] res= new int[2];


      int f =Search(nums,target,true);
      int l =Search(nums,target,false);

      res[0]=f;
      res[1]=l;

      for (int i=0; i< res.length; i++){

          System.out.print(res[i]);
      }
    }

    public static int Search (int [] nums , int target,boolean FindIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length;

        while (start<=end){

            int Mid =(start+end) /2;

            if (nums[Mid]>target) {

                end=Mid-1;

            }
            else if(nums[Mid]< target){

                start=Mid+1;

            }

            else {

                ans = Mid;

                if (FindIndex) {
                    end = Mid - 1;
                } else {
                    start = Mid + 1;
                }

            }

        }
        return ans;
    }



    public static void main(String[] args) {

        int [] nums = {2,5,6,6,7,8,9,9,10} ;

        int target =9;

        FindFirstAndLastPositionInSortedArray.SearchRange(nums,target);

    }
}
