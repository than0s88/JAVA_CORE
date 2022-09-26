package LeetCode.Easy.Problem_3;

import java.util.HashMap;
public class LongestSubString {
    public static void main(String[] args) {
//        System.out.println("abcabcbb: "+lengthOfLongestSubstring("abcabcbb"));
//        System.out.println("bbbbb: "+lengthOfLongestSubstring("bbbbb"));
//        System.out.println("pwwkew: "+lengthOfLongestSubstring("pwwkew"));
        lengthOfLongestSubstring("pwwkew");
    }
    public static void lengthOfLongestSubstring(String s) {
        int answer = 0;
        int length = s.length()-1;
        int contain = 0;

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <=length; i++) {
            if (map.containsKey(s.charAt(i))) {
                map.remove(s.charAt(i));
            }else{
                map.put(s.charAt(i),i);
                answer = Math.max(answer, map.get(i));
            }


        }

    }

//    public static int lengthOfLongestSubstring(String s) {
//
//        HashMap<Character,Integer> map =new HashMap<>();
//        int i=0,j=0,ans=0,n=s.length();
//        while(j<n){
//            if(!map.containsKey(s.charAt(j))){
//                map.put(s.charAt(j),j);
//                j++;
//            }
//            else{
//                map.remove(s.charAt(i));
//                i++;
//            }
//            ans=Math.max(ans,j-i);
//        }
//        return ans;
//
//    }

}
