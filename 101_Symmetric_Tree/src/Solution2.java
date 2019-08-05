import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Sparklemax
 * @date 2019/8/5 20:51
 */

/*
* 思路：迭代法
* 队列中每两个连续的结点应该是相等的，而且它们的子树互为镜像。
* 最初，队列中包含的是 root 以及 root。该算法的工作原理类似于 BFS，但存在一些关键差异。
* 每次提取两个结点并比较它们的值。然后，将两个结点的左右子结点按相反的顺序插入队列中。
* 当队列为空时，或者我们检测到树不对称（即从队列中取出两个不相等的连续结点）时，该算法结束。
*
* 复杂度分析
* 时间复杂度：O(n)
* 搜索链表需要额外的空间。在最糟糕情况下，向队列中插入O(n)个结点。因此，空间复杂度为 O(n)。
* */

public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }
}
