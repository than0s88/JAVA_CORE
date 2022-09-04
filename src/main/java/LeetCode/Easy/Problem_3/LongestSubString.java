package LeetCode.Easy.Problem_3;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubString {
    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }
    public static void lengthOfLongestSubstring(String s) {

        int ans = 0;

        HashMap<Character, Integer> map = new HashMap<>(); // current index of character

        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < 3; j++) {

                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }

                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
        }
        System.out.println(ans);
    }
}
