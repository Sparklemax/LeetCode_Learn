import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sparklemax
 * @date 2019/9/9 20:48
 */

/*
 * 思路：
 * 先对数组进行排序，双指针分别指向当前元素的下一个，和数组的尾部，
 * 判断当前元素，两指针指的元素，三者的和与0的大小，来移动指针
 * 然后遍历所有元素
 * */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if (nums == null || len < 3)
            return ans;
        Arrays.sort(nums);//排序
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0)//如果当前元素大于0，则三数之和一定大于0
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;//去重
            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l+1])
                        l++;//去重
                    while (l < r && nums[r] == nums[r-1])
                        r--;//去重
                    l++;
                    r--;
                } else if (sum < 0)
                    l++;
                else if (sum > 0)
                    r--;
            }
        }
        return ans;
    }
}