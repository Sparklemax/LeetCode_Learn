import java.util.Arrays;

/**
 * @author matrixmax
 * @date 2019/8/2 21:05
 */

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[10];
        for (int i = 0; i < 5; ++i) {
            nums1[i] = 2 * i;
        }
        int[] nums2 = new int[5];
        for (int i = 0; i < 5; ++i) {
            nums2[i] = 2 * i + 1;
        }
        solution.merge(nums1, 5, nums2, 5);
        System.out.println(Arrays.toString(nums1));
    }
}
