package Test;

import java.util.Scanner;

public class Test {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int lastDigit = num/10;

        System.out.print("The last Digit of the Number is "+lastDigit);
    }
}
