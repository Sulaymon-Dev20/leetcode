package uz.leetcode.solutions;

import uz.leetcode.model.ListNode;

import java.util.LinkedList;

public class S143 {
    public void reorderList(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();
        ListNode listNode = head;
        while (listNode != null) {
            list.addLast(listNode.val);
            listNode = listNode.next;
        }
        int i = 0;
        while (head != null) {
            head.val = i % 2 == 0 ? list.removeFirst() : list.removeLast();
            head = head.next;
            i++;
        }
    }
}
