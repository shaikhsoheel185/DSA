/*
package String_Questinons;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring_Without_Repeating_Array {

    public int LongestSubstring (String s) {

        Map<Integer,Integer> map = new HashMap<>();

        int j=0  , max = 0;
        int i=0;

        while (j < s.length()) {
            map.put(s.charAt(j),map.getOrDefault(0)+1);
        }


        return -1;
    }


    public static void main(String[] args) {
        String s= "pwwkew";


    }

}
*/
