/**
 * @author Sparklemax
 * @date 2019/9/7 15:09
 */

/*
 * 思路：双指针法
 *
 * */

public class Solution2 {
    public int maxArea(int[] height) {
        int maxarea = 0, tmp = 0, l = 0, r = height.length - 1;
        while (l<r){
            tmp = Math.min(height[l],height[r]) * (r-l);
            maxarea = Math.max(tmp,maxarea);
            if(height[l]>height[r])
                r--;
            else
                l++;
        }
        return maxarea;
    }
}
