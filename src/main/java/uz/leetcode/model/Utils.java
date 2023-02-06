package uz.leetcode.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {

    public static boolean treeNodeEquals(TreeNode root1, TreeNode root2) {
        return root1 == null && root2 == null || root1 != null && root2 != null && root1.val == root2.val && treeNodeEquals(root1.left, root2.left) && treeNodeEquals(root1.right, root2.right);
    }

    public static String stringToObject(String root) {
        return stringToObject(Arrays.stream(root.replaceAll("[\\[\\] ]", "").split(",")).toList()).toString().replace("  ", " ").trim();
    }

    public static StringBuilder stringToObject(List<String> root) {
        Map<Integer, String> map = new HashMap<>(root.size() / 2);
        for (int i = 0, c = 0, l = 1, r = 2; c < root.size() / 2; i++, l += 2, r += 2, c++) {
            if (root.get(i).equals("null")) {
                l -= 2;
                r -= 2;
                c--;
                continue;
            }
            map.put(l, " new TreeNode(" + root.get(l) + ")");
            map.put(r, " new TreeNode(" + root.get(r) + ")");
            map.put(i, " new TreeNode(" + root.get(i) + ", " + checkStringNull(root.get(l), l) + ", " + checkStringNull(root.get(r), r) + ")");
        }
        return stringToObject(map);
    }

    public static StringBuilder stringToObject(Map<Integer, String> map) {
        final StringBuilder res = new StringBuilder(map.remove(0));
        StringBuilder num = new StringBuilder();
        boolean start = false;
        int beginIndex = 0;
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == '<') {
                start = true;
                beginIndex = i;
            } else if (res.charAt(i) == '>') {
                start = false;
                final String s = map.get(Integer.parseInt(num.toString()));
                res.replace(beginIndex, i + 1, s != null ? s : "null");
                num = new StringBuilder();
            } else if (start) {
                num.append(res.charAt(i));
            }
        }
        return res;
    }

    private static String checkStringNull(String text, int k) {
        return text.equals("null") ? text : "<" + k + ">";
    }
}
