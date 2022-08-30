package Code_Exercise;

public class Factorial {
    //FACTORIAL
    public static Integer factorial(Integer n) {

        int factorial = n;
        for(int i = n-1; i<n; i++){
            factorial *= i;
        }

        return factorial;

    }
}
