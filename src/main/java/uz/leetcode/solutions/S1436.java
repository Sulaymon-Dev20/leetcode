package uz.leetcode.solutions;

import java.util.HashSet;
import java.util.List;

public class S1436 {
    public String destCity(List<List<String>> paths) {
        HashSet<String> o = new HashSet<>();
        for (List<String> path : paths) {
            o.add(path.get(0));
        }
        for (List<String> path : paths) {
            String dest = path.get(1);
            if (!o.contains(dest)) {
                return dest;
            }
        }
        return "";
    }
}
