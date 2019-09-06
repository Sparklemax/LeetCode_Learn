/**
 * @author Sparklemax
 * @date 2019/9/5 21:38
 */

/*
 * 思路：DP，dp[i][j]定义为区间i,j是否为回文串，分为三种情况
 * 1. i==j, dp[i][j]=true;
 * 2. i+1==j,需要判断s[i]和s[j]是否相等
 * 3. i+1<j时，dp[i][j] = dp[i+1][j-1]&&s[i]==[j].
 * */

class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len <= 1) return s;
        int st = 0, end = 0;
        char[] chars = s.toCharArray();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {w
            dp[i][i] = true;
            for (int j = 0; j < i; j++) {
                if (j + 1 == i)
                    dp[j][i] = chars[j] == chars[i];
                else
                    dp[j][i] = dp[j + 1][i - 1] && chars[i] == chars[j];
                //更新st与end的值
                if (dp[j][i] && i - j > end - st) {
                    st = j;
                    end = i;
                }
            }
        }
        return s.substring(st, end + 1);
    }
}