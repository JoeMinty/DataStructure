package practice;

import java.util.Stack;

public class StackAndQueue {

    /**
     * 用一个栈实现另一个栈的排序
     */
    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }

        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }

    /**
     * 用栈来求解汉诺塔问题
     *
     * 解法1：递归
     * 解法2：非递归
     */



}
