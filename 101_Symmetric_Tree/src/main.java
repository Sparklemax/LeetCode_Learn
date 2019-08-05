/**
 * @author Sparklemax
 * @date 2019/8/5 20:16
 */

public class main {
    public static void main(String[] args) {
        Solution2 sl = new Solution2();
        System.out.println(sl.isSymmetric(TreeNode.createTreeNode("[1,2,2,3,4,4,3]")));
        System.out.println(sl.isSymmetric(TreeNode.createTreeNode("[1,2,2,null,3,null,3]")));
        System.out.println(sl.isSymmetric(TreeNode.createTreeNode("[9,-42,-42,null,76,76,null,null,13,null,13]")));
    }
}
