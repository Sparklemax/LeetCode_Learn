/**
 * @author Sparklemax
 * @date 2019/9/7 14:16
 */

/*
* 思路：暴力法
* 直接考虑每种线段组合，算面积，找最大值
*
* */

class Solution {
    public int maxArea(int[] height){
        int maxarea = 0;
        int tmp = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                tmp = Math.min(height[i],height[j]) * (j-i);
                maxarea = Math.max(maxarea,tmp);
            }
        }
        return maxarea;
    }
}
