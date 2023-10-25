package DynamicProgramming;

public class Buy_and_Sell_Stock {



    public static int maxProfit( int [] arr ) {

        int min = arr[0];
        int maxprofit =0;

        for ( int i=1; i<arr.length; i++) {

            int profit = arr[i]- min;
            maxprofit  =Math.max(profit,maxprofit);
            min = Math.min(min , arr[i]);
        }

        return maxprofit;
    }


    public static void main(String[] args) {


        int [] arr = {7,1,5,3,6,4};

        int ans = maxProfit(arr);
        System.out.println("The maximum profit by selling the stock is" + ans);
    }
}
