package uz.leetcode.solutions;

public class S1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        final String[] list = sentence.split(" ");
        for (int i = 0; i < list.length; i++) {
            if (list[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
