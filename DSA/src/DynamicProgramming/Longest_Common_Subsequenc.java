package DynamicProgramming;

public class Longest_Common_Subsequenc {

    public static int lcs ( int index1 , int index2, String A, String B) {

        if ( index1 < 0 || index2 < 0) return 0;

        if ( A.charAt(index1) == B.charAt(index2)) {
            return 1 + lcs( index1-1 , index2-1,A,B);
        }


        int left = lcs(index1-1 ,index2, A,B);
        int right = lcs( index1, index2-1, A,B);

        return Math.max(left,right);

    }


    public static void main(String[] args) {


        String s1 = "acd";
        String s2 = "ced";

        int n= s1.length();
        int m= s1.length();

        int ans = lcs( n-1 , m-1 , s1 , s2);
        System.out.println(ans);
    }
}
