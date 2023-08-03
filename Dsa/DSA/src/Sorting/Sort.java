package Sorting;

import java.util.Arrays;

public class Sort {

    public static int[] mergesort (int []arr){

        if (arr.length==1){          // if the only one element is remaining then return the element
            return arr;
        }

        int mid=arr.length/2;        // divide the array into two part



        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));         // left hand side of the array
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));    // right hnd side of the array
        return merge(left,right);
    }
    public static int [] merge(int[] left, int [] right){
        int [] mix=new int[left.length+right.length];

        int i=0;
        int j=0;
        int k=0;

        while (i<left.length && j<right.length){

            if (left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else {
                mix[k]=right[j];
                j++;
            }
            k++;

        }

        // it may be possible that one of the arrays is not completed
        // copy the remaining elements

        while (i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }

        return mix;


    }

    public static void main(String[] args) {
        int [] arr={6,3,7,9,5,4,8,2,1};

        arr=Sort.mergesort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
