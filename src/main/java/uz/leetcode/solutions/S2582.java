package uz.leetcode.solutions;

public class S2582 {
    public int passThePillow(int n, int time) {
        boolean status = false;
        int res = 1;
        for (int i = 0; i < time; i++, res += status ? -1 : 1) {
            if (res == 1) {
                status = false;
            } else if (res == n) {
                status = true;
            }
        }
        return res;
    }
}
