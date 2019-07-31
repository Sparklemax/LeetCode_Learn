/**
 * @author matrixmax
 * @date 2019/7/22 19:49
 */

public class main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] input1 = new int[]{1,3,5,7,9};
        int[] input2 = new int[]{2,4,6,8,10};
        ListNode ln1 = ListNode.bulidListNode(input1);
        ListNode ln2 = ListNode.bulidListNode(input2);
        ln1.print();
        ln2.print();
        sl.mergeTwoLists(ln1,ln2).print();
    }
}
