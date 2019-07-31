import java.util.Arrays;

/**
 * @author matrixmax
 * @date 2019/7/7
 */

public class main {
    public static void main(String[] args) {
        Solution3 sl = new Solution3();
        int[] nums = new int[]{1,7,2,55};
        int target = 9;
        System.out.println(Arrays.toString(sl.twoSum(nums,target)));
    }
}
