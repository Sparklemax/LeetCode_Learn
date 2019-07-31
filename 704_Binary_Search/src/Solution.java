/**
 * @author matrixmax
 * @date 2019/7/25 16:44
 */

class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] == target)
            return left;
        else
            return -1;
    }
}