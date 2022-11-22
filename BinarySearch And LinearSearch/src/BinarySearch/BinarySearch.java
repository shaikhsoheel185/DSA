package BinarySearch;

public class BinarySearch {

    public static int BiSearch(int[]arr,int li,int hi,int mid,int target){

        while (li<=hi){
            if (arr[mid]==target){
                return mid;
            }
            else if (arr[mid]<target){
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

        int [] arr={123,678};

        int target=678;
        int li=0;
        int hi=arr.length-1;
        int mid;

        mid=(li+hi)/2;

        int res=BinarySearch.BiSearch(arr,li,hi,mid,target);

        System.out.println(res);

    }
}
