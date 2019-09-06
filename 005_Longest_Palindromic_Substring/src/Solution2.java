/**
 * @author Sparklemax
 * @date 2019/9/6 9:42
 */

/*
* 思路：中心扩展法
* 回文关于中心对称，并且有2n-1个中心（注意回文中心可以在两个字母之间）
*
*
* 复杂度分析：
* 时间复杂度：o(n2)
* 空间复杂度：o(1)
*
* */

public class Solution2 {
    public String longestPalindrome(String s) {
        if(s == null || s.equals(""))
            return null;
        if(s.length() == 1)
            return s;
        int st = 0,end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s,i,i);
            int len2 = expandAroundCenter(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end-st){
                st = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(st,end+1);
    }

    private int expandAroundCenter(String s, int left, int right){
        int l = left;
        int r = right;
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}
