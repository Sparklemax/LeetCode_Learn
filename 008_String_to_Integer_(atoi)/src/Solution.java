import javax.swing.*;

/**
 * @author Sparklemax
 * @date 2019/9/6 21:18
 */

class Solution {
    public int myAtoi(String str) {
        int i = 0, ans = 0, sign = 1, len = str.length();
        //处理前面的空格
        while (i < len && str.charAt(i) == ' ')
            i++;

        //获取正负号
        if (i < len && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            sign = str.charAt(i) == '-' ? -1 : 1;
            i++;
        }


        //开始处理
        for (; i < len; i++) {
            int tmp = str.charAt(i) - '0';
            if (tmp < 0 || tmp > 9)
                break;

            //越界判断
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && (tmp > 7 && sign == 1 || tmp > 8 && sign == -1))) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + tmp;
        }
        return sign * ans;
    }
}
