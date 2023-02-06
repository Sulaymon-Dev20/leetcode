package uz.leetcode.task;


import uz.leetcode.model.ListNode;
import uz.leetcode.model.TreeNode;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static uz.leetcode.model.Utils.*;


public class Leetcode {
    public static void main(String[] args) {
//        System.out.println(minTime2(7, new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}}, List.of(false, false, true, false, false, true, false)));
//        System.out.println(minTime2(7, new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}}, List.of(false, false, true, false, true, true, false)));
//        System.out.println(Arrays.toString(countSubTrees(7, new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}}, "abaedcd")));
//        System.out.println(Arrays.toString(countSubTrees(4, new int[][]{{0, 1}, {1, 2}, {0, 3}}, "bbbb")));
//        System.out.println(Arrays.toString(countSubTrees(5, new int[][]{{0, 1}, {0, 2}, {1, 3}, {0, 4}}, "aabab")));
//        System.out.println(Arrays.toString(countSubTrees(4, new int[][]{{0, 2}, {0, 3}, {1, 2}}, "aeed")));
//        System.out.println(differenceOfSum(new int[]{1, 15, 6, 3}));
//        System.out.println(differenceOfSum(new int[]{1, 2, 3, 4}));
//        System.out.println(buildArray(new int[]{1, 2}, 3));
//        System.out.println(haveConflict(new String[]{"01:15", "02:00"}, new String[]{"02:00", "03:00"}));
//        System.out.println(haveConflict(new String[]{"10:00", "11:00"}, new String[]{"14:00", "15:00"}));
//        System.out.println(haveConflict(new String[]{"15:19", "17:56"}, new String[]{"14:11", "20:02"}));
//        System.out.println(minMaxGame(new int[]{1, 3, 5, 2, 4, 8, 2, 2}));
//        System.out.println(minMaxGame(new int[]{3}));
//        System.out.println(spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
//        System.out.println("[1, 2, 3, 6, 9, 8, 7, 4, 5]");
//        System.out.println(spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
//        System.out.println("[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]");
//        System.out.println(spiralOrder(new int[][]{{1, 2, 3, 4}}));
//        System.out.println(spiralOrder(new int[][]{{1}, {2}, {3}, {4}}));
//        System.out.println(Arrays.deepToString(spiralMatrix(3, 5, new ListNode(1, new ListNode(2)))));
//        System.out.println(Arrays.deepToString(generateMatrix(3)));
//        System.out.println(Arrays.deepToString(spiralMatrixIII(1, 4, 0, 0)));
//        System.out.println(Arrays.deepToString(spiralMatrixIII(5, 6, 1, 4)));
//        System.out.println("[[1,4],[1,5],[2,5],[2,4],[2,3],[1,3],[0,3],[0,4],[0,5],[3,5],[3,4],[3,3],[3,2],[2,2],[1,2],[0,2],[4,5],[4,4],[4,3],[4,2],[4,1],[3,1],[2,1],[1,1],[0,1],[4,0],[3,0],[2,0],[1,0],[0,0]]");
//        System.out.println(deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
//        System.out.println(deleteGreatestValue(new int[][]{{10}}));
//        System.out.println(Arrays.toString(findRelativeRanks(new int[]{10, 3, 8, 9, 4})));
//        System.out.println(replaceWords(List.of("cat", "bat", "rat"), "the cattle was rattled by the battery"));
//        System.out.println(replaceWords(List.of("catt", "cat", "bat", "rat"), "the cattle was rattled by the battery"));
//        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
//        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1}, 1)));
//        System.out.println(projectionArea(new int[][]{{1, 2}, {3, 4}}));
//        System.out.println(projectionArea(new int[][]{{1, 2, 3}, {3, 4, 5}}));
//        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
//        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
//        System.out.println(sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));
//        System.out.println(sortedArrayToBST(new int[]{3, 5, 8}));
//        System.out.println(arithmeticThree(new int[]{3, 6, 9, 12}, 4));
//        System.out.println(Arrays.toString(findRelativeRanks(new int[]{10, 3, 8, 9, 4})));
//        maximumProduct(new int[]{1,0,2,3,0,4,5,0});
//        System.out.println(maximumProduct(new int[]{-100, -2, -3, 1}));
//        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
//        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 1));
//        System.out.println(findMaxAverage(new int[]{5}, 1));
//        System.out.println(Arrays.toString(findErrorNums(new int[]{2, 2})));
//        System.out.println(commonChars(new String[]{"bella", "label", "roller"}));
//        System.out.println(numEquivDominoPairs(new int[][]{{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}}));
//        System.out.println(tictactoe(new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}}));
//        soutArray(Arrays.deepToString(updateBoard(new char[][]{{'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'M', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E'}}, new int[]{3, 0})));
//        soutArray(Arrays.deepToString(updateBoard(new char[][]{{'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E', 'E', 'E', 'M'}, {'E', 'E', 'M', 'E', 'E', 'E', 'E', 'E'}, {'M', 'E', 'E', 'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'M', 'M', 'E', 'E', 'E', 'E'}}, new int[]{0, 0})));
//        soutArray("[[\"E\",\"E\",\"E\",\"E\",\"E\",\"E\",\"E\",\"E\"],[\"E\",\"E\",\"E\",\"E\",\"E\",\"E\",\"E\",\"M\"],[\"E\",\"E\",\"M\",\"E\",\"E\",\"E\",\"E\",\"E\"],[\"M\",\"E\",\"E\",\"E\",\"E\",\"E\",\"E\",\"E\"],[\"E\",\"E\",\"E\",\"E\",\"E\",\"E\",\"E\",\"E\"],[\"E\",\"E\",\"E\",\"E\",\"E\",\"E\",\"E\",\"E\"],[\"E\",\"E\",\"E\",\"E\",\"E\",\"E\",\"E\",\"E\"],[\"E\",\"E\",\"M\",\"M\",\"E\",\"E\",\"E\",\"E\"]]");
//        soutArray("[[\"B\",\"B\",\"B\",\"B\",\"B\",\"B\",\"1\",\"E\"],[\"B\",\"1\",\"1\",\"1\",\"B\",\"B\",\"1\",\"M\"],[\"1\",\"E\",\"M\",\"1\",\"B\",\"B\",\"1\",\"1\"],[\"M\",\"E\",\"1\",\"1\",\"B\",\"B\",\"B\",\"B\"],[\"1\",\"1\",\"B\",\"B\",\"B\",\"B\",\"B\",\"B\"],[\"B\",\"B\",\"B\",\"B\",\"B\",\"B\",\"B\",\"B\"],[\"B\",\"1\",\"2\",\"2\",\"1\",\"B\",\"B\",\"B\"],[\"B\",\"1\",\"M\",\"M\",\"1\",\"B\",\"B\",\"B\"]]");
//        soutArray("[[\"B\",\"B\",\"B\",\"B\",\"B\",\"B\",\"1\",\"E\"],[\"B\",\"1\",\"1\",\"1\",\"B\",\"B\",\"1\",\"M\"],[\"1\",\"2\",\"M\",\"1\",\"B\",\"B\",\"1\",\"1\"],[\"M\",\"2\",\"1\",\"1\",\"B\",\"B\",\"B\",\"B\"],[\"1\",\"1\",\"B\",\"B\",\"B\",\"B\",\"B\",\"B\"],[\"B\",\"B\",\"B\",\"B\",\"B\",\"B\",\"B\",\"B\"],[\"B\",\"1\",\"2\",\"2\",\"1\",\"B\",\"B\",\"B\"],[\"B\",\"1\",\"M\",\"M\",\"1\",\"B\",\"B\",\"B\"]]");
//        System.out.println(Arrays.deepToString(rotateTheBox(new char[][]{{'#', '.', '#'}})));
//        System.out.println(insertIntoBST(new TreeNode(4, new TreeNode(2), new TreeNode(7)), 5));
//        System.out.println(climbStairs(3));
//        System.out.println(climbStairs(4));
//        System.out.println(climbStairs(5));
//        System.out.println(findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 0));
//        System.out.println(findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 1));
//        System.out.println(findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}}, 0, 3, 1));
//        System.out.println(findCheapestPrice(5, new int[][]{{4, 1, 1}, {1, 2, 3}, {0, 3, 2}, {0, 4, 10}, {3, 1, 1}, {1, 4, 3}}, 2, 1, 1));
//        final Date date = new Date();
//        System.out.println(findCheapestPrice1(17, new int[][]{{0, 12, 28}, {5, 6, 39}, {8, 6, 59}, {13, 15, 7}, {13, 12, 38}, {10, 12, 35}, {15, 3, 23}, {7, 11, 26}, {9, 4, 65}, {10, 2, 38}, {4, 7, 7}, {14, 15, 31}, {2, 12, 44}, {8, 10, 34}, {13, 6, 29}, {5, 14, 89}, {11, 16, 13}, {7, 3, 46}, {10, 15, 19}, {12, 4, 58}, {13, 16, 11}, {16, 4, 76}, {2, 0, 12}, {15, 0, 22}, {16, 12, 13}, {7, 1, 29}, {7, 14, 100}, {16, 1, 14}, {9, 6, 74}, {11, 1, 73}, {2, 11, 60}, {10, 11, 85}, {2, 5, 49}, {3, 4, 17}, {4, 9, 77}, {16, 3, 47}, {15, 6, 78}, {14, 1, 90}, {10, 5, 95}, {1, 11, 30}, {11, 0, 37}, {10, 4, 86}, {0, 8, 57}, {6, 14, 68}, {16, 8, 3}, {13, 0, 65}, {2, 13, 6}, {5, 13, 5}, {8, 11, 31}, {6, 10, 20}, {6, 2, 33}, {9, 1, 3}, {14, 9, 58}, {12, 3, 19}, {11, 2, 74}, {12, 14, 48}, {16, 11, 100}, {3, 12, 38}, {12, 13, 77}, {10, 9, 99}, {15, 13, 98}, {15, 12, 71}, {1, 4, 28}, {7, 0, 83}, {3, 5, 100}, {8, 9, 14}, {15, 11, 57}, {3, 6, 65}, {1, 3, 45}, {14, 7, 74}, {2, 10, 39}, {4, 8, 73}, {13, 5, 77}, {10, 0, 43}, {12, 9, 92}, {8, 2, 26}, {1, 7, 7}, {9, 12, 10}, {13, 11, 64}, {8, 13, 80}, {6, 12, 74}, {9, 7, 35}, {0, 15, 48}, {3, 7, 87}, {16, 9, 42}, {5, 16, 64}, {4, 5, 65}, {15, 14, 70}, {12, 0, 13}, {16, 14, 52}, {3, 10, 80}, {14, 11, 85}, {15, 2, 77}, {4, 11, 19}, {2, 7, 49}, {10, 7, 78}, {14, 6, 84}, {13, 7, 50}, {11, 6, 75}, {5, 10, 46}, {13, 8, 43}, {9, 10, 49}, {7, 12, 64}, {0, 10, 76}, {5, 9, 77}, {8, 3, 28}, {11, 9, 28}, {12, 16, 87}, {12, 6, 24}, {9, 15, 94}, {5, 7, 77}, {4, 10, 18}, {7, 2, 11}, {9, 5, 41}}, 13, 4, 13));
//        final Date date2 = new Date();
//        System.out.println(date2.getTime() - date.getTime());
//        System.out.println(findCheapestPrice2(17, new int[][]{{0, 12, 28}, {5, 6, 39}, {8, 6, 59}, {13, 15, 7}, {13, 12, 38}, {10, 12, 35}, {15, 3, 23}, {7, 11, 26}, {9, 4, 65}, {10, 2, 38}, {4, 7, 7}, {14, 15, 31}, {2, 12, 44}, {8, 10, 34}, {13, 6, 29}, {5, 14, 89}, {11, 16, 13}, {7, 3, 46}, {10, 15, 19}, {12, 4, 58}, {13, 16, 11}, {16, 4, 76}, {2, 0, 12}, {15, 0, 22}, {16, 12, 13}, {7, 1, 29}, {7, 14, 100}, {16, 1, 14}, {9, 6, 74}, {11, 1, 73}, {2, 11, 60}, {10, 11, 85}, {2, 5, 49}, {3, 4, 17}, {4, 9, 77}, {16, 3, 47}, {15, 6, 78}, {14, 1, 90}, {10, 5, 95}, {1, 11, 30}, {11, 0, 37}, {10, 4, 86}, {0, 8, 57}, {6, 14, 68}, {16, 8, 3}, {13, 0, 65}, {2, 13, 6}, {5, 13, 5}, {8, 11, 31}, {6, 10, 20}, {6, 2, 33}, {9, 1, 3}, {14, 9, 58}, {12, 3, 19}, {11, 2, 74}, {12, 14, 48}, {16, 11, 100}, {3, 12, 38}, {12, 13, 77}, {10, 9, 99}, {15, 13, 98}, {15, 12, 71}, {1, 4, 28}, {7, 0, 83}, {3, 5, 100}, {8, 9, 14}, {15, 11, 57}, {3, 6, 65}, {1, 3, 45}, {14, 7, 74}, {2, 10, 39}, {4, 8, 73}, {13, 5, 77}, {10, 0, 43}, {12, 9, 92}, {8, 2, 26}, {1, 7, 7}, {9, 12, 10}, {13, 11, 64}, {8, 13, 80}, {6, 12, 74}, {9, 7, 35}, {0, 15, 48}, {3, 7, 87}, {16, 9, 42}, {5, 16, 64}, {4, 5, 65}, {15, 14, 70}, {12, 0, 13}, {16, 14, 52}, {3, 10, 80}, {14, 11, 85}, {15, 2, 77}, {4, 11, 19}, {2, 7, 49}, {10, 7, 78}, {14, 6, 84}, {13, 7, 50}, {11, 6, 75}, {5, 10, 46}, {13, 8, 43}, {9, 10, 49}, {7, 12, 64}, {0, 10, 76}, {5, 9, 77}, {8, 3, 28}, {11, 9, 28}, {12, 16, 87}, {12, 6, 24}, {9, 15, 94}, {5, 7, 77}, {4, 10, 18}, {7, 2, 11}, {9, 5, 41}}, 13, 4, 13));
//        final Date date3 = new Date();
//        System.out.println(date3.getTime() - date2.getTime());
//        System.out.println(findCheapestPrice(17, new int[][]{{0, 12, 28}, {5, 6, 39}, {8, 6, 59}, {13, 15, 7}, {13, 12, 38}, {10, 12, 35}, {15, 3, 23}, {7, 11, 26}, {9, 4, 65}, {10, 2, 38}, {4, 7, 7}, {14, 15, 31}, {2, 12, 44}, {8, 10, 34}, {13, 6, 29}, {5, 14, 89}, {11, 16, 13}, {7, 3, 46}, {10, 15, 19}, {12, 4, 58}, {13, 16, 11}, {16, 4, 76}, {2, 0, 12}, {15, 0, 22}, {16, 12, 13}, {7, 1, 29}, {7, 14, 100}, {16, 1, 14}, {9, 6, 74}, {11, 1, 73}, {2, 11, 60}, {10, 11, 85}, {2, 5, 49}, {3, 4, 17}, {4, 9, 77}, {16, 3, 47}, {15, 6, 78}, {14, 1, 90}, {10, 5, 95}, {1, 11, 30}, {11, 0, 37}, {10, 4, 86}, {0, 8, 57}, {6, 14, 68}, {16, 8, 3}, {13, 0, 65}, {2, 13, 6}, {5, 13, 5}, {8, 11, 31}, {6, 10, 20}, {6, 2, 33}, {9, 1, 3}, {14, 9, 58}, {12, 3, 19}, {11, 2, 74}, {12, 14, 48}, {16, 11, 100}, {3, 12, 38}, {12, 13, 77}, {10, 9, 99}, {15, 13, 98}, {15, 12, 71}, {1, 4, 28}, {7, 0, 83}, {3, 5, 100}, {8, 9, 14}, {15, 11, 57}, {3, 6, 65}, {1, 3, 45}, {14, 7, 74}, {2, 10, 39}, {4, 8, 73}, {13, 5, 77}, {10, 0, 43}, {12, 9, 92}, {8, 2, 26}, {1, 7, 7}, {9, 12, 10}, {13, 11, 64}, {8, 13, 80}, {6, 12, 74}, {9, 7, 35}, {0, 15, 48}, {3, 7, 87}, {16, 9, 42}, {5, 16, 64}, {4, 5, 65}, {15, 14, 70}, {12, 0, 13}, {16, 14, 52}, {3, 10, 80}, {14, 11, 85}, {15, 2, 77}, {4, 11, 19}, {2, 7, 49}, {10, 7, 78}, {14, 6, 84}, {13, 7, 50}, {11, 6, 75}, {5, 10, 46}, {13, 8, 43}, {9, 10, 49}, {7, 12, 64}, {0, 10, 76}, {5, 9, 77}, {8, 3, 28}, {11, 9, 28}, {12, 16, 87}, {12, 6, 24}, {9, 15, 94}, {5, 7, 77}, {4, 10, 18}, {7, 2, 11}, {9, 5, 41}}, 13, 4, 13));
//        System.out.println(new Date().getTime() - date3.getTime());
//        System.out.println(getCommon2(new int[]{1, 2, 3}, new int[]{2, 4}));
//        System.out.println(minimumOperations(new int[]{1, 2, 2, 2, 2}));
//        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3, 4}, 2, 2)));
//        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3}, 1, 3)));
//        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 1, 1, 1}, 4, 1)));
//        System.out.println(containsCycle(new char[][]{{'b', 'b'}}));
//        System.out.println(containsCycle(new char[][]{{'a', 'b', 'b'}, {'b', 'z', 'b'}, {'b', 'b', 'a'}}));
//        System.out.println(containsCycle(new char[][]{{'c', 'c', 'c', 'a'}, {'c', 'd', 'c', 'c'}, {'c', 'c', 'e', 'c'}, {'f', 'c', 'c', 'c'}}));
//        System.out.println(Arrays.toString(splitMessage("short message", 5)));
//        System.out.println(Arrays.toString(splitMessage("short message asdf asdf asdf asdf lkjaa asdf lkja ", 6)));
//        System.out.println(closedIsland(new int[][]{{1, 1, 1, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1, 0, 1}, {1, 1, 1, 1, 1, 1, 1, 0}}));
//        soutArray("[[0,0,1,1,0,1,0,0,1,0],[1,1,0,1,1,0,1,1,1,0],[1,0,1,1,1,0,0,1,1,0],[0,1,1,0,0,0,0,1,0,1],[0,0,0,0,0,0,1,1,1,0],[0,1,0,1,0,1,0,1,1,1],[1,0,1,0,1,1,0,0,0,1],[1,1,1,1,1,1,0,0,0,0],[1,1,1,0,0,1,0,1,0,1],[1,1,1,0,1,1,0,1,1,0]]");
//        System.out.println(closedIsland(new int[][]{{0, 0, 1, 1, 0, 1, 0, 0, 1, 0}, {1, 1, 0, 1, 1, 0, 1, 1, 1, 0}, {1, 0, 1, 1, 1, 0, 0, 1, 1, 0}, {0, 1, 1, 0, 0, 0, 0, 1, 0, 1}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 0}, {0, 1, 0, 1, 0, 1, 0, 1, 1, 1}, {1, 0, 1, 0, 1, 1, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 1, 0, 1, 0, 1}, {1, 1, 1, 0, 1, 1, 0, 1, 1, 0}}));
//        System.out.println(decodeString("3[a]2[c]"));
//        System.out.println(decodeString("3[a2[c]]"));
//        System.out.println(decodeString("3a2c"));
//        System.out.println(smallestSubsequence("nuriddinbobonorov"));
//        System.out.println(longestPalindrome(new String[]{"ll", "lb", "bb", "bx", "uk", "xx", "lx", "xx", "lx", "ll", "xb", "bx", "lb", "bb", "lb", "bl", "bb", "bx", "xl", "lb", "xx"}));
//        System.out.println(palindromePairs(new String[]{"abcd", "dcba", "dcba", "lls", "s", "sssll"}));
//        System.out.println(alternateDigitSum(521));
//        System.out.println(alternateDigitSum(111));
//        System.out.println(alternateDigitSum(886996));
//        System.out.println(distinctIntegers(5));
//        System.out.println(distinctIntegers(3));
//        System.out.println(isSubPath(new ListNode(1, new ListNode(10)), new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, new TreeNode(10), new TreeNode(9))))));
//        System.out.println(isSubPath(new ListNode(1, new ListNode(1, new ListNode(10))), new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1, new TreeNode(10), new TreeNode(9))))));
//        System.out.println(arrayStringToListNode("2,1,2,1,2,2,2,2,1,2,1,2,2,2,1,1,2,1,2,1,2,1,2,1,1,2,2,1,1,2,1,2,1,2,2,2,2,2,2,1,2,1,1,1,2,1,2,2,1,1,2,1,2,1,1,2,2,2,1,1,2,2,2,1,1,2,2,2,2,2,2,2,1,1,1,2,1,2,2,1,1,2,1,2,1,1,2,1,1,2,2,2,2,1,2,1,2,1,1,1"));
//        System.out.println(arrayStringToListNode(new int[]{2, 1, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 2, 2, 1, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 2, 1, 2, 1, 1, 2, 2, 2, 1, 1, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 2, 1, 2, 1, 1, 2, 1, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1}));
//        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
//        System.out.println(convertToTitle(701));
//        System.out.println(convertToTitle(2147483647));
//        System.out.println(calculate("300+2*2*4/3/3-2"));
//        System.out.println(300 + 2 * 2 * 4 / 3 / 3 - 2);
//        System.out.println("--------------");
//        System.out.println(calculate("3+5 / 2"));
//        System.out.println(3 + 5 / 2);
//        System.out.println(sumNumbers(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
//        System.out.println(stringToObject("[2,3,5,8,13,21,34,11,12, 13,14,  15,null]"));
//        String s = "Hi(friends)and(family)";
//        System.out.println("<23>,1234".replaceAll("<.*?>",""));
//        System.out.println(s.replaceAll("\\[.*?]", ""));
//        System.out.println("This is a test string (more or less)".replaceAll("\\(.*?\\)", ""));
//        System.out.println(s.replaceAll(".*\\(|\\).*", ""));
//        System.out.println(s.replaceAll("..\\(|\\).", ""));
//        System.out.println(stringToObject("[2,3,null,8,13,21,34,11,12, 13,14,  15,null,17,18]"));
//        System.out.println("4 new TreeNode(13, <7>, <8>)".replaceAll("<.*?>","f"));
//        System.out.println("4 new TreeNode(13, <7>, <8>)".replaceAll("^<.*?>",""));
//        System.out.println(stringToObject("[1,null,2,null,3,null,4]"));
//        final StringBuilder stringBuilder = new StringBuilder("Assalamu alaykum qonday ");
//        System.out.println(stringBuilder);
//        System.out.println(sumRootToLeaf(new TreeNode(1, new TreeNode(0, new TreeNode(0), new TreeNode(1)), new TreeNode(1, new TreeNode(0), new TreeNode(1)))));
//        System.out.println("---------------------------");
//        System.out.println(sumRootToLeaf(new TreeNode(1, new TreeNode(0, new TreeNode(0, new TreeNode(1), null), new TreeNode(1)), new TreeNode(1, new TreeNode(0), new TreeNode(1)))));
//        System.out.println(stringToObject("[2,1,4]"));
        System.out.println(stringToObject("[1,0,3]"));
        System.out.println(getAllElements(new TreeNode(2, new TreeNode(1), new TreeNode(4)), new TreeNode(1, new TreeNode(0), new TreeNode(3))));
    }

    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        final List<Integer> res = getAllElements(root2, getAllElements(root1, new LinkedList<>()));
        Collections.sort(res);
        return res;
    }

    public static List<Integer> getAllElements(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            getAllElements(root.right, list);
            getAllElements(root.left, list);
        }
        return list;
    }

    public static int sumRootToLeaf(TreeNode root) {
        return root == null ? 0 : sumRootToLeaf(root, 0);
    }

    private static int sumRootToLeaf(TreeNode node, int sum) {
        if (node != null) {
            sum += node.val;
            return isLeaf(node) ? sum : sumRootToLeaf(node.left, sum * 2) + sumRootToLeaf(node.right, sum * 2);
        }
        return 0;
    }

    private static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public static int sumRootToLeaf(TreeNode root, String number, int sum) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                sum += sumRootToLeaf(root.left, number + root.val, sum);
            } else if (root.left != null && root.right == null) {
                sum += sumRootToLeaf(root.left, number + root.val, sum);
            } else if (root.left == null && root.right != null) {
                sum += sumRootToLeaf(root.right, number + root.val, sum);
            } else {
                sum += sumRootToLeaf(root.left, number + root.val, sum) + sumRootToLeaf(root.right, number + root.val, sum);
            }
            return sum;
        } else {
            return Integer.parseInt(number, 2);
        }
    }

    public static TreeNode reverseOddLevels(TreeNode root) {//https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/description/
        return null;
    }

    public static int sumNumbers(TreeNode root) {//https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
        final LinkedList<Integer> list = new LinkedList<>();
        sumNumbers(root, list, new StringBuilder(), root.val);
        System.out.println(list);
        return list.size();
    }

    public static void sumNumbers(TreeNode root, List<Integer> numberList, StringBuilder number, Integer last) {
        if (root != null) {
            number.append(last);
            sumNumbers(root.left, numberList, number, root.val);
            sumNumbers(root.right, numberList, number, root.val);
        } else {
            numberList.add(Integer.parseInt(number.toString()));
        }
    }

    public static int calculate(String s) {
        final StringBuilder text = new StringBuilder(s.replace(" ", ""));
        final StringBuilder number = new StringBuilder(3);
        int index = 0;
        int res = 0;
        while (!text.isEmpty()) {
            final char c = text.charAt(index);
            if (Character.isDigit(c)) {

            }
        }
        return s.length();
    }

    public static int calculate22(String s) {
        s = s.replace(" ", "");
        final Map.Entry<Integer, Character> result = calculate2(s);
        return result == null ? Integer.parseInt(s) : Integer.parseInt(s.substring(0, result.getKey())) + calculate(s.substring(result.getKey() + 1));
    }

    public static Map.Entry<Integer, Character> calculate2(String s) {
        return Stream.of(Map.entry(s.indexOf('-'), '-'), Map.entry(s.indexOf('+'), '+'), Map.entry(s.indexOf('*'), '*'), Map.entry(s.indexOf('/'), '/'))
            .filter(item -> item.getKey() != -1)
            .min(Map.Entry.comparingByKey())
            .orElse(null);
    }

    public static boolean checkSimble(char s) {
        return switch (s) {
            case '*', '+', '-', '/' -> true;
            default -> false;
        };
    }

    public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.insert(0, Character.toString(--n % 26 + 'A'));
            n /= 26;
        }
        return result.toString();
    }

    public static StringBuilder convertToHelper(int columnNumber, StringBuilder res, String number) {
        int num = columnNumber % Integer.parseInt(number);
        res.append(Character.toString(64 + (columnNumber <= 26 ? columnNumber : num)));
        return columnNumber <= 26 ? res : convertToHelper(columnNumber, res, number + "0");
    }

    public static StringBuilder convertToHelper2(int columnNumber, StringBuilder builder) {
        int i = columnNumber / 26;
        int num = columnNumber % 26;
        builder.append(Character.toString(64 + (columnNumber <= 26 ? columnNumber : num)));
        return columnNumber <= 26 ? builder : convertToHelper2(columnNumber - (i * 26), builder);
    }

    public String binaryTreePaths(TreeNode root) {
        if (root != null) {
//            root.val + (binaryTreePaths(root.left))
            return null;
        } else {
            return null;
        }
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        final int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length - 1; i++) {
            final int abs = Math.abs(temperatures[i] - temperatures[i + 1]);
            res[i] = abs;
        }
        return res;
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

    public static boolean isSubPath(ListNode head, TreeNode root) {
        return isSubPath(head, head, root);
    }

    public static boolean isSubPath(ListNode org, ListNode head, TreeNode root) {
        if (root != null && head != null) {
            head = root.val == head.val ? head.next : isSubPath(org, head, root.val);
            return isSubPath(org, head, root.left) || isSubPath(org, head, root.right);
        } else {
            return head == null;
        }
    }

    public static ListNode isSubPath(ListNode org, ListNode head, int num) {
        head = num == head.val ? head.next : org;
        return num == head.val ? isSubPath(org, head, num) : head;
    }
    // 2,2,2,1 -> 2,1
