package Code_Exercise;

public class ReverseString {
    public static String reverseString(String s) {

        String reverse="";
        char reverseChar;

        for(int i = s.length()-1; i>=0 ; i--){
            reverseChar = s.charAt(i);
            reverse += reverseChar;
        }

        return reverse;

    }
}
