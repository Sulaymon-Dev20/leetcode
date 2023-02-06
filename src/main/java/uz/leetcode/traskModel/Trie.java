package uz.leetcode.traskModel;

import java.util.HashSet;

public class Trie {
    final HashSet<String> list;

    public Trie() {
        list = new HashSet<>();
    }

    public void insert(String word) {
        list.add(word);
    }

    public boolean search(String word) {
        return list.contains(word);
    }

    public boolean startsWith(String prefix) {
        for (String s : list) {
            if (s.startsWith(prefix)) return true;
        }
        return false;
    }
}
