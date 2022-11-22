package BinarySearch;

import java.util.Scanner;

public class BinarySearchAlgorithm {

    public static int BiSearch(int []arr,int li, int hi, int mid,int target){
        while (li<=hi){

            if (arr[mid]==target){
                return mid;
            }
            else if (mid<target){
                li=mid+1;
            }
            else {
                hi=mid-1;
            }

            mid=(li+hi)/2;
        }

        return -1;
    }
    public static void main(String[] args) {

        int [] arr={112,345,456,566,678,799,800,812,844,899,978};

        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int li=0;
        int hi=arr.length-1;
        int mid=(li+hi)/2;

        int Result = BinarySearchAlgorithm.BiSearch(arr,li,hi,mid,target);

        if (Result==-1){
            System.out.println("Not Found");
        }
        else {
            System.out.println(" ---> "+ Result);
        }
    }
}
