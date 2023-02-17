package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root != null) {
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
            if (low <= root.val && root.val <= high) {
                return root;
            } else {
                return root.left != null ? root.left : root.right;
            }
        }
        return root;
    }

    public TreeNode trimBST2(TreeNode root, int low, int high) {
        if (root == null) return root;
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return low <= root.val && root.val <= high ? root : root.left != null ? root.left : root.right;
    }
}
