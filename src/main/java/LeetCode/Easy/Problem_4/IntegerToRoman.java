package LeetCode.Easy.Problem_4;

import java.security.Key;
import java.util.HashMap;
import java.util.Hashtable;

public class IntegerToRoman {
    public static void main(String[] args) {

        System.out.println("Roman Numeral: "+intToRomanStringBuilder(14));
        System.out.println("Roman Numeral: "+intToRomanKeySet(14));
    }

    public static final String intToRomanStringBuilder(int number) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < values.length ; i++) {
            while (number >= values[i]){
                number -= values[i];
                stringBuilder.append(romanLiterals[i]);
            }
        }

        return stringBuilder.toString();
}

    public static String intToRomanKeySet(int num) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "I");
        hashMap.put(4, "IV");
        hashMap.put(5, "V");
        hashMap.put(9, "IX");
        hashMap.put(10, "X");
        hashMap.put(40, "XL");
        hashMap.put(50, "L");
        hashMap.put(90, "XC");
        hashMap.put(100, "C");
        hashMap.put(400, "CD");
        hashMap.put(500, "D");
        hashMap.put(900, "CM");
        hashMap.put(1000, "M");

        int max = 0;
        String roman = "";
        while (num != 0) {
            int temp = 0;
            for (int key : hashMap.keySet()) {
                max = (key > temp && key <= num) ? key : temp;
                temp = max;
            }//End foreach
            num -= max;
             roman += hashMap.get(max);
        }
        return roman;

    }
}