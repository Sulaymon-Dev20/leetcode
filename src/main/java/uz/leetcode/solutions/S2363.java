package uz.leetcode.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S2363 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        return Stream.of(items1, items2)
            .flatMap(Arrays::stream)
            .collect(Collectors.toMap(item -> item[0], value -> value[1], Integer::sum, TreeMap::new))
            .entrySet()
            .stream()
            .map(item -> List.of(item.getKey(), item.getValue()))
            .toList();
    }
}
