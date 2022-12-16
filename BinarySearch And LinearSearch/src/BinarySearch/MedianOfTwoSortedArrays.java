package BinarySearch;

public class MedianOfTwoSortedArrays {

    public static double Median (int[]arr1,int[]arr2,int m,int n) {
        if (m<n) {
            return Median(arr1,arr2,m,n);
        }
        int li=0;  int hi=m;  int medians=((m+n)+1) /2;

        while (li<=hi) {

            int cut1=(li+hi) >> 1;
            int cut2=medians-cut1;

            int l1 = (cut1==0)? Integer.MIN_VALUE: arr1[cut1-1];
            int l2 = (cut2==0)? Integer.MIN_VALUE: arr2[cut2-1];

            int r1 = (cut1==m)? Integer.MAX_VALUE: arr1 [cut1];
            int r2 = (cut2==n)? Integer.MAX_VALUE: arr2 [cut2];

            if (l1<=r2 && l2<=r1) {

                if ((m+n) % 2 !=0)

                    return Math.max(l1,l2);
                else
                    return (Math.max(l1,l2) + Math.min(r1,r2)) /2.0;
            }

            else if (l1 > r2) {
                hi = cut1 - 1;
            } else {
                li =cut1 + 1;
            }

        }
        return 0.0;
    }

    public static void main(String[] args) {
        int [] arr1={1,4,5,16};
        int [] arr2={2,3,10,17,18};

        int m=arr1.length;
        int n=arr2.length;

        double z = MedianOfTwoSortedArrays.Median(arr1,arr2,m,n);
        System.out.print(z);

    }
}
