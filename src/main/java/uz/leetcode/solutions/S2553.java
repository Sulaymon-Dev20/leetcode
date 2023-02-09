package uz.leetcode.solutions;

import java.util.Arrays;

public class S2553 {
    public int[] separateDigits(int[] nums) {
        return Arrays.stream(nums).flatMap(number -> String.valueOf(number).chars().map(item -> item - '0')).toArray();
    }
}
