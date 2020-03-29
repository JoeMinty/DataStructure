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
    public int hanoiProblem(int num, String left, String mid, String right) {
        if (num < 1) {
            return 0;
        }

        return progress(num, left, mid, right, left, right);
    }

    public int progress(int num, String left, String mid, String right, String from, String to) {
        if (num == 1) {
            if (from.equals(mid) || to.equals(mid)) {
                System.out.println("Move 1 from " + from + " to " + to);
                return 1;
            } else {
                System.out.println("Move 1 from " + from + " to " + mid);
                System.out.println("Move 1 from " + mid + " to " + to);
                return 2;
            }
        }

        if (from.equals(mid) || to.equals(mid)) {
            String another = (from.equals(left) || to.equals(left)) ? right : left;
            int part1 = progress(num - 1, left, mid, right, from, another);
            int part2 = 1;
            System.out.println("Move 1 from " + from + " to " + to);
            int part3 = progress(num - 1, left, mid, right, another, to);
            return part1 + part2 + part3;
        } else {
            int part1 = progress(num - 1, left, mid, right, from, to);
            int part2 = 1;
            System.out.println("Move " + num + " from " + from + " to " + mid);
            int part3 = progress(num - 1, left, mid, right, to, from);
            int part4 = 1;
            System.out.println("Move  " + num + " from " + mid + " to " + to);
            int part5 = progress(num - 1, left, mid, right, from, to);
            return part1 + part2 + part3 + part4 + part5;
        }
    }


}
