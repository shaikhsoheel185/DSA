package DynamicProgramming;

//Buy and Sell Stock – III | (DP – 37)
//        Problem Link: Best Time to Buy and Sell Stock III
//
//        We are given an array Arr[] of length n. It represents the price of a stock on ‘n’ days.
//        The following guidelines need to be followed:
//
//        We can buy and sell the stock any number of times.
//        In order to sell the stock, we need to first buy it on the same or any previous day.
//        We can’t buy a stock again after buying it once. In other words, we first buy a stock and then sell it.
//        After selling we can buy and sell again. But we can’t sell before buying and can’t buy before selling
//        any previously bought stock.
//        We can do at most 2 transactions



public class Buy_and_Sell_Stock_Three {


    public static int maxprofit( int index ,int [] arr , int n , int buy , int cap) {

       if ( index == n) return  0;
       if ( cap == 0) return  0;

        int profit = 0;

        if ( buy == 0) {
            int left = 0 + maxprofit( index+1 , arr, n, 0, cap);
            int right = -arr[index] + maxprofit( index+1, arr, n, 1, cap);
            profit = Math.max(left,right);
        } else  {

            int left = 0 + maxprofit( index+1 ,arr, n, 1, cap);
            int right = arr[index] + maxprofit( index+1, arr, n, 0, cap-1);
            profit = Math.max(left, right);
        }
        return profit;
    }


    public static void main(String[] args) {

        int[] prices = {3,3,5,0,0,3,1,4};
        int n = prices.length;

        int ans = maxprofit( 0 ,prices , n, 0, 2);
        System.out.println("The maximum profit by selling the stock is   "  +  ans );
    }
}
