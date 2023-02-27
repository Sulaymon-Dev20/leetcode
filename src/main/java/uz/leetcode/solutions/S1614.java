package uz.leetcode.solutions;

public class S1614 {
    public int maxDepth(String s) {
        int max = 0;
        int counter = 0;
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == '(') {
                counter++;
            } else if (s.charAt(index) == ')') {
                max = Math.max(counter, max);
                counter--;
            }
        }
        return max;
    }
}
