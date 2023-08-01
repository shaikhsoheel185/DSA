package practice;

public class FindNthRootOfInteger {

    public static int RootOfInteger (int n) {
        int li=0;
        int hi=0;
        int ans=-1;
        int mid= li+(hi-li) /2;

        while (li<=hi) {

            int Square=mid*mid;

            if (Square==n){
                return mid;
            }if (Square<n){
                ans=mid;
                li=mid+1;
            }else {
                hi=mid-1;
            }

            mid=(li+hi) /2;

        }
        return (int)ans;
    }
    public static void main(String[] args) {
        int n=100;
        int x =FindNthRootOfInteger.RootOfInteger(n);
        System.out.print(x);

    }
}
