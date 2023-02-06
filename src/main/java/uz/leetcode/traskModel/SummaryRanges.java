package uz.leetcode.traskModel;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SummaryRanges {
    TreeSet<int[]> cache;
    public SummaryRanges() {
        this.cache = new TreeSet<>((a, b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));
    }
    /*
    = ---= = =--- =
     */
    public void addNum(int value) {
        int[] temp = new int[]{value, value};
        if (cache.contains(temp)) {
            return;
        }
        int[] low = cache.lower(temp);
        int[] high = cache.higher(temp);
        // mid
        if (low != null && low[1] + 1 == value && high != null && value + 1 == high[0]) {
            low[1] = high[1];
            cache.remove(high);
        } else if (low != null && value <= low[1] + 1) {
            low[1] = Math.max(low[1], value);
        } else if (high != null && value >= high[0] - 1) {
            high[0] = Math.min(high[0], value);
        } else {
            cache.add(temp);
        }
    }

    public int[][] getIntervals() {
        List<int[]> res = new ArrayList<>(cache);
        return res.toArray(new int[res.size()][2]);
    }

/*    final ArrayList<Integer> list;

    public SummaryRanges() {
        list = new ArrayList<>();
    }

    public void addNum(int value) {
        if (!list.contains(value)) {
            list.add(value);
        }
    }

    public int[][] getIntervals() {
        Collections.sort(list);
        LinkedList<int[]> list2 = new LinkedList<>();
        if (!this.list.isEmpty()) {
            int min = list.get(0), max;
            for (int i = 0; i < list.size(); i++) {
                final Integer first = list.get(i);
                if (i == list.size() - 1 || first + 1 != list.get(i + 1)) {
                    max = first;
                    list2.add(min == max ? new int[]{min, min} : new int[]{min, max});
                    min = list.get(Math.min(i + 1, list.size() - 1));
                }
            }
        }
        return list2.toArray(int[][]::new);
    }*/
}
