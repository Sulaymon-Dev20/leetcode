package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S814 {
    public TreeNode pruneTree2(TreeNode root) {
        if (root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root.left == null && root.right == null && root.val == 0 ? null : root;
    }

    public TreeNode pruneTree(TreeNode root) {
        if (root != null) {
            if (!checkTree(root)) {
                return null;
            } else {
                root.left = pruneTree(root.left);
                root.right = pruneTree(root.right);
            }
            return root;
        }
        return root;
    }

    public boolean checkTree(TreeNode root) {
        return root != null && (root.val == 1 || checkTree(root.left) || checkTree(root.right));
    }
}
