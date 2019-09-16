import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sparklemax
 * @date 2019/9/16 20:39
 */

/*
* 思路：使用队列，根据上一次队列的值，
* 不断弹出拼接下一个字母代表的值
* 然后不断迭代
* */

class Solution {
    private static String[] map = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return Collections.emptyList();
        LinkedList<String> list = new LinkedList<>();
        list.add("");
        char[] digitsArray = digits.toCharArray();
        for (int i = 0; i < digitsArray.length; i++) {
            char c = digitsArray[i];
            while (list.getFirst().length() == i){
                String pop = list.removeFirst();
                for (char v : map[c-'2'].toCharArray()
                     ) {
                    list.add(pop + v);
                }
            }
        }
        return list;
    }
}