package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.*;

public class S1110 {
    Set<Integer> to_delete_set;
    List<TreeNode> res;

    public List<TreeNode> delNodes2(TreeNode root, int[] to_delete) {
        to_delete_set = new HashSet<>();
        res = new ArrayList<>();
        for (int i : to_delete) to_delete_set.add(i);
        helper(root, true);
        return res;
    }

    private TreeNode helper(TreeNode node, boolean is_root) {
        if (node == null) return null;
        boolean deleted = to_delete_set.contains(node.val);
        if (is_root && !deleted) res.add(node);
        node.left = helper(node.left, deleted);
        node.right = helper(node.right, deleted);
        return deleted ? null : node;
    }

    public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        final ArrayList<TreeNode> list = new ArrayList<>();
        final List<Integer> list2 = new ArrayList<>(Arrays.stream(to_delete).boxed().distinct().toList());
        list2.add(-1);
        delNodes2(new TreeNode(-1, root, null), list2, list);
        return list;
    }

    public static TreeNode delNodes2(TreeNode root, List<Integer> to_delete, List<TreeNode> list) {
        if (root == null) return null;
        root.left = delNodes2(root.left, to_delete, list);
        root.right = delNodes2(root.right, to_delete, list);
        if (to_delete.contains(root.val)) {
            if (root.left != null) list.add(root.left);
            if (root.right != null) list.add(root.right);
            return null;
        } else {
            return root;
        }
    }
}
