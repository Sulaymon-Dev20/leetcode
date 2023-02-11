package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S1372 {
    public int longestZigZag(TreeNode root) {
        return Math.max(longestZigZag(root, 0, true), longestZigZag(root, 0, false));
    }

    public int longestZigZag(TreeNode root, int som, boolean left) {
        if (root != null) {
            if (left) {
                return Math.max(longestZigZag(root.left, som + 1, false), longestZigZag(root.right, 0, false));
            } else {
                return Math.max(longestZigZag(root.right, som + 1, true), longestZigZag(root.left, 0, true));
            }
        } else {
            return som - 1;
        }
    }
}
