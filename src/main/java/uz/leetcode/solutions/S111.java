package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S111 {
    public int minDepth(TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right != null) {
                return 1 + minDepth(root.right);
            }
            if (root.left != null && root.right == null) {
                return 1 + minDepth(root.left);
            }
            return root.left != null ? 1 + Math.min(minDepth(root.left), minDepth(root.right)) : 1;
        }
        return 0;
    }
}
