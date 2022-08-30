package Code_Exercise;

import java.util.ArrayList;
import java.util.List;

public class Easy {

    public static void main(String[] args) {
        int arr[][][] = new int[2][][];

    //factorial(5);
        Easy solution = new Easy();
        //ARRAY
        Integer[] list = {3, 79, 55, 3};

        //ARRAY LIST
        List<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);

        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("PAULO");
        stringArrayList.add("JOHN");
        stringArrayList.add("TONIE");
        stringArrayList.add("ELVIE");

        System.out.println("Factorial: "+factorial(4));

        System.out.println("Linear Search: "+solution.search(5, list));

        System.out.println("Factorial Array: "+factorialArray(list));

        System.out.println("Sum of Array: "+SumArray(list));

        System.out.println("Reverse String: "+reverseString("oluaP"));

        System.out.println("Maximum number in Array is: "+solution.maximum(list));

        System.out.println("Average of ArrayList is: "+average(integerArrayList));

        System.out.println("Convert ArrayList to lowercase: "+upperCase(stringArrayList));

        System.out.println("Nth Odd Element: "+getElement2(integerArrayList,2));

        System.out.println("Test Odd Element: "+getElement(integerArrayList,2));
    }

    public static Integer getElement2(List<Integer> list, Integer n) {
        int elementIndex = 2 * (n-1);
        return elementIndex > list.size() - 1 ? -1 : list.get(elementIndex);

    }

    public static Integer getElement(List<Integer> list, Integer n) {
        Integer element = 0;
        Integer counter = 1;

        if (n>list.size()-1){
            return -1;
        }

        for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i) % 2 != 0 && counter<=n){
                    element = list.get(i);
                    counter++;
                }
        }

        return element;
    }

    public static List<String> upperCase(List<String> list) {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
           temp.add(i, list.get(i).toLowerCase());

        }
        return temp;
    }
    public static Double average(List<Integer> list) {

        Double average;
        Double sum = 0.0;
        int length = list.size();
        for(Integer i = 0; i<list.size(); i++){
            sum+=list.get(i);
        }
        average = sum / length;

        return average;
    }
    public static Integer SumArray(Integer[] list) {

        int factorial = 0;

        for(int i = 0; i<list.length; i++){
            factorial += list[i];
        }

        return factorial;

    }
    public Integer maximum(Integer[] list) {
        Integer temp = 0;
        for(Integer i = 0; i < list.length; i++){

            if(temp<list[i]){
                temp = list[i];
            }
        }
        return temp;
    }
    public static String reverseString(String s) {

        String reverse="";
        char reverseChar;

        for(int i = s.length()-1; i>=0 ; i--){
            reverseChar = s.charAt(i);
            reverse += reverseChar;
        }

        return reverse;

    }


    public static Integer factorialArray(Integer[] list) {

        int factorial = 1;

        for(int i = 0; i<list.length; i++){
            factorial *= list[i];
        }

        return factorial;

    }

    //FACTORIAL
    public static Integer factorial(Integer n) {

        int factorial = n;
        for(int i = n-1; i<n; i++){
            factorial = factorial * i;
        }

        return factorial;

    }
    //LINEAR SEARCH
    public int search(Integer n, Integer[] list) {
        Integer index = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(n)){
                index = i;
            }
        }

        return index;
    }



}
