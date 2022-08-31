package LeetCode.Easy.Problem_4;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

        //romanToInt("MCMXCIV");
        System.out.println(romanToInt("LVIII")); //1994
    }
    public static int romanToInt(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int sum = 0;
        int previous = 0;
        int count = 0;

        while (count < s.length()) {
            int current = hashMap.get(s.charAt(count));
            if (previous < current) {
                current -= previous * 2;
            }
            sum += current;
            previous = current;
            count++;
        }
        return sum;
    }

//    public static int romanToInt(String s) {
//
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//
//        hashMap.put('I', 1);
//        hashMap.put('V', 5);
//        hashMap.put('X', 10);
//        hashMap.put('L', 50);
//        hashMap.put('C', 100);
//        hashMap.put('D', 500);
//        hashMap.put('M', 1000);
//
//        int sum = 0;
//        int previous = 0;
//        int count = 0;
//
//        while (count < s.length()) {
//            int current = hashMap.get(s.charAt(count));
//            if (previous < current) {
//                current -= previous * 2;
//            }
//            sum += current;
//            previous = current;
//            count++;
//        }
//        return sum;
//    }

}
