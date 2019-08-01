/**
 * @author matrixmax
 * @date 2019/7/31 20:36
 */

/*
 * 思路：记忆化递归
 * 可以把每一步的结果存储在memo数组之中，每当函数再次被调用，直接从memo数组返回结果。
 * 在memo数组的帮助下，得到一个修复的递归树，其大小减少到n。
 * */

public class Solution {
    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climb(0, n, memo);
    }

    public int climb(int i, int n, int[] memo) {
        if (i > n)
            return 0;
        if (i == n)
            return 1;
        if (memo[i] > 0)
            return memo[i];
        memo[i] = climb(i + 1, n, memo) + climb(i + 2, n, memo);
        return memo[i];
    }
}
