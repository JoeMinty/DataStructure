/**
 *
 * 移动零
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class Q283 {

    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;

        for (; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }
}
