package LeetCode.Easy.Problem_3;

import java.util.Arrays;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {

        int length = 0;
        for (int i = 0; i <s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)){
                    length++;
                }
            }
        }

        return length;
    }
}
