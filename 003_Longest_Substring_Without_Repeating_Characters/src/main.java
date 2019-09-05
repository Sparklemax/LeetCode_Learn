import java.util.Scanner;

/**
 * @author Sparklemax
 * @date 2019/9/4 21:42
 */

public class main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(sl.lengthOfLongestSubstring(s));
    }
}
