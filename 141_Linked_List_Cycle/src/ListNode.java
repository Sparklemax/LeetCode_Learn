import java.util.List;

/**
 * @author Sparklemax
 * @date 2019/9/3 19:56
 */

public class ListNode {
    int val;
    ListNode next;
    ListNode(){
    }

    ListNode(int x){
        val = x;
        next = null;
    }

    public ListNode buildListNode(String s){
        ListNode first = null,last = null,newNode;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit((s.charAt(i)))){
                newNode = new ListNode(s.charAt(i)-'0');
                newNode.next = null;
                if (first == null){
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

    public ListNode buildListNode(String s,int pos){
        ListNode first = null,last = null,newNode;
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit((s.charAt(i)))){
                len++;
                newNode = new ListNode(s.charAt(i)-'0');
                newNode.next = null;
                if (first == null){
                    first = newNode;
                    last = newNode;
                } else {
                    last.next = newNode;
                    last = newNode;
                }
            }
        }
        ListNode p = first;
        if(pos>-1&&pos<len){
            for (int i = 0; i <= pos; i++) {
                last.next = p;
                last = p;
                p = p.next;
            }
        }
        return first;
    }

    public ListNode buildListNode(int[] input){
        ListNode first = null,last = null,newNode;
        for (int i = 0; i < input.length; i++) {
            newNode = new ListNode(input[i]);
            newNode.next = null;
            if(first == null){
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
        else {
            System.out.print(this);
            this.next.print();
        }
    }


}
