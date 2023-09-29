package BinarySearch;

public class FindPeaKElementInMountainArray {
    public static int BinarySearch(int []arr,int li,int hi,int mid){

        while (li<=hi){

            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid]>arr[mid-1]){
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
        int[] arr={10,20,40,70,90,100,108,7,6,5,4};

        int li=0;
        int hi=arr.length-1;
        int mid=(li+hi)/2;

       int Output = FindPeaKElementInMountainArray.BinarySearch(arr,li,hi,mid);
       if (Output==-1){
           System.out.println(" Not Found ");
       }
       else {
           System.out.println(" --> " + Output );
       }

    }
}
