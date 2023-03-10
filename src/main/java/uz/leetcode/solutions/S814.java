package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S814 {
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
