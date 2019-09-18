import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sparklemax
 * @date 2019/9/18 20:00
 */

/*
* 思路：双指针法
* 与3sum思路一致，先进行排序，
* 然后双指针分别指向当前元素的下一个位置，末尾元素
* 通过判断四者的和与target的大小来移动指针
*  */


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len<4)
            return res;
        Arrays.sort(nums);
        int max = nums[len-1];
        if(4 * max < target)
            return res;
        for (int i = 0; i < len-3;) {
            if(nums[i] * 4 > target)//当前最小元素的四倍已经大于target的时候就可以退出了
                break;
            if(nums[i] + 3*max<target){
                while (nums[i] == nums[++i] && i<len-3);
                continue;
            }
            for (int j = i+1; j < len-2;) {
                int subSum = nums[i] + nums[j];
                if (nums[i]+nums[j]*3>target)
                    break;//当前最小元素的四倍已经大于target的时候就可以退出了
                if(subSum+2*max<target){
                    while (nums[j]==nums[++j] && j<len-2);
                    continue;
                }
                int left = j+1,right = len-1;
                while (left<right){
                    int sum = subSum + nums[left] + nums[right];
                    if(sum == target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while (nums[left]==nums[++left] && left <right);
                        while (nums[right] == nums[--right] && left <right);
                    } else if(sum < target)
                        ++left;
                    else --right;
                }
                while (nums[j]==nums[++j] && j<len-2);//去重
            }
            while (nums[i] == nums[++i]&&i<len-3);//去重
        }
        return res;
    }
}