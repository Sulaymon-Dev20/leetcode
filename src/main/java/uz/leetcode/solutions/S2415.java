package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S2415 {
    public TreeNode reverseOddLevels(TreeNode root) {
        reverseOddLevels(root.left, root.right, 1);
        return root;
    }

    private void reverseOddLevels(TreeNode left, TreeNode right, int i) {
        if (left != null) {
            if (i % 2 == 1) {
                int number = right.val;
                right.val = left.val;
                left.val = number;
            }
            reverseOddLevels(left.left, right.right, i + 1);
            reverseOddLevels(left.right, right.left, i + 1);
        }
    }
}
