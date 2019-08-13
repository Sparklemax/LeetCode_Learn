/**
 * @author Sparklemax
 * @date 2019/8/13 19:59
 */

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            if (prices[i] - min > max)
                max = prices[i] - min;

        }
        return max;
    }
}