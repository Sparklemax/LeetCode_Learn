import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Sparklemax
 * @date 2019/8/12 19:45
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0)
            return Collections.emptyList();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> span = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i){
                    span.add(1);
                } else {
                    List<Integer> lastSpan = list.get(i-1);
                    span.add(lastSpan.get(j-1)+lastSpan.get(j));
                }
            }
            list.add(span);
        }
        return list;
    }

}