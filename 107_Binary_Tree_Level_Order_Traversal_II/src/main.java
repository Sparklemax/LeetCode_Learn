/**
 * @author Sparklemax
 * @date 2019/8/6 19:57
 */

public class main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.levelOrderBottom(TreeNode.createTreeNode("[]")));
        System.out.println(sl.levelOrderBottom(TreeNode.createTreeNode("[1,2,2,3,4,4,3]")));
        System.out.println(sl.levelOrderBottom(TreeNode.createTreeNode("[9,-42,-42,null,76,76,null,null,13,null,13]")));

    }
}
