package LeetCode_problem_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSumOfArray(arr,6)));
        //twoSumOfArray(arr,6);
    }
    public static int[] twoSumOfArray(int[] nums, int target) {

        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i+1; j <= nums.length -1; j++) {
                if (target == nums[i] + nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
