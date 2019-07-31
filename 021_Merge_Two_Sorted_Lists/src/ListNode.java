/**
 * @author matrixmax
 * @date 2019/7/22 19:49
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int x) {
        val = x;
    }

    public int getval() {
        return this.val;
    }

    public void add(int newData) {
        if (this.next == null) {
            ListNode newNode = new ListNode(newData);
            this.next = null;
        } else {
            this.next.add(newData);
        }
    }

    public static ListNode bulidListNode(int[] input) {
        ListNode first = null, last = null, newNode;
        for (int i = 0; i < input.length; i++) {
            newNode = new ListNode(input[i]);
            newNode.next = null;
            if (first == null) {
                first = newNode;
                last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
        }
        return first;
    }

    public void print() {
        if (this.next == null) {
            System.out.println(this.val);
        } else {
            System.out.print(this.val + "->");
            this.next.print();
        }
    }

}