package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S1325 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root != null) {
            root.left = removeLeafNodes(root.left, target);
            root.right = removeLeafNodes(root.right, target);
            return root.val == target && root.left == null && root.right == null ? null : root;
        } else {
            return root;
        }
    }
}
