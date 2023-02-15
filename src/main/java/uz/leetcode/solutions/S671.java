package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.Set;
import java.util.TreeSet;

public class S671 {
    public int findSecondMinimumValue(TreeNode root) {//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
        final TreeSet<Integer> list = new TreeSet<>();
        findSecondMinimumValue(root, list);
        return list.size() == 1 ? -1 : list.stream().skip(1).limit(1).findFirst().orElse(-1);
    }

    public static void findSecondMinimumValue(TreeNode root, Set<Integer> list) {
        if (root != null) {
            list.add(root.val);
            findSecondMinimumValue(root.left, list);
            findSecondMinimumValue(root.right, list);
        }
    }
}
