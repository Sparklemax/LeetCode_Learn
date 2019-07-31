/**
 * @author matrixmax
 * @date 2019/7/7
 */

/*
暴力法很简单，遍历每个元素 xx，并查找是否存在一个值与 target - xtarget−x 相等的目标元素。
复杂度分析：
    时间复杂度：O(n^2)，
    对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n)*O(n) 的时间。因此时间复杂度为 O(n^2)O(n2)。
    空间复杂度：O(1)。
*/

public class Solution {
    public int[] twoSum(int[] nums,int target){
        for (int i = 0; i <nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i])
                    return new int[]{i,j};
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }
}
