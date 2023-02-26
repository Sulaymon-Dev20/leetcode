package uz.leetcode.solutions;

import static uz.leetcode.model.Utils.checkExist;

public class S419 {
    public int countBattleships(char[][] board) {
        boolean[][] checked = new boolean[board.length][board[0].length];
        int res = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (countBattleships(board, checked, i, j)) {
                    res++;
                }
            }
        }
        return res;
    }

    public boolean countBattleships(char[][] board, boolean[][] checked, int x, int y) {
        if (checkExist(x, y, checked) && !checked[x][y]) {
            checked[x][y] = true;
            if (board[x][y] == 'X') {
                countBattleships(board, checked, x + 1, y);
                countBattleships(board, checked, x - 1, y);
                countBattleships(board, checked, x, y + 1);
                countBattleships(board, checked, x, y - 1);
                return true;
            }
        }
        return false;
    }
}