// 1,2,2,2,1 -> 2,1

    public static int distinctIntegers(int n) {
        return (int) IntStream.range(2, n)
            .map(number -> n % number)
            .peek(System.out::println)
            .distinct().count();
    }

    public static int alternateDigitSum(int n) {
        int length = 0, sum = 0;
        while (n > 0) {
            length++;
            int lastNum = n % 10;
            sum += (length % 2 == 0 ? lastNum : -lastNum);
            n /= 10;
        }
        return length % 2 == 0 ? +sum : -sum;
    }

    public static List<List<Integer>> palindromePairs(String[] words) {//https://leetcode.com/problems/palindrome-pairs/description/
        final List<List<Map.Entry<Integer, Integer>>> lists = IntStream.range(0, words.length)
            .mapToObj(index -> IntStream.range(0, words.length).filter(index2 -> index2 != index && palindromeText(words[index] + words[index2])).mapToObj(index2 -> Map.entry(index, index2)).toList())
            .toList();
        System.out.println(lists);
        return null;
    }

    public static boolean palindromeText(String text) {
        for (int right = text.length() - 1, left = 0; right > text.length() / 2; right--, left++) {
            if (text.charAt(right) != text.charAt(left)) {
                return false;
            }
        }
        return true;
    }

    public static int longestPalindrome(String[] words) {
        AtomicBoolean isOdd = new AtomicBoolean(false);
        final int sum = Arrays.stream(words)
            .collect(Collectors.toMap(item -> item, value -> 1, Integer::sum))
            .entrySet()
            .stream()
            .map(item -> Map.entry(sortText(item.getKey()), item.getValue()))
            .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())))
            .entrySet()
            .stream()
            .filter(item -> item.getKey().charAt(0) == item.getKey().charAt(1) || item.getValue().size() >= 2)
            .collect(Collectors.partitioningBy(item -> item.getKey().charAt(0) == item.getKey().charAt(1), Collectors.mapping(item2 -> Collections.min(item2.getValue()), Collectors.toList())))
            .entrySet()
            .stream()
            .mapToInt(item -> !item.getKey() ? item.getValue().stream().mapToInt(number -> number * 4).sum() : item.getValue().stream().peek(number -> isOdd.compareAndSet(false, number % 2 == 1)).mapToInt(number -> (number - (number % 2)) * 2).sum())
            .sum();
        return sum + (isOdd.get() ? 2 : 0);
    }
