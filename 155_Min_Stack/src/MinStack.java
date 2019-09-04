import java.util.Stack;

/**
 * @author Sparklemax
 * @date 2019/9/4 21:02
 */

/*
* 思路：借助辅助栈，min_stack 用于获取stack中的最小值
* push的时候判断，然后push进入min_stack刷新最小值
* pop的时候弹出min_stack栈顶，即最小值
*
* */

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> min_stack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        min_stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(min_stack.isEmpty() || min_stack.peek() >= x)
            min_stack.push(x);
    }

    public void pop() {
        if(stack.pop().equals(min_stack.peek()))
            min_stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }
}
