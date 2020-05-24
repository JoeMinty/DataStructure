import java.util.Stack;

/**
 * 下个更大的元素 II
 * [1, 2, 1]
 * [2, -1, 2]
 */
public class Q503 {

    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
               res[stack.pop()] = nums[i];
            }

            stack.push(i);
        }

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                res[stack.pop()] = nums[i];
            }
        }

        while (!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }

        return res;
    }
}
