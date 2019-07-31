/**
 * @author matrixmax
 * @date 2019/7/11
 */


public class main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int input1[] = new int[]{2,4,3};
        int input2[] = new int[]{5,6,4};
        ListNode a = new ListNode().bulidListNode(input1);
        ListNode b = new ListNode().bulidListNode(input2);
        sl.addTwoNumbers(a,b).print();
    }
}
