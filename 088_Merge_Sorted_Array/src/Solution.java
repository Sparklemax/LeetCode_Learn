/**
 * @author matrixmax
 * @date 2019/8/2 21:05
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            nums1[temp--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while (n >= 0) {
            nums1[temp--] = nums2[n--];
        }
    }
}
