package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.LinkedList;

public class S1382 {
    public static TreeNode balanceBST(TreeNode root) {
        final LinkedList<Integer> numbers = new LinkedList<>();
        balanceBST(root, numbers);
        return listToListNode(numbers, 0, numbers.size() - 1);
    }

    public static void balanceBST(TreeNode root, LinkedList<Integer> list) {
        if (root != null) {
            balanceBST(root.left, list);
            list.add(root.val);
            balanceBST(root.right, list);
        }
    }

    public static TreeNode listToListNode(LinkedList<Integer> list, int min, int max) {
        if (min > max) return null;
        int index = min + ((max - min) / 2);
        return new TreeNode(list.get(index), listToListNode(list, min, index - 1), listToListNode(list, index + 1, max));
    }
}
