/**
 * @author Sparklemax
 * @date 2019/8/15 20:56
 */

/*
* 思路：异或·
*异或是机器码运算，相同为0不同为1，不管数字先后，
* 只要两个数字相同对应的二进制都会被异或为00000000，
* 最后剩下的就是所要找的值
* */

public class Solution2 {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        if(nums.length>1){
            for (int i = 1; i < nums.length; i++) {
                ans = ans^nums[i];
            }
        }
        return ans;
    }
}
