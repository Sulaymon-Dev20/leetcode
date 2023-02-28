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

    class Solution {
        int in = 0;
        int pre = 0;

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return buildTree(preorder, inorder, Integer.MAX_VALUE);
        }

        public TreeNode buildTree(int[] preorder, int[] inorder, int boundary){
            if(pre >= preorder.length) return null;
            if(inorder[in] == boundary) return null;
            TreeNode root = new TreeNode(preorder[pre++]);
            root.left = buildTree(preorder, inorder, root.val);
            in++;
            root.right = buildTree(preorder, inorder, boundary);
            return root;
        }
    }
}
