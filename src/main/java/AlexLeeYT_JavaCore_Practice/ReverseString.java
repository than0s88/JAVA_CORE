package AlexLeeYT_JavaCore_Practice;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {

        String word1 = reverseString1("Paulo Adducul");
        System.out.println(word1);

        String word2 = reverseString2("Paulo Adducul");
        System.out.println(word2);

    }
    public static String reverseString1(String word){
        String temp = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            temp=temp+word.charAt(i);
        }
        return temp;
    }
    public static String reverseString2(String word){
        String temp = "";
        int length = word.length() - 1;
        while (length >= 0){
            temp = temp + word.charAt(length);
            length--;
        }
        return temp;
    }

}
