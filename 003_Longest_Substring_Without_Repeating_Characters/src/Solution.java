import java.util.HashMap;

/**
 * @author Sparklemax
 * @date 2019/9/4 21:43
 */

/*
* 思路：滑动窗口
* i为当前字符串右端，left为左端，
* */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                //注意此处，left只能前进，不能后退，abba情况时
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;

    }
}
