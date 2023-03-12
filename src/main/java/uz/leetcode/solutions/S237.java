package uz.leetcode.solutions;

import uz.leetcode.model.ListNode;

public class S237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
