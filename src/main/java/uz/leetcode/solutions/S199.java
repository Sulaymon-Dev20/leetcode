package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S199 {
    public List<Integer> rightSideView(TreeNode root) {
        final ArrayList<Integer> list = new ArrayList<>();
        rightSideView(root, list, 0);
        return list;
    }

    public void rightSideView(TreeNode root, ArrayList<Integer> list, int level) {
        if (root != null) {
            if (list.size() == level) {
                list.add(root.val);
            }
            rightSideView(root.right, list, level + 1);
            rightSideView(root.left, list, level + 1);
        }
    }
}
