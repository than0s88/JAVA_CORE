package Code_Exercise;

public class FactorialRecursion {
    public static int factorialRecursionMethod(int n){
        if (n != 0){
            return n * factorialRecursionMethod(n - 1);
        }
            return 1;
    }
}
