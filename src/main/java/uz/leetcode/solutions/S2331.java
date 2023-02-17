package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S2331 {
    public boolean evaluateTree(TreeNode root) {
        return root.val == 1 || root.val == 0 ? root.val == 1 : root.val == 2 ? evaluateTree(root.left) || evaluateTree(root.right) : evaluateTree(root.left) && evaluateTree(root.right);
    }
}
