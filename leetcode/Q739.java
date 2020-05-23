import java.util.Stack;

/**
 * 每日温度
 */
public class Q739 {
    // 暴力法
    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] res = new int[len];

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (T[j] > T[i])  {
                    res[i] = j - i;
                    break;
                }
            }
        }

        return res;
    }

    // 暴力法优化，从右往左
    public int[] dailyTemperatures1(int[] T) {
        int len = T.length;
        int[] res = new int[len];

        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j += res[j]) {
                if (T[j] > T[i]) {
                    res[i] = j - i;
                    break;
                } else if (res[j] == 0) {
                    res[i] = 0;
                    break;
                }
            }
        }

        return res;
    }

    // 单调栈
    public int[] dailyTemperatures2(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int len = T.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int pre = stack.pop();
                res[pre] = i - pre;
            }
            stack.add(i);
        }
        return res;
    }
}
