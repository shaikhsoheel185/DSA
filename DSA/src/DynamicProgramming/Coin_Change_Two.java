package DynamicProgramming;

//Coin Change 2 (DP – 22)
//        Problem Link: Ways to Make a Coin Change
//
//        We are given an array Arr with N distinct coins and a target.
//        We have an infinite supply of each coin denomination.
//        We need to find the number of ways we sum up the coin values to give us the target.
//        Each coin can be used any number of times

public class Coin_Change_Two {
    public static int fun( int index ,int [] arr , int target){

        if ( index < 0) return 0;
        if ( target == 0) return 1;

        int NoTake = fun( index-1 , arr , target);
        int Take = 0;

        if ( arr[index] <= target) {
            Take = fun( index , arr , target- arr[index]);
        }

        return Take+NoTake;

    }


    public static void main(String[] args) {

        int [] arr= { 1,2,3};

        int Target = 4;

        int ans = fun( arr.length-1 , arr , Target);
        System.out.println(ans);
    }
}
