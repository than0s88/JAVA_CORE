package CodingWithJohn;

public class FibonacciSequence {
    public static void main(String[] args) {
       int n = 6;
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n){
        if (n <= 1){
            return n;
        }
        return (fibonacci(n - 1 ) + fibonacci(n - 2));
    }
}
