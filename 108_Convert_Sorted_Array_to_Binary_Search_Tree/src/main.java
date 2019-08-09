/**
 * @author Sparklemax
 * @date 2019/8/9 16:31
 */

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        TreeNode root = solution.sortedArrayToBST(nums);
        TreeNode.print(root);
    }

}
