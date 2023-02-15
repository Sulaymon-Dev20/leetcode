package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.HashSet;

public class S965 {
    public boolean isUnivalTree(TreeNode root) {
        final HashSet<Integer> list = new HashSet<>();
        isUnivalTree(root, list);
        return list.size() <= 1;
    }

    public void isUnivalTree(TreeNode root, HashSet<Integer> list) {
        if (root != null) {
            list.add(root.val);
            isUnivalTree(root.left, list);
            isUnivalTree(root.right, list);
        }
    }
}
