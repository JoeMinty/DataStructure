/**
 * 移动零
 * [0, 1, 0, 3, 12]
 * [1, 3, 12, 0, 0]
 */
public class Q283 {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums.length == 1 || nums == null) {
            return;
        }

        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] == 0) {
                continue;
            }

            if (nums[fast] != 0 && slow != fast) {
                nums[slow] = nums[fast];
                nums[fast] = 0;
            }
            slow++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        new Q283().moveZeroes(nums);
    }
}
