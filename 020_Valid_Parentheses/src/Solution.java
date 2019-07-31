import java.util.Stack;

/**
 * @author matrixmax
 * @date 2019/7/20 9:27
 */

public class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
                stack[top++] = s.charAt(i);
            else {
                --top;
                if(top<0) return false;
                if(s.charAt(i)==')'&&stack[top]!='(')
                    return false;
                if(s.charAt(i)==']'&&stack[top]!='[')
                    return false;
                if(s.charAt(i)=='}'&&stack[top]!='{')
                    return false;
            }
        }
        return top==0;
    }
}
