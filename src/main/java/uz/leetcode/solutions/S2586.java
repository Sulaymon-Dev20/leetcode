package uz.leetcode.solutions;

public class S2586 {
    public int vowelStrings(String[] words, int left, int right) {
        int res = 0;
        String a = "aeiou";
        for (int i = left; i <= right; i++) {
            final String word = words[i];
            if (a.indexOf(word.charAt(0)) != -1 && a.indexOf(word.charAt(word.length() - 1)) != -1) {
                res++;
            }
        }
        return res;
    }
}
