import java.util.HashMap;
import java.util.Map;

/**
 * @author Sparklemax
 * @date 2019/8/15 20:26
 */

/*
 * 思路：hash表
 * */

public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums
        ) {
            if(map.get(i)==null)//如果是未添加过的，则置1
                map.put(i,1);
            else//如果已经出现过， 则置-1
                map.put(i,-1);

        }
        for (int i : nums
        ) {
            if(map.get(i)==1)
                return i;
        }
        return -1;
    }
}
