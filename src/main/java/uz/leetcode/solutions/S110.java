package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S110 {
    public static boolean isBalanced(TreeNode root) {
        return root == null || Math.abs(isBalanced(root.left, 0) - isBalanced(root.right, 0)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int isBalanced(TreeNode root, int deep) {
        return root != null ? Math.max(isBalanced(root.left, deep + 1), isBalanced(root.right, deep + 1)) : deep;
    }
}
