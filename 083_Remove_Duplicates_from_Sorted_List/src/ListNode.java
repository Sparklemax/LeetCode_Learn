/**
 * @author matrixmax
 * @date 2019/8/2 19:43
 */

public class ListNode {
    int val;
    ListNode next;
    ListNode(){
    }
    ListNode(int x){
        val = x;
    }

    public ListNode buildListNode(String s){
        ListNode first = null,last = null,newNode;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                newNode = new ListNode(s.charAt(i)-'0');
                newNode.next = null;
                if(first == null){
                    first = newNode;
                    last = newNode;
                } else {
                    last.next = newNode;
                    last = newNode;
                }
            }
        }
        return first;
    }

    public ListNode bulidListNode(int[] input){
        ListNode first = null,last = null,newNode;
        for (int i = 0; i < input.length; i++) {
            newNode = new ListNode(input[i]);
            newNode.next = null;
            if (first == null){
                first = newNode;
                last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
        }
        return first;
    }


    public void print(){
        if(this.next==null)
            System.out.println(this.val);
        else{
            System.out.print(this.val+"->");
            this.next.print();
        }
    }
}
