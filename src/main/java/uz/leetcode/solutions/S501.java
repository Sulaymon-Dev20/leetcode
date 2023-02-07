package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class S501 {
    public int[] findMode(TreeNode root) {
        final HashMap<Integer, Integer> map = new HashMap<>();
        findMode(root, map);
        final Integer max = Collections.max(map.values());
        return map.entrySet().stream()
            .filter(item -> item.getValue().equals(max))
            .mapToInt(Map.Entry::getKey)
            .toArray();
    }

    public void findMode(TreeNode root, Map<Integer, Integer> map) {
        if (root != null) {
            map.put(root.val, map.getOrDefault(root.val, 0) + 1);
            findMode(root.left, map);
            findMode(root.right, map);
        }
    }
}
