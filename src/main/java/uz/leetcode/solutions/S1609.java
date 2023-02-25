package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class S1609 {
    public static boolean isEvenOddTree(TreeNode root) {
        return isEvenOddTree(root, new HashMap<>(), 0);
    }

    public static boolean isEvenOddTree(TreeNode root, Map<Integer, Integer> list, int level) {
        if (root != null) {
            final boolean isOddLevel = level % 2 == 1;
            final Integer oldValue = list.getOrDefault(level, isOddLevel ? 0 : Integer.MAX_VALUE);
            if (isOddLevel ? root.val % 2 == 1 && oldValue < root.val : root.val % 2 == 0 && oldValue > root.val) {
                list.put(level, root.val);
            } else {
                return false;
            }
            return isEvenOddTree(root.left, list, level + 1) && isEvenOddTree(root.right, list, level + 1);
        }
        return true;
    }
}
