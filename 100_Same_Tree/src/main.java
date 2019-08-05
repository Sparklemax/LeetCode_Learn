/**
 * @author Sparklemax
 * @date 2019/8/3 20:40
 */

public class main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.isSameTree(
                TreeNode.createTreeNode("[1,2,2,null,3,null,3]"),
                TreeNode.createTreeNode("[1,2,2,null,3,null,3]"))
        );
        System.out.println(sl.isSameTree(
                TreeNode.createTreeNode("[1,2,2,null,3,null,3]"),
                TreeNode.createTreeNode("[1,2,2,null,3,null,null]"))
        );
    }
}
