package uz.leetcode.solutions;

public class S1816 {
    public String truncateSentence(String s, int k) {
        final StringBuilder string = new StringBuilder();
        final String[] list = s.split(" ");
        for (int index = 0; index < Math.min(list.length, k); index++) {
            string.append(list[index]).append(' ');
        }
        return string.toString().trim();
    }
}
