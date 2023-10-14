package DynamicProgramming;

public class Longest_Common_Substring_ {


    public static int lcs ( int index1 , int index2 , String A , String B , int count) {

        if ( index1 == 0 || index2 == 0) return count;

        if ( A.charAt(index1-1) == B.charAt(index2-1)) {
            count = lcs( index1-1 ,index2-1 , A , B , count+1);
        }

        int left = lcs( index1-1 , index2, A, B,  0);
        int right = lcs( index1 , index2-1 , A, B, 0);
        count = Math.max( count , Math.max(left,right));

        return count;
    }


    public static void main(String[] args) {


        String s1 = "abcjklp";
        String s2 = "acjkp";

        int N = s1.length();
        int M = s2.length();

        int ans = lcs( N-1 , M-1 , s1, s2 , 0);
        System.out.println(ans);
    }
}
