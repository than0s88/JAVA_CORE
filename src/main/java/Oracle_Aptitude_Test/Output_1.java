package Oracle_Aptitude_Test;

import java.util.Scanner;

public class Output_1 {
    public static void main(String[] args) {

        int i= 0;
        for(i=0;i<20;i++) {
            switch (i) {
                case 0:
                    i += 5;
                case 1:
                    i += 2;
                case 5:
                    i += 5;
                default:
                    i += 4;
                    break;
            }
        }
        System.out.println(i);
    }
}
