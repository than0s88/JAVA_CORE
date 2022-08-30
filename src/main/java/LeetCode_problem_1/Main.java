package LeetCode_problem_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3,2,3,5,1,7};
        int i = 0;

        System.out.println(Arrays.toString(twoSumOfArray(arr,6)));
    }

//    public static void twoSumOfArray(int[] nums, int target) {
//
//        int[] temp = new int[2];
//        int total = 0;
//        for (int i = 0; i < nums.length-2; i++) {
//            for (int j = 1; j < nums.length; j++) {
//                total = nums[i] + nums[j];
//                if (total == target){
//                    temp[0] = i;
//                    temp[1] = j;
//                    System.out.println(Arrays.toString(temp));
//                    break;
//                }
//
//            }
//
//
//        }
//        System.out.println(total);
//
//    }

    public static int[] twoSumOfArray(int[] nums, int target) {

        int[] temp = new int[2];

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = 1; j < nums.length; j++) {
                int total = nums[i] + nums[j];
                if (total == target){
                    temp[0] = i;
                    temp[1] = j;
                    break;
                }
            }
        }
        return temp;
    }
}
