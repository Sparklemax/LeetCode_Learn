/**
 * @author matrixmax
 * @date 2019/7/18 10:37
 */

/*
*
* 用long保存结果，与integer范围判断然后返回结果
* 中间for循环进行逆序
*
* */

public class Solution {
    public int reverse(int x) {
        long res = 0;
        for (; x != 0; x = x / 10) {
            res = res * 10 + x % 10;
        }
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }
}
