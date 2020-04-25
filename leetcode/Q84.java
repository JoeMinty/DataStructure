import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
 * <p>
 * 柱状图中最大的矩形
 * 输入: [2,1,5,6,2,3]
 * 输出: 10
 */
public class Q84 {

    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= heights.length; i++) {
            int cur = i < heights.length ? heights[i] : -1;
            while (!stack.isEmpty() && cur <= heights[stack.peek()]) {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                res = Math.max(w * h, res);
            }

            stack.push(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] heights = {2,1,2,1};
        int res = new Q84().largestRectangleArea(heights);
        System.out.println(res);
    }
}
