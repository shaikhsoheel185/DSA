package LinerSearch;

import java.util.Scanner;

public class LinearSearch {

    public static int LinSearch(int []arr,int target){

        for (int i=0;i<arr.length; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr={12,31,45,67,78,89,112,189,298,350};

        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();

        int Result=LinearSearch.LinSearch(arr,target);

        if (Result==-1){
            System.out.println("--> Not Found <-- ");                   // Time Comlexity   --> O(n)
        }                                                               // Space Complexity --> O(1)
        else {
            System.out.println(" Index is --> "+ Result);
        }

    }
}
