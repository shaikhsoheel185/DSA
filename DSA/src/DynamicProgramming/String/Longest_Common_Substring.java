package DynamicProgramming.String;

public class Longest_Common_Substring {


    static int solve(int i, int j, int count , String str1, String str2)
    {

        if (i == 0 || j == 0)
        {
            return count;
        }

        if (str1.charAt(i - 1) == str2.charAt(j - 1))
        {
            count = solve(i - 1, j - 1, count + 1, str1, str2);
        }

        int count1 = solve(i, j - 1, 0, str1, str2);

        int count2 = solve(i - 1, j, 0, str1, str2);

        count = Math.max(count,Math.max(count1,count2));

        return count;
    }



    public static void main(String[] args) {

        String s1 = "abcjklp";
        String s2 = "acjkp";

        int N = s1.length();
        int M = s2.length();

         int ans =solve(N, M, 0, s1, s2);
         System.out.println( ans + " this is longest common substring ");
    }
}
