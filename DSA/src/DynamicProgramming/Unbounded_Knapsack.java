package DynamicProgramming;

//Unbounded Knapsack (DP-23)
//        Problem Link: Unbounded Knapsack
//
//        A thief wants to rob a store. He is carrying a bag of capacity W.
//        The store has ‘n’ items of infinite supply. Its weight is given by the ‘wt’ array
//        and its value by the ‘val’ array. He can either include an item in its knapsack or
//        exclude it but can’t partially have it as a fraction. We need to find the maximum
//        value of items that the thief can steal. He can take a single item any number of times
//        he wants and put it in his knapsack

public class Unbounded_Knapsack {

    public  static  int  fun ( int index , int [] wt , int[] val ,int weight) {

        if ( index == 0) {
            return  ((int) (weight / wt[0])) * val[0];
        }
        int NoTake = fun( index-1 , wt, val, weight);
        int Take = Integer.MAX_VALUE;
        if ( wt[index] <= weight) {
            Take = val[index] + fun( index, wt,val,weight-wt[index]);
        }
        return Math.max(Take,NoTake);
    }

    public static void main(String[] args) {

        int [] wt = { 2,4,6};
        int [] val = {5,11,13};
        int weight = 10;
        int ans = fun( wt.length-1 , wt , val, weight);
        System.out.println(ans);
    }
}
