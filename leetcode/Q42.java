/**
 * 接雨水
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 */
public class Q42 {
    /**
     * 通过最大值，最小值两个数组来计算面积
     * @param height 数组
     * @return result
     */
    public int trap(int[] height) {
        return 0;
    }

    public int trapByPointers(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int max = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMost = 0;
        int rightMost = 0;
        while (left < right) {
            leftMost = Math.max(leftMost, height[left]);
            rightMost = Math.max(rightMost, height[right]);
            if (leftMost < rightMost) {
                max += leftMost - height[left];
                left++;
            } else {
                max += rightMost - height[right];
                right--;
            }
        }
        return max;
    }
}
