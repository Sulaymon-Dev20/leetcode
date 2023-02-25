package uz.leetcode.traskModel;

import java.util.HashSet;

public class RandomizedSet {
    final HashSet<Integer> set;

    public RandomizedSet() {
        set = new HashSet<>();
    }

    public boolean insert(int val) {
        try {
            return !set.contains(val);
        } finally {
            set.add(val);
        }
    }

    public boolean remove(int val) {
        try {
            return set.contains(val);
        } finally {
            set.removeIf(item -> item == val);
            set.remove(val);
        }
    }

    public int getRandom() {
        int index = (int) (Math.random() * (set.size() - 1));
        return set.hashCode();
    }
}
