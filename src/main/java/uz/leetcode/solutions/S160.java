package uz.leetcode.solutions;

import uz.leetcode.model.ListNode;

public class S160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return headA != null ? check(headA, headB) != null ? headA : getIntersectionNode(headA.next, headB) : headA;
    }

    public ListNode check(ListNode headA, ListNode headB) {
        return headB != null ? headA.equals(headB) ? headB : check(headA, headB.next) : headB;
    }
}
