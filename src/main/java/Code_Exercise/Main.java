package Code_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Factorial obj1 = new Factorial();
        FactorialArray obj2 = new FactorialArray();
        ArrayUpperCase obj3 = new ArrayUpperCase();
        ReverseString obj4 = new ReverseString();
        LinearSearch obj5 = new LinearSearch();
        SumArray obj6 = new SumArray();
        MaximumArray obj7 = new MaximumArray();
        AverageArray obj8 = new AverageArray();
        GetElementArray obj9 = new GetElementArray();

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

        System.out.println("Factorial "+obj1.factorial(4));

        System.out.println("Factorial Array: "+obj2.factorialArray(list));

        System.out.println("Convert ArrayList to lowercase: "+obj3.arrayUpperCase(stringArrayList));

        System.out.println("Reverse String: "+obj4.reverseString("oluaP"));

        System.out.println("Linear Search: "+obj5.search(5, list));

        System.out.println("Sum of Array: "+obj6.SumArray(list));

        System.out.println("Maximum number in Array is: "+obj7.maximum(list));

        System.out.println("Average of ArrayList is: "+obj8.average(integerArrayList));

        System.out.println("Test Odd Element: "+obj9.getElement(integerArrayList,2));


    }

















}
