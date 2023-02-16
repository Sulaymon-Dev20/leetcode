package uz.leetcode.model;

import java.util.ArrayList;
import java.util.List;

public class FindElements {

    final List<Integer> list1;

    public FindElements(TreeNode root) {
        final int deepLevel = treeNodeMaxDeepLevel(root);
        final ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < deepLevel; i++) {
            list.add(new ArrayList<>(i * 2));
        }
        findElements(root, deepLevel, 0, list);
        list1 = list.stream().flatMap(item -> item.stream()).toList();
    }

    public void findElements(TreeNode root, int deepLevel, int deepLevel2, ArrayList<ArrayList<Integer>> list) {
        if (deepLevel != deepLevel2) {
            if (root != null) {
                list.get(deepLevel2).add(1);
                findElements(root.left, deepLevel, deepLevel2 + 1, list);
                findElements(root.right, deepLevel, deepLevel2 + 1, list);
            } else {
                list.get(deepLevel2).add(null);
                findElements(null, deepLevel, deepLevel2 + 1, list);
                findElements(null, deepLevel, deepLevel2 + 1, list);
            }
        }
    }

    public boolean find(int target) {
        return list1.size() > target && list1.get(target) != null;
    }

    public static int treeNodeMaxDeepLevel(TreeNode root) {
        return root != null ? 1 + Math.max(treeNodeMaxDeepLevel(root.left), treeNodeMaxDeepLevel(root.right)) : 0;
    }

    public static void main(String[] args) {
        final FindElements findElements = new FindElements(new TreeNode(-1, null, new TreeNode(-1, new TreeNode(-1, new TreeNode(-1), null), null)));
        findElements.find(2);
        findElements.find(3);
    }
}
