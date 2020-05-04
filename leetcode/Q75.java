/**
 * 颜色分类
 *
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 */
public class Q75 {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }

        int left = 0;
        int right = nums.length - 1;
        int i = 0;
        while (i <= right) {

            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                i++;
                left++;
            } else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 1};
        new Q75().sortColors(nums);
    }
}
