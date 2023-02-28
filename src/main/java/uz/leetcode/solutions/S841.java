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
}
