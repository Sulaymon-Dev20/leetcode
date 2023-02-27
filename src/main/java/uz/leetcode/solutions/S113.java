package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S113 {
    static List<List<Integer>> pathSum = new ArrayList<>();

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root != null) {
            pathSum(root, targetSum, 0, "");
        }
        return pathSum;
    }

    public static void pathSum(TreeNode root, int targetSum, int som2, String s) {
        if (root != null) {
            som2 += root.val;
            if (som2 == targetSum) {
                if (root.left == null && root.right == null) {
                    final String s1 = s + ',' + root.val;
                    pathSum.add(Arrays.stream(s1.substring(1).split(",")).map(Integer::parseInt).toList());
                }
            }
            pathSum(root.left, targetSum, som2, s + "," + root.val);
            pathSum(root.right, targetSum, som2, s + "," + root.val);
        }
    }

}