//{false=[1, 1, 1], true=[2, 3, 3]}

    //    {ll=[2], bb=[3], xx=[3], xl=[1, 2], lb=[4, 1], uk=[1], xb=[3, 1]}
//    (3 + 6) *2
    public static String sortText(String words) {
        final char c = words.charAt(Math.min(1, words.length() - 1));
        return c > words.charAt(0) ? c + "" + words.charAt(0) : words;
    }

    public static int longestPalindrome2(String[] words) {
        TreeMap<String, LinkedList<Boolean>> map = new TreeMap<>();
        int sum = 0;
        for (String word : words) {
            LinkedList<Boolean> values = map.getOrDefault(new String(new char[]{word.charAt(1), word.charAt(0)}), new LinkedList<>());
            if (!values.isEmpty()) {
                values.removeFirst();
                sum += 4;
            } else {
                values.addFirst(word.charAt(0) == word.charAt(1));
            }
            map.put(word, values);
        }
        System.out.println(map);
        return map.values().stream().flatMap(LinkedList::stream).anyMatch(item -> item) ? sum + 2 : sum;
    }


    public static String smallestSubsequence(String s) {
        Map<Integer, List<Object>> map = new HashMap<>();
        map.put(1, List.of(2));
        map.put(1, List.of(3));
        map.computeIfAbsent(2, value -> new LinkedList<>()).add(2);
        map.computeIfAbsent(2, value -> new LinkedList<>()).add(3);
        map.put(3, new LinkedList<>());
        map.computeIfPresent(3, (key, val) -> {
            val.add(2);
            return val;
        });
        map.computeIfPresent(3, (key, val) -> {
            val.add(3);
            return val;
        });
        map.getOrDefault(4, new LinkedList<>()).add(2);
        map.getOrDefault(4, new LinkedList<>()).add(3);
        map.merge(5, new LinkedList<>(List.of(2)), (oldItem, newItem) -> {
            oldItem.addAll(newItem);
            return oldItem;
        });
        System.out.println(map);
        return s;
    }

    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>(26);
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
            if (set.size() == 26) {
                return true;
            }
        }
        return false;
    }

    public void deleteNode(ListNode node) {

    }

    public int findDuplicate(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toMap(item -> item, value -> 1, Integer::sum))
            .entrySet()
            .stream()
            .filter(item -> item.getValue() > 1)
            .findFirst()
            .map(Map.Entry::getKey)
            .orElse(-1);
    }

    public static String decodeString(String s) {
        LinkedList<Map.Entry<Integer, StringBuilder>> list = new LinkedList<>();
        StringBuilder number = new StringBuilder();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (Character.isDigit(c)) {
                if (!text.isEmpty()) list.addLast(Map.entry(Integer.parseInt(number.toString()), text));
                number = new StringBuilder();
                text = new StringBuilder();
                number.append(c);
            } else {
                if (c == '[') {

                } else if (c == ']') {
                    String repeat = text.toString().repeat(Integer.parseInt(number.toString()));
                    if (!list.isEmpty()) {
                        final Map.Entry<Integer, StringBuilder> map = list.removeLast();
                        repeat = map.getValue().append(repeat).toString().repeat(map.getKey());
                    }
                    number = new StringBuilder();
                    text = new StringBuilder();
                    list.addLast(Map.entry(0, new StringBuilder(repeat)));
                } else {
                    text.append(c);
                }
            }
        }
        System.out.println(text);
        System.out.println(number);
        System.out.println(list);
        return null;
    }

    public static int closedIsland(int[][] grid) {
        int count = 0;
        final boolean[][] checks = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                AtomicInteger atomicInteger = new AtomicInteger();
                closedIsland(grid, checks, i, j, atomicInteger);
                if (atomicInteger.get() != 0) {
                    count++;
                    System.out.println(i + "-" + j);
                }
            }
        }
        return count;
    }

    public static boolean closedIsland(int[][] grid, boolean[][] checkList, int x, int y, AtomicInteger count) {
        if (checkExist(x, y, checkList) && !checkList[x][y]) {
            checkList[x][y] = true;
            if (grid[x][y] == 0) {
                if (closedIsland(grid, checkList, x - 1, y, count) &&
                    closedIsland(grid, checkList, x + 1, y, count) &&
                    closedIsland(grid, checkList, x, y - 1, count) &&
                    closedIsland(grid, checkList, x, y + 1, count)) {
                    if (x != grid.length - 1 && y != grid[0].length - 1 && x != 0 && y != 0) {
                        count.incrementAndGet();
                    } else {
                        count.set(0);
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return true;
    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] workers) {
        AtomicInteger minItem = new AtomicInteger(Integer.MAX_VALUE);
        final TreeMap<Integer, Integer> collect = IntStream.range(0, profit.length).boxed().collect(Collectors.toMap(index -> {
            int diff = difficulty[index];
            minItem.accumulateAndGet(diff, Math::min);
            return diff;
        }, value -> profit[value], Math::max, TreeMap::new));
        return Arrays.stream(workers)
            .filter(worker -> worker >= minItem.get())
            .map(worker -> collect
                .entrySet()
                .stream()
                .filter(item -> item.getKey() <= worker)
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getValue)
                .orElse(-1))
            .sum();
    }

    private int binarySearch(ArrayList<Integer> list, int l, int r, int maybe) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (list.get(mid) == maybe) {
                return mid;
            }
            if (list.get(mid) > maybe) {
                return binarySearch(list, l, mid - 1, maybe);
            }
            return binarySearch(list, mid + 1, r, maybe);
        }
        return list.get(l);
    }

    private int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static String[] splitMessage(String message, int limit) {//https://leetcode.com/problems/split-message-based-on-limit/description/
        if (limit > 5) {
            final int limit2 = limit - 5;

            for (int i = 0; i < message.length(); i++) {
                final int i1 = message.length() - i;
            }
        }
        return new String[0];
    }

    public static boolean containsCycle(char[][] grid) {
        TreeSet<Character> letters = new TreeSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!letters.contains(grid[i][j]) && containsCycle(grid, new boolean[grid.length][grid[0].length], i, j, i, j, grid[i][j], 0)) {
                    return true;
                } else {
                    letters.add(grid[i][j]);
                }
            }
        }
        return false;
    }

    public static boolean containsCycle(char[][] grid, boolean[][] checkedList, int i, int j, int x, int y, char letter, int counter) {
        if (checkExist(i, j, checkedList) && !checkedList[i][j] && grid[i][j] == letter) {
            checkedList[i][j] = true;
            return containsCycle(grid, checkedList, i, j + 1, x, y, letter, counter + 1) ||
                containsCycle(grid, checkedList, i - 1, j, x, y, letter, counter + 1) ||
                containsCycle(grid, checkedList, i, j - 1, x, y, letter, counter + 1) ||
                containsCycle(grid, checkedList, i + 1, j, x, y, letter, counter + 1);
        } else {
            return i == x && j == y && counter >= 4;
        }
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length == m * n) {
            final int[][] res = new int[m][n];
            for (int i = 0; i < original.length; i++) {
                res[i / n][i % n] = original[i];
            }
            return res;
        }
        return new int[][]{};
    }

    public static int minimumOperations(int[] nums) {
        final Map<Boolean, Map<Integer, Integer>> collect = IntStream.range(0, nums.length)
            .boxed()
            .collect(Collectors.partitioningBy(item -> item % 2 == 1, Collectors.toMap(index -> nums[index], value -> 1, Integer::sum)));

        return 0;
    }

    public static int getCommon2(int[] nums1, int[] nums2) {
        int i1 = 0, i2 = 0;
        while (i1 < nums1.length && i2 < nums2.length) {
            if (nums1[i1] < nums2[i2]) {
                i1++;
            } else if (nums2[i2] < nums1[i1]) {
                i2++;
            } else {
                return nums1[i1];
            }
        }
        return -1;
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        return Stream.of(nums1, nums2)
            .flatMapToInt(item -> Arrays.stream(item).distinct())
            .boxed()
            .collect(Collectors.toMap(item -> item, value -> 1, Integer::sum))
            .entrySet()
            .stream()
            .filter(item -> item.getValue() == 2)
            .min(Map.Entry.comparingByKey())
            .map(Map.Entry::getKey)
            .orElse(-1);
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {//5
        Map<Integer, Integer> map = new HashMap<>(nums.length << 1);
        for (int i = 0; i < nums.length; i++) {
            final int abs = nums[i];
            int finalI = i;
            if (map.entrySet().stream().anyMatch(item -> Math.abs(item.getKey() - abs) <= valueDiff && Math.abs(item.getValue() - finalI) <= indexDiff)) {
                return true;
            } else {
                map.put(abs, i);
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(nums.length << 1);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static int findCheapestPrice1(int n, int[][] flights, int src, int dst, int k) {//https://leetcode.com/problems/cheapest-flights-within-k-stops/solutions/?orderBy=newest_to_oldest&languageTags=java
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] i : flights) {
            adj.computeIfAbsent(i[0], value -> new ArrayList<>()).add(new int[]{i[1], i[2]});
        }
        Map<Integer, Map<Integer, Integer>> adj2 = new HashMap<>();
        for (int[] i : flights) {
            adj2.computeIfAbsent(i[0], value -> new HashMap<>()).put(i[1], i[2]);
        }
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{src, 0});
        int stops = 0;
        while (stops <= k && !q.isEmpty()) {
            int sz = q.size();
            while (sz-- > 0) {
                int[] temp = q.poll();
                int node = temp[0];
                int distance = temp[1];
                if (!adj.containsKey(node)) {
                    continue;
                }
                for (int[] e : adj.get(node)) {
                    int neighbour = e[0];
                    int price = e[1];
                    if (price + distance >= dist[neighbour]) {
                        continue;
                    }
                    dist[neighbour] = price + distance;
                    q.offer(new int[]{neighbour, dist[neighbour]});
                }
            }
            stops++;
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }

    public static int findCheapestPrice2(int n, int[][] flights, int src, int dst, int k) {
        // Distance from source to all other nodes.
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i <= k; i++) {
            // Create a copy of dist vector.
            int[] temp = Arrays.copyOf(dist, n);
            for (int[] flight : flights) {
                if (dist[flight[0]] != Integer.MAX_VALUE) {
                    temp[flight[1]] = Math.min(temp[flight[1]], dist[flight[0]] + flight[2]);
                }
            }
            // Copy the temp vector into dist.
            dist = temp;
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        final TreeMap<Integer, Map<Integer, Integer>> collect = Arrays.stream(flights)
            .map(item -> Map.entry(item[0], Map.entry(item[1], item[2])))
            .collect(Collectors.toMap(Map.Entry::getKey, item -> Map.of(item.getValue().getKey(), item.getValue().getValue()), (oldItem, newItem) -> {
                final TreeMap<Integer, Integer> res = new TreeMap<>(oldItem);
                res.putAll(newItem);
                return res;
            }, TreeMap::new));
        final HashSet<Integer> cheepsFlight = new HashSet<>();
        findCheapestPrice(collect, cheepsFlight, new TreeSet<>(), 0, src, dst, k, 0);
        System.out.println(cheepsFlight);
        cheepsFlight.remove(Integer.MAX_VALUE);
        return cheepsFlight.isEmpty() ? -1 : Collections.min(cheepsFlight);
    }

    public static int findCheapestPrice(Map<Integer, Map<Integer, Integer>> flights, Set<Integer> cheepsFlight, Set<String> checked, int parrent, int src, int dst, int k, int som) {
        final Map<Integer, Integer> orDefault = flights.getOrDefault(src, Map.of());
        if (k == -1) {
            return Integer.MAX_VALUE;
        }
        if (orDefault.containsKey(dst)) {
            cheepsFlight.add(som + orDefault.get(dst));
        } else {
            for (Map.Entry<Integer, Integer> flight : orDefault.entrySet()) {
                cheepsFlight.add(findCheapestPrice(flights, cheepsFlight, checked, src, flight.getKey(), dst, k - 1, som + flight.getValue()));
            }
// checked.add(parrent + "->" + src);
        }
        return Integer.MAX_VALUE;
    }

    public int[] findPeakGrid(int[][] mat) {
        Map.Entry<Integer, int[]> entry = Map.entry(mat[0][0], new int[]{0, 0});
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (entry.getKey() < mat[i][j]) {
                    entry = Map.entry(mat[i][j], new int[]{i, j});
                }
            }
        }
        return entry.getValue();
    }

    public int findPeakElement(int[] nums) {
        return IntStream.range(0, nums.length)
            .mapToObj(item -> Map.entry(item, nums[item]))
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(-1);
    }

    public static int[][] updateMatrix(int[][] mat) {
        final boolean[][] checkArray = new boolean[mat.length][mat[0].length];
        final boolean[][] checkArray2 = new boolean[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                updateMatrix(mat, checkArray, i, j);
                updateMatrix(mat, checkArray2, j, i);
            }
        }
        return mat;
    }

    public static void updateMatrix(int[][] mat, boolean[][] checked, int x, int y) {
        if (!checked[x][y]) {
            checked[x][y] = true;
            if (mat[x][y] != 0) {
                if ((!checkExist(x, y - 1, checked) || mat[x][y - 1] != 0) && (!checkExist(x, y + 1, checked) || mat[x][y + 1] != 0) && (!checkExist(x - 1, y, checked) || mat[x - 1][y] != 0) && (!checkExist(x + 1, y, checked) || mat[x + 1][y] != 0)) {
                    mat[x][y]++;
                }
            }
        }
    }

    public static int climbStairs(int n) {
        int count = n;
        if (n > 2) {
            double i = Math.ceil(n / (double) 2);
            if (i % 2 == 1) {
                count += Math.pow(i, 2);
            }
        }
        return count;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root != null) {
            if (root.val > val) {
                root.left = insertIntoBST(root.left, val);
            } else {
                root.right = insertIntoBST(root.right, val);
            }
        } else {
            return new TreeNode(val);
        }
        return root;
    }

    public void insertIntoBST(int val, TreeNode root) {

    }

    public static char[][] rotateTheBox(char[][] box) {//https://leetcode.com/problems/rotating-the-box/
        final char[][] chars = new char[box[0].length][box.length];
        for (int i = 0; i < box.length; i++) {
            for (int index = box[i].length - 1; index >= 0; index--) {
            }
        }
        return chars;
    }

    public static void soutArray(String text) {
        System.out.println("---------------------------------");
        for (String s : text.split("],")) {
            System.out.println(s.replaceAll("[\\[\\]\" ]", ""));
        }
        System.out.println("---------------------------------");
    }

    public static char[][] updateBoard(char[][] board, int[] click) {
        updateBoard(board, click[0], click[1]);
        return board;
    }

    public static void updateBoard(char[][] board, int x, int y) {
        if (checkExist(x, y, board)) {
            if (board[x][y] == 'M') {
                board[x][y] = 'X';
            } else if (board[x][y] == 'E') {
                int countBooms = 0;
                if (board[x][y] == 'E') {
                    if (checkExist(x - 1, y, board) && board[x - 1][y] == 'M') {
                        countBooms++;
                    }
                    if (checkExist(x + 1, y, board) && board[x + 1][y] == 'M') {
                        countBooms++;
                    }
                    if (checkExist(x, y - 1, board) && board[x][y - 1] == 'M') {
                        countBooms++;
                    }
                    if (checkExist(x, y + 1, board) && board[x][y + 1] == 'M') {
                        countBooms++;
                    }
                    if (checkExist(x - 1, y - 1, board) && board[x - 1][y - 1] == 'M') {
                        countBooms++;
                    }
                    if (checkExist(x + 1, y + 1, board) && board[x + 1][y + 1] == 'M') {
                        countBooms++;
                    }
                    if (checkExist(x - 1, y + 1, board) && board[x - 1][y + 1] == 'M') {
                        countBooms++;
                    }
                    if (checkExist(x + 1, y - 1, board) && board[x + 1][y - 1] == 'M') {
                        countBooms++;
                    }
                }
                board[x][y] = countBooms == 0 ? 'B' : (char) (countBooms + '0');
                if (board[x][y] == 'B') {
                    updateBoard(board, x, y + 1);
                    updateBoard(board, x, y - 1);
                    updateBoard(board, x + 1, y);
                    updateBoard(board, x - 1, y);
                    updateBoard(board, x + 1, y + 1);
                    updateBoard(board, x - 1, y - 1);
                    updateBoard(board, x + 1, y - 1);
                    updateBoard(board, x - 1, y + 1);
                }
            }
        }
    }

    private static boolean checkExist(int x, int y, char[][] ints) {
        return ints[0].length - 1 >= y && ints.length - 1 >= x && 0 <= x && 0 <= y;
    }

    private static boolean checkExist(int x, int y, int[][] ints) {
        return ints[0].length - 1 >= y && ints.length - 1 >= x && 0 <= x && 0 <= y;
    }

    private static boolean checkExist(int x, int y, Object[][] ints) {
        return ints[0].length - 1 >= y && ints.length - 1 >= x && 0 <= x && 0 <= y;
    }

    private static boolean checkExist(int x, int y, String[][] ints) {
        return ints[0].length - 1 >= y && ints.length - 1 >= x && 0 <= x && 0 <= y;
    }

    private static boolean checkExist(int x, int y, boolean[][] ints) {
        return ints[0].length - 1 >= y && ints.length - 1 >= x && 0 <= x && 0 <= y;
    }

    public static String tictactoe(int[][] moves) {//https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
        char[][] chars = new char[3][3];
        for (int i = 0; i < moves.length; i++) {
            final int[] move = moves[i];
            chars[move[0]][move[1]] = i % 2 == 0 ? 'A' : 'B';
        }
        System.out.println(Arrays.deepToString(chars));
        if (chars[0][0] == chars[1][1] && chars[1][1] == chars[2][2] || chars[0][2] == chars[1][1] && chars[1][1] == chars[2][0]) {
            return Character.toString(chars[0][0]);
        }

        for (int i = 0; i < chars.length; i++) {
            int a = 0, b = 0, c = 0, d = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i][j] == 'A') {
                    a++;
                }
                if (chars[i][j] == 'B') {
                    b++;
                }
                if (chars[j][i] == 'A') {
                    c++;
                }
                if (chars[j][i] == 'B') {
                    d++;
                }
            }
            if (a == 3 || b == 3 || c == 3 || d == 3) {
                return a == 3 || c == 3 ? "A" : "B  ";
            }
        }
        return "Draw";
    }

    public static int numEquivDominoPairs(int[][] dominoes) {
        return Collections.max(Arrays.stream(dominoes)
            .peek(Arrays::sort)
            .map(Arrays::toString)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .values()).intValue();
    }

    public String findLongestWord(String s, List<String> dictionary) {
        final Map<Object, List<Map.Entry<String, Integer>>> collect = dictionary.stream()
            .map(word -> Map.entry(word, word.chars().map(letter -> s.indexOf((char) letter) > 0 ? 1 : 0).sum()))
            .collect(Collectors.groupingBy(Map.Entry::getValue));
        System.out.println(collect);
        return null;
    }

    public static List<String> commonChars(String[] words) {//https://leetcode.com/problems/find-common-characters/submissions/883571222/
        return Arrays.stream(words)
            .flatMap(word -> word.chars().mapToObj(letter -> (char) letter).collect(Collectors.toMap(letter -> letter, value -> 1, Integer::sum)).entrySet().stream())
            .collect(Collectors.groupingBy(Map.Entry::getKey))
            .values()
            .stream()
            .filter(item -> item.size() == words.length)
            .flatMap(Collection::stream)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Math::min))
            .entrySet()
            .stream()
            .flatMap(item -> Stream.iterate(item.getKey(), n -> n).map(Object::toString).limit(item.getValue()))
            .toList();
    }


    public static boolean validMountainArray(int[] arr) {
        int sum = 0;
        boolean status = arr[0] > arr[Math.min(1, arr.length - 1)];
        for (int i = 0; i < arr.length - 1; i++) {
            if (status) {
                if (arr[i] > arr[i + 1]) {
                } else {

                }
            }
        }
        return true;
    }

    public static int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return new int[]{nums[i], (nums[i + 2] == nums[i] + 1 ? --nums[i] : ++nums[i])};
            }
        }
        return nums;
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double max = nums[0];
        for (int in = 0; in < k; in++) {
            sum += nums[in];
        }
        for (int i = k, j = 0; i < nums.length; i++, j++) {
            sum = sum + nums[i] - nums[j];
            max = Math.max(max, (double) sum / k);
        }
        return max;
    }

    public static int pivotIndex(int[] nums) {//https://leetcode.com/problems/find-pivot-index/
        int left = nums[0], right = nums[nums.length];
        while (left == right) {

        }
        return 01;
    }

    public static int maximumProduct(int[] arr) {
        int sumMinus = 0, countA = 0;
        int sum = 0, countB = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && countA != 2) {
                sumMinus = arr[i];
                countA++;
            } else if (countB != 2) {
                sum = arr[i];
                countB++;
            }
        }
        return arr[arr.length - 3] * arr[arr.length - 2] * arr[arr.length - 1];
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int i1 = arr.length - 1, i2 = arr.length - 2; i1 > i; i1--, i2--) {
                    arr[i1] = arr[i2];
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static String[] findRelativeRanks(int[] score) {
        AtomicInteger counter = new AtomicInteger(1);
        return IntStream.range(0, score.length)
            .mapToObj(number -> Map.entry(score[number], number))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldItem, newItem) -> oldItem, () -> new TreeMap<Integer, Integer>(Comparator.reverseOrder())))
            .values()
            .stream()
            .map(integer -> Map.entry(integer, getRanks(counter.getAndIncrement())))
            .sorted(Map.Entry.comparingByKey())
            .map(Map.Entry::getValue)
            .toArray(String[]::new);
    }

    public static String getRanks(Integer number) {
        return switch (number) {
            case 1 -> "Gold Medal";
            case 2 -> "Silver Medal";
            case 3 -> "Bronze Medal";
            default -> number.toString();
        };
    }

    static boolean arithmeticThree(int[] set, int n) {
        for (int j = 0; j < set.length; j++) {
            int i = j - 1, k = j + 1;
            while (i >= 0 && k <= n - 1) {
                if (set[i] + set[k] == 2 * set[j])
                    System.out.println(set[i]);
                final int i1 = (set[i] + set[k] < 2 * set[j]) ? k++ : i--;
            }
        }
        return false;
    }


    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, new boolean[nums.length], nums.length / 2);
    }

    public static TreeNode sortedArrayToBST(int[] nums, boolean[] checked, int index) {
        if (index == checked.length || index == -1) return null;
        if (!checked[index]) {
            checked[index] = true;
            return new TreeNode(nums[index], sortedArrayToBST(nums, checked, index - 1), sortedArrayToBST(nums, checked, index + 1));
        } else {
            return null;
        }
    }

    public List<Integer> majorityElement(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toMap(i -> i, i -> 1, Integer::sum))
            .entrySet()
            .stream()
            .filter(item -> item.getValue() > nums.length / 3)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }

    public static List<String> summaryRanges(int[] nums) {
        LinkedList<String> list = new LinkedList<>();
        if (nums.length != 0) {
            int min = nums[0], max;
            for (int i = 0; i < nums.length; i++) {
                if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
                    max = nums[i];
                    list.add(min == max ? min + "" : min + "->" + max);
                    min = nums[Math.min(i + 1, nums.length - 1)];
                }
            }
        }
        return list;
    }

    public static int projectionArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            int max2 = 0;
            for (int index = 0; index < grid.length; index++) {
                if (grid[i][index] != 0) {
                    sum++;
                }
                max = Math.max(max, grid[i][index]);
                max2 = Math.max(max2, grid[index][i]);
            }
            sum += max;
            sum += max2;
        }
        return sum;
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        final int[] ints = new int[nums.length + 1 - k];
        final LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0, gk = k - 1; i < nums.length + 1 - k; i++, gk++) {
            if (i == 0) {
                for (int i1 = 0; i1 < k; i1++) {
                    list.add(nums[i1]);
                }
            } else {
                list.removeFirst();
                list.addLast(nums[gk]);
            }
            ints[i] = Collections.max(list);
        }
        return ints;
    }


    public static int repeatedNTimes(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toMap(item -> item, value -> 1, Integer::sum))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(-1);
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        dictionary = dictionary.stream().distinct().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        final StringBuilder res = new StringBuilder(sentence.length());
        final String[] s = sentence.split(" ");
        loop:
        for (String text : s) {
            for (String www : dictionary) {
                if (text.startsWith(www)) {
                    res.append(www).append(" ");
                    continue loop;
                }
            }
            res.append(text).append(" ");
        }
        return res.toString().trim();
    }

    public static String fractionToDecimal(int numerator, int denominator) {
//        denominator - numerator;
        return "";
    }

    public static int deleteGreatestValue(int[][] grid) {
        int value = Integer.MIN_VALUE;
        for (int[] ints : grid) {
            Arrays.sort(ints);
            value = Math.max(ints[ints.length - 1], value);
            ints[ints.length - 1] = -1;
        }
        return value == -1 ? 0 : value + deleteGreatestValue(grid);
    }

    public List<Integer> largestDivisibleSubset(int[] nums) {
        return null;
    }

    public static int lastRemaining(int n) {
        return 0;
    }

    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {//https://leetcode.com/problems/spiral-matrix-iii/description/
        final int[][] res = new int[rows * cols][2];
        int right = rows - 1, left = rStart, down = cols - 1, up = cStart, counter = 0, totalCount = rows * cols;
        while (counter != totalCount) {
            for (int i = left; counter != totalCount && i <= right; i++) {
                res[counter++] = new int[]{i, up};
            }
            up++;
            for (int i = up; counter != totalCount && i <= down; i++) {
                res[counter++] = new int[]{right, i};
            }
            right--;
            for (int i = right; counter != totalCount && i >= left; i--) {
                res[counter++] = new int[]{i, down};
            }
            down--;
            for (int i = down; counter != totalCount && i >= up; i--) {
                res[counter++] = new int[]{left, i};
            }
            left++;
        }
        return res;
    }

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int right = n - 1, left = 0, down = n - 1, up = 0, counter = 0, totalCount = res[0].length * res.length;
        while (counter != totalCount) {
            for (int i = left; counter != totalCount && i <= right; i++) {
                res[up][i] = ++counter;
            }
            up++;
            for (int i = up; counter != totalCount && i <= down; i++) {
                res[i][right] = ++counter;
            }
            right--;
            for (int i = right; counter != totalCount && i >= left; i--) {
                res[down][i] = ++counter;
            }
            down--;
            for (int i = down; counter != totalCount && i >= up; i--) {
                res[i][left] = ++counter;
            }
            left++;
        }
        return res;
    }

    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];
        int right = n - 1, left = 0, down = m - 1, up = 0, totalCount = res[0].length * res.length;
        while (0 != totalCount) {
            for (int i = left; 0 != totalCount && i <= right; i++, totalCount--) {
                res[up][i] = getValue(head);
                head = changeNode(head);
            }
            up++;
            for (int i = up; 0 != totalCount && i <= down; i++, totalCount--) {
                res[i][right] = getValue(head);
                head = changeNode(head);
            }
            right--;
            for (int i = right; 0 != totalCount && i >= left; i--, totalCount--) {
                res[down][i] = getValue(head);
                head = changeNode(head);
            }
            down--;
            for (int i = down; 0 != totalCount && i >= up; i--, totalCount--) {
                res[i][left] = getValue(head);
                head = changeNode(head);
            }
            left++;
        }
        return res;
    }

    public static int getValue(ListNode head) {
        return head != null ? head.val : -1;
    }

    public static ListNode changeNode(ListNode head) {
        return head != null ? head.next : null;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {//https://leetcode.com/problems/spiral-matrix/
        boolean[][] checked = new boolean[matrix.length][matrix[0].length];
        ArrayList<Integer> line = new ArrayList<>(matrix[0].length * matrix.length);
        int right = matrix[0].length - 1, left = 0, down = matrix.length - 1, up = 0;
        while (true) {
            if (left > right || up > down) {
                return line;
            }
            for (int i = left; i <= right; i++) {
                if (!checked[up][i]) {
                    checked[up][i] = true;
                    line.add(matrix[up][i]);
                }
            }
            up++;
            for (int i = up; i <= down; i++) {
                if (!checked[i][right]) {
                    checked[i][right] = true;
                    line.add(matrix[i][right]);
                }
            }
            right--;
            for (int i = right; i >= left; i--) {
                if (!checked[down][i]) {
                    checked[down][i] = true;
                    line.add(matrix[down][i]);
                }
            }
            down--;
            for (int i = down; i >= up; i--) {
                if (!checked[i][left]) {
                    checked[i][left] = true;
                    line.add(matrix[i][left]);
                }
            }
            left++;
        }
    }

    public static int minMaxGame(int[] nums) {//https://leetcode.com/problems/min-max-game/description/
        if (nums.length <= 2) {
            return Math.min(nums[0], nums[nums.length - 1]);
        } else {
            int[] ints = new int[nums.length / 2];
            for (int i = 0, j = 0; i < ints.length; i++, j += 2) {
                ints[i] = i % 2 == 0 ? Math.min(nums[j], nums[j + 1]) : Math.max(nums[j], nums[j + 1]);
            }
            return minMaxGame(ints);
        }
    }

    public static boolean haveConflict(String[] event1, String[] event2) {//https://leetcode.com/problems/determine-if-two-events-have-conflict/
        int c1 = event2[0].compareTo(event1[1]);
        int c2 = event2[1].compareTo(event1[0]);
        return (c1 <= 0) && (c2 >= 0);
    }

    private static int timeParseLong(String time) {
        return Integer.parseInt(new StringBuilder(time).deleteCharAt(2).toString());
    }

    public static List<String> buildArray(int[] target, int n) {//https://leetcode.com/problems/build-an-array-with-stack-operations/description/
        final ArrayList<String> operations = new ArrayList<>(n);
        operations.add("Push");
        for (int i = 0; i < target.length; i++) {

        }
        return operations;
    }

    public static int differenceOfSum(int[] nums) {//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
        int sum = 0, sum2 = 0;
        for (int num : nums) {
            sum += num;
            sum2 += differenceOfSum(num);
        }
        return Math.abs(sum - sum2);
    }

    static int differenceOfSum(int num) {
        int sum = 0;
        if (num > 9) {
            while (num != 0) {
                sum += num % 10;
                num = num / 10;
            }
        } else {
            sum += num;
        }
        return sum;
    }

    public static int[] countSubTrees2(int n, int[][] edges, String labels) {
        final TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for (int[] edge : edges) {
            map.merge(edge[0], List.of(edge[1]), (oldItem, newItem) -> {
                new LinkedList<>(oldItem).addAll(newItem);
                return oldItem;
            });
        }
        System.out.println(map);
        return new int[]{};
    }


    public static int[] countSubTrees(int n, int[][] edges, String labels) {
        int[] ints = new int[n];
        ArrayList<LinkedList<Integer>> lists = new ArrayList<>(n);
        for (int i = 0; i < n; i++) lists.add(new LinkedList<>());
        for (int[] edge : edges) {
            lists.get(edge[0]).add(edge[1]);
            lists.get(edge[1]).add(edge[0]);
        }
        System.out.println(lists);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = countSubTrees(i, labels.charAt(i), labels, lists) + 1;
        }
        return ints;
    }

    //    a
