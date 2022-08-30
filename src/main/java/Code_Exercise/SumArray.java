package Code_Exercise;

public class SumArray {
    public static Integer SumArray(Integer[] list) {

        int factorial = 0;

        for(int i = 0; i<list.length; i++){
            factorial += list[i];
        }

        return factorial;

    }
}
