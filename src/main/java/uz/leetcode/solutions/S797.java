package uz.leetcode.solutions;

import java.util.*;

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

    public List<List<Integer>> allPathsSourceTarget2(int[][] graph) {
        return new ArrayList<>() {
            List<List<Integer>> listOfPaths = null;
            final Deque<Integer> pathQueue = new ArrayDeque<>();

            @Override
            public List<Integer> get(int i) {
                return listOfPaths.get(i);
            }

            @Override
            public int size() {
                if (listOfPaths == null) {
                    listOfPaths = new ArrayList<>();
                    helper(0);
                }
                return listOfPaths.size();
            }

            private void helper(int current) {
                pathQueue.addLast(current);
                if (current == graph.length - 1) {
                    listOfPaths.add(new ArrayList<>(pathQueue));
                } else {
                    for (int v : graph[current]) {
                        helper(v);
                    }
                }
                pathQueue.pollLast();
            }
        };
    }
}
