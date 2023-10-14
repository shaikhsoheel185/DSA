package DynamicProgramming;

public class Minimum_Coins {


    public static int minimumCoins( int index ,int [] arr , int target){

        if (index == 0) {

            if ( target % arr[0] == 0) {
                return target/arr[0];
            } else  {
                return Integer.MAX_VALUE;
            }

        }

        int NotTake = minimumCoins( index-1 , arr , target);
        int Take = Integer.MAX_VALUE;

        if ( arr[index] <= target) {
            Take = 1 + minimumCoins( index ,arr , target-arr[index]);
        }
        return Math.min(Take,NotTake);

    }


    public static void main(String[] args) {

        int [] arr ={ 1,2,3};
        int target = 7;

        int ans = minimumCoins( arr.length-1 ,arr , target);
        System.out.println(ans);
    }
}
