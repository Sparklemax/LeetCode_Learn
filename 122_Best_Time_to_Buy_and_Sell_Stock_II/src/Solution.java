/**
 * @author Sparklemax
 * @date 2019/8/13 21:06
 */

class Solution {
    public int maxProfit(int[] prices) {
    int max = 0;
    for (int i = 1; i < prices.length; i++) {
        if (prices[i] > prices[i - 1])
            max += prices[i] - prices[i - 1];
    }
    return max;
}
}