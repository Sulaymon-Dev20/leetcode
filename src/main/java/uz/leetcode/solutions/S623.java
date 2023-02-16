package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S623 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return depth == 1 ? new TreeNode(val, root, null) : addOneRow2(root, val, depth);
    }

    public TreeNode addOneRow2(TreeNode root, int val, int depth) {
        if (root != null) {
            if (--depth == 1) {
                root.left = new TreeNode(val, root.left, null);
                root.right = new TreeNode(val, null, root.right);
            } else {
                root.left = addOneRow2(root.left, val, depth);
                root.right = addOneRow2(root.right, val, depth);
            }
        }
        return root;
    }
}
