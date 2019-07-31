/**
 * @author matrixmax
 * @date 2019/7/19 14:42
 */

public class main {
    public static void main(String[] args) {
        Solution2 sl = new Solution2();
        String[] strs = new String[]{"flower","flow","flcc"};
        String[] strs2 = new String[]{"flower","fxlow","flcc"};
        System.out.println(sl.longestCommonPrefix(strs));
        System.out.println(sl.longestCommonPrefix(strs2));


    }
}
