package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S951 {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return root1 == null && root2 == null || root1 != null && root2 != null && root1.val == root2.val && (flipEquiv(root1.left, root2.right)||flipEquiv(root1.left, root2.left)) && (flipEquiv(root1.right, root2.left)||flipEquiv(root1.right, root2.right));
    }
}
