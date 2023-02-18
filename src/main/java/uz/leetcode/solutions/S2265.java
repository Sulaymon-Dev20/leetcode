package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S2265 {
    public int averageOfSubtree(TreeNode root) {
        return root != null ? averageOfSubtree(root, new int[]{0, 0}) + averageOfSubtree(root.left) + averageOfSubtree(root.right) : 0;
    }

    public int averageOfSubtree(TreeNode root, int[] ints) {
        if (root != null) {
            ints[0] += root.val;
            ints[1]++;
            averageOfSubtree(root.left, ints);
            averageOfSubtree(root.right, ints);
            return ints[0] / ints[1] == root.val ? 1 : 0;
        } else {
            return 0;
        }
    }
}
