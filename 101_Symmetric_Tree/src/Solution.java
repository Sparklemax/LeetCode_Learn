/**
 * @author Sparklemax
 * @date 2019/8/5 20:16
 */

/*
* 思路：递归
* 复杂度分析：
* 时间复杂度：O(n)，因为我们遍历整个输入树一次，所以总的运行时间为 O(n)，其中 n 是树中结点的总数。
* 空间复杂度：递归调用的次数受树的高度限制。在最糟糕情况下，树是线性的，其高度为 O(n)。
* */

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    public boolean isMirror(TreeNode t1,TreeNode t2){
        if(t1 == null &&t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
        return (t1.val==t2.val)&&isMirror(t1.right,t2.left)&&isMirror(t1.left,t2.right);
    }

}