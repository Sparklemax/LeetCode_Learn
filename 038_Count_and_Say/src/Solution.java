/**
 * @author matrixmax
 * @date 2019/7/25 19:35
 */

class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <=n ; i++) {
            StringBuilder sb = new StringBuilder();
            char pre = str.charAt(0);
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                if(pre == str.charAt(j)){
                    count++;
                } else {
                    sb.append(count).append(pre);
                    pre = str.charAt(j);
                    count = 1;
                }
            }
            sb.append(count).append(pre);
            str = sb.toString();
        }
        return str;
    }
}