//        e
//    e2
//        d
//    a e2
//    a d
//    e e2
    public static int countSubTrees(int n, char letter, String labels, ArrayList<LinkedList<Integer>> lists) {
        int count = 0;
        for (Integer index : lists.get(n)) {
            if (n > index) {
                continue;
            }
            if (labels.charAt(index) == letter) {
                count++;
            }
            count += countSubTrees(index, letter, labels, lists);
        }
        return count;
    }


    public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        return minTimeToCollectApples(0, list, hasApple, 0);
    }

    static int minTimeToCollectApples(int index, List<List<Integer>> list, List<Boolean> hasApple, int parent) {
        int total = 0;
        for (int nbr : list.get(index)) {
            if (nbr == parent) {
                continue;
            }
            total += minTimeToCollectApples(nbr, list, hasApple, index);
        }
        if (index != 0 && (hasApple.get(index) || total > 0)) {
            total += 2;
        }
        return total;
    }

    public static int minTime2(int n, int[][] edges, List<Boolean> hasApple) {
        if (hasApple.contains(true)) {
            ArrayList<LinkedList<Integer>> edgeLar = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                edgeLar.add(new LinkedList<>());
            }
            for (int[] edge : edges) {
                edgeLar.get(edge[0]).addLast(edge[1]);
                edgeLar.get(edge[1]).addLast(edge[0]);
            }
            return minTime(0, edgeLar, hasApple);
        } else return 0;
    }

    public static int minTime(int index, ArrayList<LinkedList<Integer>> edges, List<Boolean> hasApple) {
        final LinkedList<Integer> list = edges.get(index);
        int total = 0;
        for (Integer n : list) {
            if (n == index) {
                continue;
            }
            total += minTime(n, edges, hasApple);
        }
        if (index != 0 && (hasApple.get(index) || total > 0))
            total += 2;
        return total;
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int cost : costs) {
            if (cost <= coins) {
                coins -= cost;
                count++;
            }
        }
        return count;
    }
}
