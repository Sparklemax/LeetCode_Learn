/**
 * @author Sparklemax
 * @date 2019/8/15 19:22
 */

class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j = s.length()-1;
        while (j>i){
            while(i<j&&!Character.isLetterOrDigit(s.charAt(i)))
                i++;
            while(i<j&&!Character.isLetterOrDigit(s.charAt(j)))
                j--;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
