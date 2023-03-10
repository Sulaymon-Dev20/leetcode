package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S1110 {
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
