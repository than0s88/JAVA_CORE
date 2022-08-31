package LeetCode.Easy.Problem_1;

import java.util.Arrays;

public class twoSumOfArray {

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSumOfArrayMethod(arr,6)));
        //twoSumOfArray(arr,6);
    }
    public static int[] twoSumOfArrayMethod(int[] nums, int target) {

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
