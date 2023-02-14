package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class S1457 {
    public int pseudoPalindromicPaths(TreeNode root) {
        int[] res = new int[1];
        pseudoPalindromicPaths(root, res, new TreeMap<>());
        return res[0];
    }

    public void pseudoPalindromicPaths(TreeNode root, int[] s, Map<Integer, Integer> num) {
        num.merge(root.val, 1, Integer::sum);
        if (root.left == null && root.right == null) {
            if (pseudoPalindromicPaths(num)) {
                s[0]++;
            }
        } else {
            if (root.left != null) pseudoPalindromicPaths(root.left, s, new TreeMap<>(num));
            if (root.right != null) pseudoPalindromicPaths(root.right, s, new TreeMap<>(num));
        }
    }

    public boolean pseudoPalindromicPaths(Map<Integer, Integer> num) {
        final Map<Boolean, Long> collect = num
            .values()
            .stream()
            .collect(Collectors.partitioningBy(item -> item % 2 == 1, Collectors.counting()));
        return collect.get(true) <= 1;
    }
}
