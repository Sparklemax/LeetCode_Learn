import java.util.*;

/**
 * @author Sparklemax
 * @date 2019/8/6 19:58
 */

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> res = new LinkedList<>();
        if(root == null)
            return res;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            res.add(0,tmp);
        }
        return res;
    }
}