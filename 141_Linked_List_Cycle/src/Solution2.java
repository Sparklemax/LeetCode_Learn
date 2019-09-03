/**
 * @author Sparklemax
 * @date 2019/9/3 21:29
 */

/*
* 思路：双指针
* 复杂度分析
*
* */

public class Solution2 {
    public boolean hasCycle(ListNode head) {
        if(head ==null ||head.next==null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow!=fast){
            if(fast==null||fast.next==null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}