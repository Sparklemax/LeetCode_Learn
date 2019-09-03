import java.io.IOException;
import java.util.Scanner;

/**
 * @author Sparklemax
 * @date 2019/9/3 19:55
 */

public class main {
    public static void main(String[] args) throws IOException {
        Solution2 sl = new Solution2();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int pos =(int)(System.in.read()-'0');
        //System.out.println(pos);
        ListNode ln = new ListNode().buildListNode(str,pos);
        System.out.println(sl.hasCycle(ln));

    }
}
