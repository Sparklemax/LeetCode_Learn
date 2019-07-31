/**
 * @author matrixmax
 * @date 2019/7/18 20:51
 */

/*
 *
 * 数学方法：取整和取余，拿出头和尾来进行比较
 *
 * */

public class Solution2 {
    public boolean isPalindrome(int x) {
        if (x < 0)//如果是复数，直接返回错误
            return false;
        int div = 1;//用于找出最大位数
        while (x / div >= 10)//此处注意
            div = div * 10;
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right)
                return false;
            x = (x % div) / 10;
            div = div / 100;
        }
        return true;
    }
}
