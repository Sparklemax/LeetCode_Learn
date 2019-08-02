import java.util.Scanner;

/**
 * @author matrixmax
 * @date 2019/8/2 19:42
 */

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ListNode ln = new ListNode().buildListNode(str);
        Solution sl = new Solution();
        sl.deleteDuplicates(ln).print();

    }
}
