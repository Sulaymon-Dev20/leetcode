package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

public class S1448 {
    public int goodNodes(TreeNode root) {
        final AtomicInteger atomicInteger = new AtomicInteger();
        goodNodes(root, atomicInteger, root.val);
        return atomicInteger.get();
    }

    public static int goodNodes(TreeNode root, AtomicInteger som, int number) {
        if (root != null) {
            if (number <= root.val) {
                som.incrementAndGet();
            }
            final int max = Math.max(number, root.val);
            return Math.max(goodNodes(root.left, som, max), goodNodes(root.right, som, max));
        } else {
            return Integer.MIN_VALUE;
        }
    }
}
