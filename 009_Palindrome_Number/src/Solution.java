/**
 * @author matrixmax
 * @date 2019/7/18 20:15
 */

/*
* 方法：最简单的变成字符串然后比较
* 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
* 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
* StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
* 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
* 然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
*
* */


public class Solution {
    public boolean isPalindrome(int x) {
        String reversedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x+"").equals(reversedStr);
    }
}

