package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.TreeSet;

public class S230 {
    public int kthSmallest(TreeNode root, int k) {
        final TreeSet<Integer> values = new TreeSet<>();
        kthSmallest(root, values);
        for (Integer value : values) {
            if (--k == 0) {
                return value;
            }
        }
        return -1;
    }

    public void kthSmallest(TreeNode root, TreeSet<Integer> list) {
        if (root != null) {
            list.add(root.val);
            kthSmallest(root.left, list);
            kthSmallest(root.right, list);
        }
    }
}
