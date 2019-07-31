import java.util.Map;

/**
 * @author matrixmax
 * @date 2019/7/19 16:23
 */

/*
 * 分治法
 * 使用分治的技巧，将原问题 i-j分成两个子问题i-mid与 mid-j
 * 我们用子问题的解构造原问题的解
 * 从头到尾挨个比较 lcpLeft 与 lcpRight 中的字符，直到不能再匹配为止。
 * 计算所得的 lcpLeft 与 lcpRight 最长公共前缀就是原问题的解
 *
 * */

public class Solution2 {
    public String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length ==0)
            return "";
        return longestCommonPrefix(strs,0,strs.length-1);
    }
    public String longestCommonPrefix(String[] strs,int l,int r){
        if(l==r)
            return strs[l];
        int mid = (l+r)/2;
        String left = longestCommonPrefix(strs,l,mid);
        String right = longestCommonPrefix(strs,mid+1,r);
        return commonPrefix(left,right);
    }

    public String commonPrefix(String left,String right){
        int min = Math.min(left.length(),right.length());
        for (int i = 0; i < min; i++) {
            if(left.charAt(i)!=right.charAt(i))
                return left.substring(0,i);
        }
        return left.substring(0,min);
    }

}
