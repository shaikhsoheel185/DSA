package BinarySearch;

public class NthRootOfInteger {

    public static int Sroot(int n){
        int start=0;
        int end=n;
        int ans = -1;

        while (start<end){
            int mid=(start+end) /2;

            if (mid*mid<n){
                start=mid+1;

            }  else if (mid*mid>n) {
                end=mid-1;

            }
                return mid;

        }
        return ans;
    }
    public static void main(String[] args) {

       int aa =NthRootOfInteger.Sroot(25);
       System.out.print(aa);

    }
}
