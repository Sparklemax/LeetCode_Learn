/**
 * @author matrixmax
 * @date 2019/7/15 21:07
 */

/*
* 思路：模拟人的计算过程
*就像你在纸上计算两个数字的和那样，
* 我们首先从最低有效位也就是列表 l1 和 l2 的表头开始相加。
* 由于每位数字都应当处于 0…9 的范围内，我们计算两个数字的和时可能会出现 “溢出”。例如，5+7=12。
* 在这种情况下，我们会将当前位的数值设置为 2，并将进位 carry=1 带入下一次迭代。
* 进位 carry必定是 0 或 1，这是因为两个数字相加（考虑到进位）可能出现的最大和为 9 + 1 = 19。
*
* 复杂度分析
* 时间复杂度：O(max(m, n))，假设 m 和 n 分别表示 l1 和 l2 的长度，上面的算法最多重复 max(m, n) 次。
* 空间复杂度：O(max(m, n))， 新列表的长度最多为 max(m,n)+1。
*
* */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;//curr用来建立新的结果链表
        int carry = 0;//进位
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;//计算是否进位
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;//l1链表是否有多的长度
            if (q != null) q = q.next;//l2链表是否有多的长度
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
