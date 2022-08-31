package LeetCode.Easy.Problem_4;

import java.security.Key;
import java.util.HashMap;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(4));
    }
    public static String intToRoman(int num){

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"I");
        hashMap.put(5,"V");
        hashMap.put(10,"X");
        hashMap.put(50,"L");
        hashMap.put(100,"C");
        hashMap.put(500,"D");
        hashMap.put(1000,"M");

        int max = 0;
        String roman="";
        while (num!=0) {
            int temp = 0;
            for (int key : hashMap.keySet()) {
                if (key > temp && key <= num) {
                     max = key;
                }
                temp = max;
            }
            if (temp < max){
                num = max-temp;
            }
            roman = roman + hashMap.get(max);
            num = num-max;
        }
        return roman;
    }
}
