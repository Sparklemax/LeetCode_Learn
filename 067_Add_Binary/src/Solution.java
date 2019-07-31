/**
 * @author matrixmax
 * @date 2019/7/31 19:08
 */

/*
* 思路：
* 使用carry代表进位
* 从后往前一位一位相加即可
* */

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        while (len1 >= 0 && len2 >= 0) {
            carry+=a.charAt(len1--)-'0';
            carry+=b.charAt(len2--)-'0';
            sb.insert(0,carry%2);
            carry>>=1;
        }
        while(len1>=0){
            carry+=a.charAt(len1--)-'0';
            sb.insert(0,carry%2);
            carry>>=1;
        }
        while(len2>=0){
            carry+=b.charAt(len2--)-'0';
            sb.insert(0,carry%2);
            carry>>=1;
        }
        if(carry == 1)
            sb.insert(0,1);
        return sb.toString();
    }
}