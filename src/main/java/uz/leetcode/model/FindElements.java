package uz.leetcode.model;

import java.util.*;

import static uz.leetcode.model.Utils.arrayStringToTreeNode;

public class FindElements {
    final Map<Integer, ArrayList<Integer>> map;

    public FindElements(TreeNode root) {
        map = new HashMap<>();
        findElements(root, 0, 0);
    }

    public void findElements(TreeNode root, int deep, int number) {
        if (root != null) {
            map.computeIfAbsent(deep, value -> new ArrayList<>(deep * 2)).add(number);
            findElements(root.left, deep + 1, deep + number + 1);
            findElements(root.right, deep + 1, deep + number + 2);
        } else {
            map.computeIfAbsent(deep, value -> new ArrayList<>(deep * 2)).add(null);
        }
    }

    public boolean find(int target) {
        System.out.println(map);
        return true;
    }

    public static void main(String[] args) {
        final FindElements findElements = new FindElements(new TreeNode(-1, null, new TreeNode(-1, new TreeNode(-1, new TreeNode(-1), null), null)));
        findElements.find(2);
        findElements.find(3);
    }
}
