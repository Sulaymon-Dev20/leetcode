package uz.leetcode.solutions;

public class S1991 {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        int temp = 0;
        for (int j = 0; j < nums.length; j++) {
            sum -= nums[j];
            if (temp == sum) return j;
            temp = temp + nums[j];
        }
        return -1;
    }
}
