/**
 * @author matrixmax
 * @date 2019/7/31 19:43
 */

/*
 * 思路：
 * 牛顿迭代法求平方根
 * 参考：https://en.wikipedia.org/wiki/Integer_square_root#Using_only_integer_division
 * */

public class Solution {
    public int mySqrt(int x) {
        long n = x;
        while (n * n > x) {
            n = (n + x / n) >> 1;
        }
        return (int) n;
    }
}
