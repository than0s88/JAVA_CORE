package LeetCode_problem_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] temp = new int[2];
        int total = 0;

        for (int i = 0; i < nums.length -1; i++) {
                total = nums[i] + nums[i+1];
                if (total == target){
                    temp[0] = i;
                    temp[1] = i+1;

                    return temp;

            }
        }
        return temp;

    }
}
