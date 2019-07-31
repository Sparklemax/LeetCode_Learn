/**
 * @author matrixmax
 * @date 2019/7/24 20:47
 */

public class main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] nums = new int[]{1,3};
        System.out.println(sl.searchInsert(nums,0));
        System.out.println(sl.searchInsert(nums,3));
        System.out.println(sl.searchInsert(nums,9));
        System.out.println(sl.searchInsert(nums,6));
        System.out.println(sl.searchInsert(nums,0));
        System.out.println(sl.searchInsert(nums,10));

    }
}
