package uz.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class S78 {
    public List<List<Integer>> subsets(int[] nums) {
        final ArrayList<List<Integer>> res = new ArrayList<>();
        res.add(List.of());
        for (int i = 0; i < nums.length; i++) {
            res.add(List.of(nums[i]));
            for (int j = i + 1; j < nums.length; j++) {
                res.add(List.of(nums[i], nums[j]));
                for (int c = j + 1; c < nums.length; c++) {
                    res.add(List.of(nums[i], nums[j], nums[c]));
                    for (int g = c + 1; g < nums.length; g++) {
                        res.add(List.of(nums[i], nums[j], nums[c], nums[g]));
                        for (int o = g + 1; o < nums.length; o++) {
                            res.add(List.of(nums[i], nums[j], nums[c], nums[g], nums[o]));
                            for (int l = o + 1; l < nums.length; l++) {
                                res.add(List.of(nums[i], nums[j], nums[c], nums[g], nums[o], nums[l]));
                                for (int u = l + 1; u < nums.length; u++) {
                                    res.add(List.of(nums[i], nums[j], nums[c], nums[g], nums[o], nums[l], nums[u]));
                                    for (int y = u + 1; y < nums.length; y++) {
                                        res.add(List.of(nums[i], nums[j], nums[c], nums[g], nums[o], nums[l], nums[u], nums[y]));
                                        for (int r = y + 1; r < nums.length; r++) {
                                            res.add(List.of(nums[i], nums[j], nums[c], nums[g], nums[o], nums[l], nums[u], nums[y], nums[r]));
                                            for (int d = r + 1; d < nums.length; d++) {
                                                res.add(List.of(nums[i], nums[j], nums[c], nums[g], nums[o], nums[l], nums[u], nums[y], nums[r], nums[d]));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
