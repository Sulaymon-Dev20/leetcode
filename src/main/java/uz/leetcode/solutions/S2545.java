package uz.leetcode.solutions;

import java.util.Arrays;
import java.util.Comparator;

public class S2545 {
    public int[][] sortTheStudents(int[][] score, int k) {
        return Arrays.stream(score)
            .sorted(Comparator.comparing(item -> item[k], Comparator.reverseOrder()))
            .toArray(int[][]::new);
    }
}
