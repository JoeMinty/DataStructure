import java.util.HashSet;
import java.util.Set;

/**
 * 寻找重复数
 */
public class Q287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }

        return 0;
    }
}
