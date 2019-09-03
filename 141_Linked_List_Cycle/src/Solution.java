import java.util.HashSet;
import java.util.Set;

/**
 * @author Sparklemax
 * @date 2019/9/3 19:55
 */

/*
* 思路：hash法
* 遍历所有节点，如果最后为null，那说明已经遍历到最后，没有环
* 如果当前节点已经存在与hash表中，那则有环
*
* 复杂度分析：
* 时间复杂度：O(n)
* 空间复杂度：O(n)
*
* */

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();
        while (head!=null){
            if(nodes.contains(head))
                return true;
            else
                nodes.add(head);
            head = head.next;
        }
        return false;
    }
}