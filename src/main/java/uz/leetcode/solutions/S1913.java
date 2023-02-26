package uz.leetcode.solutions;

import java.util.Arrays;

public class S1913 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        final int length = nums.length;
        return nums[length - 1] * nums[length - 2] - nums[0] * nums[1];
    }
}
