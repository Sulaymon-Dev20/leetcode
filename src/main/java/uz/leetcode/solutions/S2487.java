package uz.leetcode.solutions;

import uz.leetcode.model.ListNode;

import java.util.LinkedList;

public class S2487 {
    public ListNode removeNodes2(ListNode head) {
        if (head.next != null) {
            final ListNode listNode = removeNodes(head.next);
            return head.val >= listNode.val ? new ListNode(head.val, listNode) : listNode;
        } else {
            return new ListNode(head.val);
        }
    }

    public ListNode removeNodes(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int index = 0;
        while (!list.isEmpty()) {
            final Integer number = list.removeLast();
            if (number >= index) {
                head = new ListNode(number, head);
                index = number;
            }
        }
        return head;
    }
}
