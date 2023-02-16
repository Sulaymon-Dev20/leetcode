package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        final TreeNode treeNode = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            bstFromPreorder(treeNode, preorder[i]);
        }
        return treeNode;
    }

    public TreeNode bstFromPreorder(TreeNode root, int number) {
        if (root != null) {
            if (root.val > number) {
                root.left = bstFromPreorder(root.left, number);
            } else {
                root.right = bstFromPreorder(root.right, number);
            }
            return root;
        } else {
            return new TreeNode(number);
        }
    }
}
