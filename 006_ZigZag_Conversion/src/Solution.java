/**
 * @author Sparklemax
 * @date 2019/9/6 19:37
 */

/*
 * 思路：利用loc来控制下标，利用down控制方向，
 * */

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        int len = Math.min(numRows,s.length());
        String[] rows = new String[len];
        for (int i = 0; i < len; i++) {
            rows[i] = "";
        }
        int loc = 0;
        boolean down = false;

        for (int i = 0; i < s.length(); i++) {
            rows[loc] += s.substring(i,i+1);
            if(loc ==0 || loc == numRows -1)
                down = !down;
            loc += down?1:-1;
        }

        String ans = "";
        for (int i = 0; i < len; i++) {
            ans += rows[i];
        }
        return ans;

    }
}
