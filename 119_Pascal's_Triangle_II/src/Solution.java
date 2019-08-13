import java.util.ArrayList;
import java.util.List;

/**
 * @author Sparklemax
 * @date 2019/8/12 20:58
 */

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add(1);
            for (int j = i-1; j > 0; j--) {
                list.set(j,list.get(j-1)+list.get(j));
            }
        }
        return list;
    }
}