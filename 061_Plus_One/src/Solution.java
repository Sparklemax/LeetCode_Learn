/**
 * @author matrixmax
 * @date 2019/7/29 20:33
 */

/*
 * 思路；
 * 数学计算，看进位
 * 最后一位+1，如果不为10，则直接返回
 * 如果为10，则循环到下一位加一，直到不为10推出，或者直到最高位
 * 如果到了最高位，则新建一个数组全为0，
 * 然后将首位设置为1，返回
 * */


class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0)
                return digits;
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

    public void pri(int[] digits) {
        int i = 0;
        for (i = 0; i < digits.length - 1; i++) {
            System.out.print(digits[i]);
        }
        System.out.println(digits[i]);
    }

}
