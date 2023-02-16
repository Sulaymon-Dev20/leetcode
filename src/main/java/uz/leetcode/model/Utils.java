package uz.leetcode.model;

import java.util.*;

public class Utils {

    public static int treeNodeMaxDeepLevel(TreeNode root) {
        return root != null ? 1 + Math.max(treeNodeMaxDeepLevel(root.left), treeNodeMaxDeepLevel(root.right)) : 0;
    }

    public static int treeNodeArrayCapacity(int level) {
        return level == 0 ? 1 : level * 2;
    }

    public static String arrayIntToChar(int[][] text) {
        return Arrays.stream(text).flatMap(line -> Arrays.stream(line).mapToObj(item -> Character.toString((char) item))).reduce("", String::concat);
    }

    public static String stringArrayToInputForm(String text) {
        return text.replace('[', '{').replace(']', '}');
    }

    public static boolean checkExist(int x, int y, char[][] ints) {
        return ints[0].length - 1 >= y && ints.length - 1 >= x && 0 <= x && 0 <= y;
    }

    public static boolean checkExist(int x, int y, int[][] ints) {
        return ints[0].length - 1 >= y && ints.length - 1 >= x && 0 <= x && 0 <= y;
    }

    public static boolean checkExist(int x, int y, Object[][] ints) {
        return ints[0].length - 1 >= y && ints.length - 1 >= x && 0 <= x && 0 <= y;
    }

    public static boolean checkExist(int x, int y, String[][] ints) {
        return ints[0].length - 1 >= y && ints.length - 1 >= x && 0 <= x && 0 <= y;
    }

    public static boolean checkExist(int x, int y, boolean[][] ints) {
        return ints[0].length - 1 >= y && ints.length - 1 >= x && 0 <= x && 0 <= y;
    }

    public static boolean treeNodeEquals(TreeNode root1, TreeNode root2) {
        return root1 == null && root2 == null || root1 != null && root2 != null && root1.val == root2.val && treeNodeEquals(root1.left, root2.left) && treeNodeEquals(root1.right, root2.right);
    }

    public static String arrayStringToListNode(String data) {
        final String[] split = data.replaceAll("[\\[\\]]", "").split(",");
        final String reduce = Arrays.stream(split).map(item -> " new ListNode(" + item + ",").reduce("", String::concat);
        return (reduce.substring(0, reduce.length() - 1) + ")".repeat(split.length)).trim();
    }

    public static String arrayStringToListNode(int[] data) {
        final String reduce = Arrays.stream(data).mapToObj(item -> " new ListNode(" + item + ",").reduce("", String::concat);
        return (reduce.substring(0, reduce.length() - 1) + ")".repeat(data.length)).trim();
    }

    public static String arrayStringToTreeNode(String root) {
        return arrayStringToTreeNode(Arrays.stream(root.replaceAll("[\\[\\] ]", "").split(",")).toList()).toString().replace("  ", " ").trim();
    }

    public static StringBuilder arrayStringToTreeNode(List<String> root) {
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

    public static String printTree(TreeNode root) {
        final int deepLevel = treeNodeMaxDeepLevel(root);
        final int listCount = lastLevelItemCount(deepLevel);
        final ArrayList<StringBuilder> res = new ArrayList<>(deepLevel);
        final ArrayList<List<Character>> collect = new ArrayList<>(deepLevel);
        for (int i = 0; i < deepLevel; i++) {
            res.add(new StringBuilder("   ".repeat(deepLevel)));
            collect.add(new ArrayList<>(i * 2));
        }
        printTreeHelper(root, collect, 0, deepLevel);
        printTreeHelper(res, collect, 0, listCount / 2, listCount);
        res.forEach(System.out::println);
        return "";
    }

    private static void printTreeHelper(TreeNode root, ArrayList<List<Character>> collect, int deep, int finalLevel) {
        if (deep != finalLevel) {
            if (root != null) {
                collect.get(deep).add((char) (root.val + 48));
                printTreeHelper(root.left, collect, deep + 1, finalLevel);
                printTreeHelper(root.right, collect, deep + 1, finalLevel);
            } else {
                collect.get(deep).add(' ');
                printTreeHelper(null, collect, deep + 1, finalLevel);
                printTreeHelper(null, collect, deep + 1, finalLevel);
            }
        }
    }

    private static void printTreeHelper(ArrayList<StringBuilder> res, ArrayList<List<Character>> collect, int deep, int begin, int loop) {
        final StringBuilder stringBuilder = res.get(deep);
        if (res.size() - 1 != deep) {
            for (int i = begin; i < stringBuilder.length(); i += loop) stringBuilder.setCharAt(i, collect.get(deep).remove(0));
            printTreeHelper(res, collect, deep + 1, begin / 2, begin + 1);
        } else {
            for (int i = 0; i < stringBuilder.length(); i += 2) stringBuilder.setCharAt(i, collect.get(deep).remove(0));
        }
    }

    private static int lastLevelItemCount(int deepLevel) {
        final int lastLevelItemsCount = (int) Math.pow(2, deepLevel - 1);
        return lastLevelItemsCount + lastLevelItemsCount - 1;
    }
}
