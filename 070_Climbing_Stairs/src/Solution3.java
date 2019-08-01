/**
 * @author matrixmax
 * @date 2019/8/1 11:13
 */

/*
* 思路：斐波那契数
*
* */

public class Solution3 {
    public int climbStairs(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int first = 1;
        int second = 2;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = first+second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
