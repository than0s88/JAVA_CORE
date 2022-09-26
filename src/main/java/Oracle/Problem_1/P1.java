package Oracle.Problem_1;

public class P1 {
    public static void main(String[] args) {
        System.out.println(createPassword("amjpyhhh"));

    }

    public static String createPassword(String word){

        String temp = "";
        char[] array = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i <= word.length() - 1; i++) {
        boolean check = false;

          for(char key : array){
                if (key == word.charAt(i)){
                    check = true;
                    break;
                }
            }
            if (check==false){
                temp =  temp + "*" + word.charAt(i);
            }
        }
        return temp;
    }
}
