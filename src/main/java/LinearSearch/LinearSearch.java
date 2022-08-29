package LinearSearch;

import java.util.HashMap;

public class LinearSearch {

    public static void main(String[] args) {

        //LINEAR SEARCH
        int[] arr = {100,600,50,840, 3006};
        linearSearch(arr, 3006);
        improveLinearSearch(arr, 3006);

        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("",100);

    }
    //MAIN METHOD

    public static HashMap hashMap(HashMap<String, Integer> hashMap){
        return hashMap;
    }
    public static void linearSearch(int[] arr, int element){

        int position = -1;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] == element){
                position = i;
                System.out.println("element found at index: "+position);
                break;
            }
        }
        if (position == 0){
            System.out.println("element not found!");
        }
    }

    public static void improveLinearSearch(int[] arr, int element){

        int left = 0;
        int right = arr.length -1;
        int position = -1;

        //LEFT
        for (left = 0; left < arr.length;){

            if (arr[left] == element){
                position = left;
                System.out.println("element found at index: "+ position);
                break;
            }

            if (arr[right] == element){
                position = right;
                System.out.println("element found at index: " + position);
                break;
            }

            left++;
            right--;

        }
        if (position == -1){
            System.out.println("element not found!");
        }

    }


}
