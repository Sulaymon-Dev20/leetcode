package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class S652 {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        final TreeMap<String, List<TreeNode>> map = new TreeMap<>();
        findDuplicateSubtrees(root, map);
        return map.values().stream().filter(item -> item.size() > 1).map(item -> item.get(0)).toList();
    }

    public static void findDuplicateSubtrees(TreeNode root, TreeMap<String, List<TreeNode>> map) {
        if (root != null) {
            final String s = treeNodeString(root);
            final List<TreeNode> treeNodes = map.computeIfAbsent(s, value -> new LinkedList<>());
            treeNodes.add(root);
            findDuplicateSubtrees(root.left, map);
            findDuplicateSubtrees(root.right, map);
        }
    }

    public static String treeNodeString(TreeNode root) {
        if (root != null) {
            return '(' + treeNodeString(root.left) + ')' + root.val + '(' + treeNodeString(root.right) + ')';
        } else {
            return "#";
        }
    }
}
