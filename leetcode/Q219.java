import java.util.HashSet;

/**
 * 存在重复元素
 *
 */
public class Q219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 1) {
            return false;
        }

        for (int left = 0; left < nums.length - 1; left++) {
            int leftVal = nums[left];
            for (int right = left + 1; right < nums.length; right++) {
                if (nums[right] == leftVal) {
                    if (right - left <= k) {
                        return true;
                    } else {
                        break;
                    }
                }
            }
        }

        return false;
    }

    /**
     * 用hashset解决
     * @param args
     */
    public boolean containsNearbyDuplicateByHash(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        new Q219().containsNearbyDuplicate(nums, 2);
    }
}
