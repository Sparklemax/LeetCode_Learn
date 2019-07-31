/**
 * @author matrixmax
 * @date 2019/7/24 20:47
 */

/*
 * 题目等价表达式
 * 1、如果目标值（严格）大于排序数组的最后一个数，返回这个排序数组的长度，否则进入第 2 点。
 * 2、返回排序数组从左到右，大于或者等于目标值的第 1 个数的索引。
 *
 * */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (len == 0)
            return 0;
        int left = 0, right = len;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < target)//排除中位数的逻辑
                left = mid + 1;//当中位数小的时候，一定可以确定收缩
            else
                right = mid;//当中位数大的时候，所求可能在里面，所以不收缩
        }
        return left;//返回left或者right都一样
    }
}
