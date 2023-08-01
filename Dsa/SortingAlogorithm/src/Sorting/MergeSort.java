package Sorting;

public class MergeSort {

    public static void Divide(int[] nums,int[] aux,int start,int end){

        if (start < end){
            return;
        }

        int mid= (start+end) /2;

        Divide(nums,aux,start,mid);
        Divide(nums,aux,mid+1,end);

        Conquer(nums,aux,start,mid,end);
    }


    public static void Conquer(int[]nums,int []aux,int start,int mid,int end) {
        int i=0; int k=0;
         int j=mid;

        while (i<=mid && j<=end){

            if (nums[i]<nums[j]){
                aux[k]=nums[i];
                i++;
            }else {
                aux[k]=nums[j];
            }
            k++;
        }

        while (i<mid){
            aux[k]=nums[i];
            i++;
            k++;
        }
        while (j<end){
            aux[k]=nums[j];
            j++;
            k++;
        }



    }

    public static void main(String[] args) {
        int [] nums={1,4,3,2,5,6,7};

        int[] aux=new int[nums.length];
        int start =0;
        int end =nums.length-1;

        MergeSort.Divide(nums,aux,start,end);

        for (int i=0; i< aux.length; i++) {
            System.out.print(aux[i]);
        }
    }
}
