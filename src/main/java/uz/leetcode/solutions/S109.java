package uz.leetcode.solutions;

import uz.leetcode.model.ListNode;
import uz.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S109 {
    public static TreeNode sortedListToBST(ListNode head) {
        final List<Integer> list = listNodeToList(head, new ArrayList<>());
        return listNodeToList(list, 0, list.size() - 1);
    }

    public static TreeNode listNodeToList(List<Integer> list, int low, int high) {
        if (low > high) return null;
        final int index = low + ((high - low) / 2);
        return new TreeNode(list.get(index), listNodeToList(list, low, index - 1), listNodeToList(list, index + 1, high));
    }

    public static List<Integer> listNodeToList(ListNode head, List<Integer> list) {
        if (head != null) {
            list.add(head.val);
            return listNodeToList(head.next, list);
        } else {
            return list;
        }
    }
}
