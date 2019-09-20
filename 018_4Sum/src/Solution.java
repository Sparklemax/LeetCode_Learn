import java.lang.reflect.Array;
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
        if(len < 4)
            return res;
        Arrays.sort(nums);//排序
        int max = nums[len-1];
        if(4*max < target)
            return res;
        for (int i = 0; i < len-3;) {
            if(4*nums[i]>target)
                break;//如果当前最小值的四倍已经大于target了就可以退出了
            if(nums[i] + 3*max<target){
                while (nums[i]==nums[++i]&&i<len-3);
                continue;
            }
            for (int j = 0; j < len-2;) {
                int subsum = nums[i]+nums[j];
                if(nums[i]+nums[j]*3 > target)
                    break;//当前坑的最小的数值加起来大于target，可以退出了
                if(subsum+ 2* max < target){
                    while (nums[j]==nums[++j]);
                    continue;
                }

                int left = j+1;
                int right = len-1;
                while (left<right){
                    int sum = subsum + nums[left] + nums[right];
                    if(sum == target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));

                    }
                    else if
                }

            }
        }

        return res;
    }
}