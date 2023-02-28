package uz.leetcode.model;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

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

    public static String stringArrayToInputFormArraylist(String text) {
        return text.replace("[", "List.of(").replace(']', ')');
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
        final List<String> list = new ArrayList<>(Arrays.stream(root.replaceAll("[\\[\\] ]", "").split(",")).toList());
        if (list.size() % 2 == 0) {
            list.add("null");
        }
        return arrayStringToTreeNode(list).toString().replace("  ", " ").trim();
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

    private static List<List<String>> printTree(TreeNode root) {
        final int deepLevel = treeNodeMaxDeepLevel(root);
        final int listCount = lastLevelItemCount(deepLevel);
        final ArrayList<List<String>> res = new ArrayList<>(deepLevel);
        final ArrayList<List<String>> collect = new ArrayList<>(deepLevel);
        for (int i = 0; i < deepLevel; i++) {
            final ArrayList<String> line = new ArrayList<>(deepLevel);
            for (int j = 0; j < listCount; j++) {
                line.add(" ");
            }
            res.add(line);
            collect.add(new ArrayList<>(i * 2));
        }
        printTree(root, collect, 0, deepLevel);
        printTree(res, collect, 0, listCount / 2, listCount);
//        res.forEach(System.out::println);
        return res;
    }

    public static String printTreeTrim(TreeNode root) {
        final List<List<String>> lists = printTree(root);
        final AtomicInteger length = new AtomicInteger(Integer.MAX_VALUE);
        lists.stream()
            .map(item -> item.toString().replaceAll("[\\[\\],]", ""))
            .map(item -> Map.entry(item.length() - item.trim().length(), item))
            .peek(item -> length.getAndUpdate((a) -> Math.min(a, item.getKey())))
            .forEach(item -> System.out.println(item.getValue().substring(length.get())));
//            .forEach(item -> System.out.println(item.getValue().substring(0)));
        return "-----------------------------------------------";
    }
    public static String printTreeBox(TreeNode root) {
        printTree(root).forEach(System.out::println);
        return "-----------------------------------------------";
    }

    private static void printTree(TreeNode root, ArrayList<List<String>> collect, int deep, int finalLevel) {
        if (deep != finalLevel) {
            if (root != null) {
                collect.get(deep).add(root.val + "");
                printTree(root.left, collect, deep + 1, finalLevel);
                printTree(root.right, collect, deep + 1, finalLevel);
            } else {
                collect.get(deep).add(" ");
                printTree(null, collect, deep + 1, finalLevel);
                printTree(null, collect, deep + 1, finalLevel);
            }
        }
    }

    private static void printTree(ArrayList<List<String>> res, ArrayList<List<String>> collect, int deep, int begin, int loop) {
        final List<String> list = res.get(deep);
        if (res.size() - 1 != deep) {
            for (int i = begin; i < list.size(); i += loop) list.set(i, collect.get(deep).remove(0));
            printTree(res, collect, deep + 1, begin / 2, begin + 1);
        } else {
            for (int i = 0; i < list.size(); i += 2) list.set(i, collect.get(deep).remove(0));
        }
    }

    private static int lastLevelItemCount(int deepLevel) {
        final int lastLevelItemsCount = (int) Math.pow(2, deepLevel - 1);
        return lastLevelItemsCount + lastLevelItemsCount - 1;
    }
}
