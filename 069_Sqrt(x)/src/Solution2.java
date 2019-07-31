/**
 * @author matrixmax
 * @date 2019/7/31 19:55
 */

/*
 *思路：二分查找
 * */

public class Solution2 {
    public int mySqrt(int x) {
        long left = 0;//数可能选择0；
        long right = x / 2 + 1;//照顾1
        while (left < right) {
            //注意这里选择右中位数，因为左边界的时候，不能排除，不会收缩，
            long mid = (right + left + 1) >> 1;
            if(mid * mid >x)//首先确定右边界收缩
                right = mid-1;
            else
                left = mid;
        }
        return (int) left;
    }
}
