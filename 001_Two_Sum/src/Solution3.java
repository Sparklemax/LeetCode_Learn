import java.util.HashMap;
import java.util.Map;

/**
 * @author matrixmax
 * @date 2019/7/12 9:38
 */

/*
 * 一遍hash表
 * 意思就是边插入边检查是否已经有了
 * 事实上可以一次完成。在进行迭代并将元素插入到表中的同时，
 * 我们还会回过头来检查表中是否已经存在当前元素所对应的目标元素。
 * 如果它存在，那我们已经找到了对应解，并立即将其返回。
 *
 *复杂度分析：
 * 时间复杂度：O(n)， 我们只遍历了包含有 nn 个元素的列表一次。在表中进行的每次查找只花费 O(1) 的时间。
 * 空间复杂度：O(n)， 所需的额外空间取决于哈希表中存储的元素数量，该表最多需要存储 n 个元素。
 *
 * */

public class Solution3 {
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key=target-nums[i];
            if(map.containsKey(key))
                return new int[]{map.get(key),i};
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no two sum solution");
    }
}
