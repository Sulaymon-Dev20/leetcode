package uz.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        final ArrayList<List<Integer>> res = new ArrayList<>();
        allPathsSourceTarget(graph, 0, "", res);
        return res;
    }

    public void allPathsSourceTarget(int[][] graph, int id, String res, List<List<Integer>> list) {
        final int[] points = graph[id];
        final String text = res + "," + id;
        for (int pointId : points) {
            allPathsSourceTarget(graph, pointId, text, list);
        }
        if (graph.length - 1 == id) {
            list.add(Arrays.stream(text.substring(1).split(",")).map(Integer::parseInt).toList());
        }
    }
}
