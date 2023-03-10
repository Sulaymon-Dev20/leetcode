package uz.leetcode.solutions;

import uz.leetcode.model.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class S382 {
    final List<Integer> list;
    public S382(ListNode head) {
        list = listNodeToList(head, new ArrayList<>());
    }

    public int getRandom() {
        return list.get(new Random().nextInt(list.size() + 1));
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
