package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S783 {
    public int minDiffInBST(TreeNode root) {
        final ArrayList<Integer> list = new ArrayList<>();
        minDiffInBST(root, list);
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            distance = Math.min(list.get(i) - list.get(i + 1), distance);
        }
        return distance;
    }

    public void minDiffInBST(TreeNode root, List<Integer> list) {
        if (root != null) {
            minDiffInBST(root.right, list);
            list.add(root.val);
            minDiffInBST(root.left, list);
        }
    }
}
