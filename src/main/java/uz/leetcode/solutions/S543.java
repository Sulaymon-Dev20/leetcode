package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S543 {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diom(root);
        return max;
    }

    private int diom(TreeNode root) {
        if (root == null) return 0;
        int left = diom(root.left);
        int right = diom(root.right);
        max = Math.max(left + right, max);
        return Math.max(++left, ++right);
    }
}
