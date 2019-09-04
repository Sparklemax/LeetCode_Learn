/**
 * @author Sparklemax
 * @date 2019/9/3 21:29
 */

/*
* 思路：双指针
* 复杂度分析
* 空间复杂度：o(1)
* 时间复杂度
*   1：没有环：o(n)
*   2：有环（分成两个阶段） 一共是o(n+k)
*       2.1：非环部分 o(n)
*       2.2：环形部分 o(k) k是环形部分长度
*
* */

public class Solution2 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if(fast == null || fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}