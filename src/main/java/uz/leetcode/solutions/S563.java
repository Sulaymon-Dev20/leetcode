package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S563 {
    int findTilt = 0;

    public int findTilt(TreeNode root) {
        findTilt2(root);
        return findTilt;
    }

    public int findTilt2(TreeNode root) {
        if (root != null) {
            final int left = findTilt2(root.left);
            final int right = findTilt2(root.right);
            findTilt += Math.abs(left - right);
            return root.val + left + right;
        } else {
            return 0;
        }
    }
}
