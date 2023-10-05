package DynamicProgramming;

//A thief needs to rob money in a street. The houses in the street are arranged in a circular manner.
//        Therefore the first and the last house are adjacent to each other.
//        The security system in the street is such that if adjacent houses are robbed,
//        the police will get notified.
//
//        Given an array of integers “Arr” which represents money at each house,
//        we need to return the maximum amount of money that the thief can rob without alerting the police.

import java.util.ArrayList;
public class House_Robber {

    public  static int RobStreet( ArrayList<Integer> arr, int index ) {

        if ( index == 0) return  arr.get(index);

        int noTake = 0 + RobStreet( arr , index-1);
        int Take = Integer.MAX_VALUE;

        if (index>1) {
            Take = arr.get(index) + RobStreet( arr , index-2);
        }

        return Math.max(Take,noTake);

    }


    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(6);


        int ans = RobStreet(arr, arr.size()-1);

        System.out.println( ans + " Maximum robbery amount ");
    }
}
