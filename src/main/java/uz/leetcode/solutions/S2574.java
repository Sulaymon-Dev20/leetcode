package uz.leetcode.solutions;

public class S2574 {
    public static int[] leftRigthDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int i = 0, j = nums.length - 1, somLeft = 0, somRight = 0; i < nums.length; i++, j--) {
            left[i] = somLeft;
            right[j] = somRight;
            somLeft += nums[i];
            somRight += nums[j];
        }
        for (int i = 0; i < left.length; i++) {
            left[i] = Math.abs(left[i] - right[i]);
        }
        return left;
    }
}
