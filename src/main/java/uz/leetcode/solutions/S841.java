package uz.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class S841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        return canVisitAllRooms(rooms, new ArrayList<>(), 0);
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms, List<Integer> list, int i) {
        if (!list.contains(i)) {
            list.add(i);
            if (rooms.size() == list.size()) return true;
            final List<Integer> list2 = rooms.get(i);
            for (final Integer integer : list2) {
                if (canVisitAllRooms(rooms, list, integer)) {
                    return true;
                }
            }
        }
        return false;
    }
    class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            boolean[] visited = new boolean[rooms.size()];
            visited[0] = true;
            dfs(rooms, visited, 0);
            for (boolean v : visited) {
                if (!v) {
                    return false;
                }
            }
            return true;
        }

        private void dfs(List<List<Integer>> rooms, boolean[] visited, int room) {
            for (int key : rooms.get(room)) {
                if (!visited[key]) {
                    visited[key] = true;
                    dfs(rooms, visited, key);
                }
            }
        }
    }
}
