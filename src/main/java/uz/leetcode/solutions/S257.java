package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class S257 {
    public List<String> binaryTreePaths(TreeNode root) {
        return binaryTreePaths(root, "", new LinkedList<>());
    }

    public List<String> binaryTreePaths(TreeNode root, String s, LinkedList<String> list) {
        final String text = s + "->" + root.val;
        if (root.left == null && root.right == null) {
            list.add(text.startsWith("->") ? text.substring(2) : text);
        } else {
            if (root.left != null) {
                binaryTreePaths(root.left, text, list);
            }
            if (root.right != null) {
                binaryTreePaths(root.right, text, list);
            }
        }
        return list;
    }
}
