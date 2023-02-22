package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return getRootForRange(nums, 0, nums.length - 1);
    }

    private TreeNode getRootForRange(int[] nums, int low, int high) {
        if (low > high) return null;
        int index = low + ((high - low) / 2);
        return new TreeNode(nums[index], getRootForRange(nums, low, index - 1), getRootForRange(nums, index + 1, high));
    }
}
