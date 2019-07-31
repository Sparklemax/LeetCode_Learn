import java.util.HashMap;
import java.util.Map;

/**
 * @author matrixmax
 * @date 2019/7/12
 */

/*
 * 两遍hash表
 * 在第一次迭代中，我们将每个元素的值和它的索引添加到表中。
 * 然后，在第二次迭代中，我们将检查每个元素所对应的目标元素（target - nums[i]target−nums[i]）是否存在于表中。
 * 注意，该目标元素不能是 nums[i]nums[i] 本身！
 *
 * 复杂度分析：
 * 时间复杂度：O(n)O(n)， 我们把包含有 nn 个元素的列表遍历两次。由于哈希表将查找时间缩短到 O(1)O(1) ，所以时间复杂度为 O(n)O(n)。
 * 空间复杂度：O(n)O(n)， 所需的额外空间取决于哈希表中存储的元素数量，该表中存储了 nn 个元素。
 * */

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key) && map.get(key) != i) {
                return new int[]{i, map.get(key)};
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }
}
