import java.util.HashMap;
import java.util.Map;

/**
 * @author matrixmax
 * @date 2019/7/19 9:10
 */


/*
* 首先将所有的组合可能性列出并添加到哈希表中
* 然后对字符串进行遍历，由于组合只有两种，一种是 1 个字符，一种是 2 个字符，其中 2 个字符优先于 1 个字符
* 先判断两个字符的组合在哈希表中是否存在，存在则将值取出加到结果 ans 中，并向后移2个字符。
* 不存在则将判断当前 1 个字符是否存在，存在则将值取出加到结果 ans 中，并向后移 1 个字符
* 遍历结束返回结果 ans
*
* */

public class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int ans = 0;
        for(int i = 0;i < s.length();) {
            if(i + 1 < s.length() && map.containsKey(s.substring(i, i+2))) {
                ans += map.get(s.substring(i, i+2));
                i += 2;
            } else {
                ans += map.get(s.substring(i, i+1));
                i ++;
            }
        }
        return ans;
    }
}
