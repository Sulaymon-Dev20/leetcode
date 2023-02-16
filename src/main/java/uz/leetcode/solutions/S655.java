package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S655 {
    public List<List<String>> printTree(TreeNode root) {
        final int deepLevel = treeNodeMaxDeepLevel(root);
        final int listCount = printTree(deepLevel);
        final ArrayList<List<String>> res = new ArrayList<>(deepLevel);
        final ArrayList<List<String>> collect = new ArrayList<>(deepLevel);
        for (int i = 0; i < deepLevel; i++) {
            final ArrayList<String> line = new ArrayList<>(deepLevel);
            for (int j = 0; j < listCount; j++) {
                line.add("");
            }
            res.add(line);
            collect.add(new ArrayList<>(i * 2));
        }
        printTree(root, collect, 0, deepLevel);
        printTree(res, collect, 0, listCount / 2, listCount);
        return res;
    }

    public void printTree(TreeNode root, ArrayList<List<String>> collect, int deep, int finalLevel) {
        if (deep != finalLevel) {
            if (root != null) {
                collect.get(deep).add(root.val + "");
                printTree(root.left, collect, deep + 1, finalLevel);
                printTree(root.right, collect, deep + 1, finalLevel);
            } else {
                collect.get(deep).add("");
                printTree(null, collect, deep + 1, finalLevel);
                printTree(null, collect, deep + 1, finalLevel);
            }
        }
    }

    public void printTree(ArrayList<List<String>> res, ArrayList<List<String>> collect, int deep, int begin, int loop) {
        final List<String> list = res.get(deep);
        if (res.size() - 1 != deep) {
            for (int i = begin; i < list.size(); i += loop) list.set(i, collect.get(deep).remove(0));
            printTree(res, collect, deep + 1, begin / 2, begin + 1);
        } else {
            for (int i = 0; i < list.size(); i += 2) list.set(i, collect.get(deep).remove(0));
        }
    }

    public int printTree(int deepLevel) {
        final int lastLevelItemsCount = (int) Math.pow(2, deepLevel - 1);
        return lastLevelItemsCount + lastLevelItemsCount - 1;
    }

    public int treeNodeMaxDeepLevel(TreeNode root) {
        return root != null ? 1 + Math.max(treeNodeMaxDeepLevel(root.left), treeNodeMaxDeepLevel(root.right)) : 0;
    }
}
