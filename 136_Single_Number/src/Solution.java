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
        for (int i: nums
             ) {
            if(map.get(i)==null)
                map.put(i,1);
            else
                map.put(i,-1);
        }
        for (int i:nums
             ) {
            if(map.get(i)==1)
                return i;
        }
        return -1;
    }
}
