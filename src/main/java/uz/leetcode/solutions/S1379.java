package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

public class S1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original != null) {
            if (cloned.val == target.val) {
                return cloned;
            } else {
                final TreeNode targetCopy = getTargetCopy(original.left, cloned.left, target);
                return targetCopy != null ? targetCopy : getTargetCopy(original.right, cloned.right, target);
            }
        } else {
            return null;
        }
    }
}
