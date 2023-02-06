package uz.leetcode.traskModel;

import java.util.*;

public class FreqStack {
    LinkedHashSet<Integer> integers;
    TreeSet<Map.Entry<Integer, Integer>> map;

    public FreqStack() {
        integers = new LinkedHashSet<>();
        final HashMap<Integer, Integer> objectObjectHashMap = new HashMap<>();
        final SortedSet<Map.Entry<Integer, Integer>> entries = entriesSortedByValues(objectObjectHashMap);
        map = new TreeSet<>(Map.Entry.comparingByValue());
    }

    public void push(int val) {
        integers.add(val);
//        map.put(val, map.getOrDefault(val, 0) + 1);
    }

    public int pop() {
        System.out.println(map);
        return 01;
    }

    static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<>(Map.Entry.comparingByValue());
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

    public static void main(String[] args) {
        final FreqStack freqStack = new FreqStack();
        freqStack.push(1);
        freqStack.push(1);
        freqStack.push(1);
        freqStack.push(2);
        freqStack.push(2);
        freqStack.push(3);
        freqStack.pop();
    }
}
