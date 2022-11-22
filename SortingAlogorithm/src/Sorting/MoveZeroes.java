package Sorting;

import java.util.Arrays;

public class MoveZeroes {

    public static int[] zero(int [] arr){

        int k=0;

        for (int i=0; i< arr.length;i++){

            if (arr[i]!=0){

                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;

                k++;
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int [] arr={3,0,1,2,0,5};

        int [] z=MoveZeroes.zero(arr);

        System.out.println(Arrays.toString(z));

    }
}
