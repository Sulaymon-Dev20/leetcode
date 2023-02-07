package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return root != null && (treeNodeEquals(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }

    public boolean treeNodeEquals(TreeNode root1, TreeNode root2) {
        return root1 == null && root2 == null || root1 != null && root2 != null && root1.val == root2.val && treeNodeEquals(root1.left, root2.left) && treeNodeEquals(root1.right, root2.right);
    }
}
