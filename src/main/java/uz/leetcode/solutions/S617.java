package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        if (root1 != null && root2 == null) return root1;
        if (root1 == null) return root2;
        TreeNode r = new TreeNode(root1.val + root2.val);
        r.left = mergeTrees(root1.left, root2.left);
        r.right = mergeTrees(root1.right, root2.right);
        return r;
    }
}
