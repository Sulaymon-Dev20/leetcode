package uz.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class S412 {
    public List<String> fizzBuzz(int n) {
        final ArrayList<String> res = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            final boolean b1 = i % 3 == 0;
            final boolean b2 = i % 5 == 0;
            if (b1 && b2) {
                res.add("FizzBuzz");
            } else if (b1) {
                res.add("Fizz");
            } else if (b2) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}
