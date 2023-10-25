package DynamicProgramming;


//Buy and Sell Stock – II | (DP -36)
//        Problem Statement:
//
//        Buy and Sell Stock – II
//
//        Problem Link: Best Time to Buy and Sell Stock II
//
//        We are given an array Arr[] of length n. It represents the price of a stock on ‘n’ days.
//        The following guidelines need to be followed:
//
//        We can buy and sell the stock any number of times.
//        In order to sell the stock, we need to first buy it on the same or any previous day.
//        We can’t buy a stock again after buying it once. In other words, we first buy a stock
//        and then sell it. After selling we can buy and sell again. But we can’t sell before
//        buying and can’t buy before selling any previously bought stock


import java.util.Arrays;

public class Buy_and_Sell_Stock_Two {

    private static int maxProfit( int index, int[] arr, int n, int buy) {

        if ( index == n) return  0;
        int profit;
        if ( buy == 0) {  // We can buy the stock

            profit = Math.max( 0 + maxProfit( index+1 , arr , n, 0),
                    -arr[index] + maxProfit( index+1, arr, n, 1));

        } else {  // We can sell the stock

            profit = Math.max(0 + maxProfit(index+1, arr, n, 1),
                    arr[index] + maxProfit( index+1, arr, n, 0));
        }

        return profit;

    }

    public static void main(String[] args) {

        int [] Arr = {7, 1, 5, 3, 6, 4};
        int buy = 0;
        int ans = maxProfit( 0 , Arr , 6 , buy);


        System.out.println("The maximum profit by selling the stock is" +ans );
    }


}
