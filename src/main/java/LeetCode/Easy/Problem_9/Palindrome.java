package LeetCode.Easy.Problem_9;

public class Palindrome {

    public static void main(String[] args) {
        int x = 315323513;
        System.out.println(isPalindrome(x));

        //System.out.println(String.valueOf(x).length());
    }
    public static boolean isPalindrome(int x) {

        int length = String.valueOf(x).length() - 1;
        int count = 0;

        while (count < length) {
            if (String.valueOf(x).charAt(count++) != String.valueOf(x).charAt(length--))
                return false;
        }
        return true;
    }
}
