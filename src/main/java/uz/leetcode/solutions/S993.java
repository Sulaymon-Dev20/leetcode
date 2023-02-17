package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class S993 {
    List<Map.Entry<Integer, Integer>> cousin;

    public void getCousins(TreeNode root, int x, int y, int depth, TreeNode parent) {
        if (root == null || cousin.size() == 2) {
            return;
        }

        if (root.val == x || root.val == y) {
            cousin.add(Map.entry(parent != null ? parent.val : (int) (Math.random() * 1000000), depth));
            return;
        }
        getCousins(root.left, x, y, depth + 1, root);
        getCousins(root.right, x, y, depth + 1, root);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        cousin = new ArrayList<>();
        getCousins(root, x, y, 0, null);

        return (cousin.size() == 2) && (!Objects.equals(cousin.get(0).getKey(), cousin.get(1).getKey())) && (Objects.equals(cousin.get(0).getValue(), cousin.get(1).getValue()));
    }
}
