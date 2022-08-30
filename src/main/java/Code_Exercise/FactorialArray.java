package Code_Exercise;

public class FactorialArray {
    public static Integer factorialArray(Integer[] list) {

        int factorial = 1;

        for(int i = 0; i<list.length; i++){
            factorial *= list[i];
        }

        return factorial;

    }
}
