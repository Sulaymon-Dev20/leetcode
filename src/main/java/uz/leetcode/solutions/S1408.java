package uz.leetcode.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class S1408 {
    public List<String> stringMatching(String[] words) {
        HashSet<String> list = new HashSet<>();
        for (int indexA = 0; indexA < words.length; indexA++) {
            for (int indexB = 0; indexB < words.length; indexB++) {
                final String word = words[indexA];
                if (indexA != indexB && word.contains(words[indexB])) {
                    list.add(words[indexB]);
                }
            }
        }
        return new ArrayList<>(list);
    }
}
