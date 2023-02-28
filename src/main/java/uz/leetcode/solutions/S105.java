package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class S105 {
    final ArrayList<Integer> list = new ArrayList<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, new AtomicInteger(), new AtomicInteger());
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, AtomicInteger x, AtomicInteger y) {
        if (x.get() < preorder.length) {
            final TreeNode root = new TreeNode();
            final int number = preorder[x.get()];
            final int numberB = inorder[y.get()];
            if (!list.contains(numberB)) {
                root.val = number;
                list.add(number);
                x.incrementAndGet();
                root.left = buildTree(preorder, inorder, x, y);
                root.right = buildTree(preorder, inorder, x, y);
            } else {
                y.incrementAndGet();
                return null;
            }
            return root;
        }
        return null;
    }
}
