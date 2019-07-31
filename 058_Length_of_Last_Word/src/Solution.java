/**
 * @author matrixmax
 * @date 2019/7/29 19:59
 */

/*
 * 思路：
 * 从后往前数，首先去除最后面可能多余的空格
 * 然后开始计数单词长度
 * 然后遇到中间的空格停止计数
 *
 * */

class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length() - 1;
        while (len >= 0 && s.charAt(len) == ' ')
            len--;
        int end = len;
        while (len >= 0 && s.charAt(len) != ' ')
            len--;
        return end - len;
    }
}
