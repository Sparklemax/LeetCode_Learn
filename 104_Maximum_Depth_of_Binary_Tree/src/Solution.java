/**
 * @author Sparklemax
 * @date 2019/8/6 19:18
 */

/*
* 思路：递归
* 复杂度分析：
* 时间复杂度：每个结点只访问一次，因此时间复杂度为 O(N)，
* 空间复杂度：：在最糟糕的情况下，树是完全不平衡的，递归将会被调用 NN 次（树的高度）
* */

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else {
            int left_depth = maxDepth(root.left);
            int right_depth = maxDepth(root.right);
            return Math.max(left_depth,right_depth)+1;
        }
    }
}