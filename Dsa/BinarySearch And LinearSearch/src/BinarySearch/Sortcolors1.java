package BinarySearch;

import java.util.Arrays;

public class Sortcolors1 {
    public static int[] sort(int[]arr){
        int C0=0;
        int C1=0;
        int C2=0;

        for (int i=0; i<arr.length; i++){

            if (arr[i]==0){
                C0++;
            } else if (arr[i]==1) {
                C1++;
            }

            arr[i]=2;

        }

        for (int i=0; i< C0+C1; i++){
            if(i<C0){
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[ ] arr={ 2,0,2,1,1,0,1,1,2,1};

        int[] res= Sortcolors1.sort(arr);

        System.out.print(Arrays.toString(res));
     }
}
