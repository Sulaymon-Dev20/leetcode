package uz.leetcode.solutions;

import java.util.LinkedList;

public class S1249 {
    public String minRemoveToMakeValid(String s) {
        final StringBuilder res = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            final char letter = s.charAt(i);
            if (letter == '(') {
                list.addFirst(i - j);
                res.append('(');
            } else if (letter == ')') {
                if (list.size() > 0) {
                    list.removeFirst();
                    res.append(')');
                } else {
                    j++;
                }
            } else {
                res.append(letter);
            }
        }
        if (!list.isEmpty()) {
            list.forEach(res::deleteCharAt);
        }
        return res.toString();
    }
}
