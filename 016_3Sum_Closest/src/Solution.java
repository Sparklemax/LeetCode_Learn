import java.util.Arrays;

/**
 * @author Sparklemax
 * @date 2019/9/12 19:38
 */

/*
* 思路：
* 首先对数组进行排序，然后遍历每一个元素
* 使用双指针，前面指针指向当前元素的下一个，后面指针指向最后一个元素
* 判断三个元素的和，如果与目标的距离变近了，则更新ans；
* 同时判断当前和与目标的关系，如果大了，则后指针往前，如果小了，前指针往后
* 如果相同直接返回
* */

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < len; i++) {
            int left = i+1;
            int right = len-1;
            while (left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target-sum)<Math.abs(target-ans))
                {
                    System.out.println("yes");
                    ans = sum;
                }

                if(sum>target)
                    right--;
                else if(sum<target)
                    left++;
                else
                    return ans;
            }
        }
        return ans;
    }
}