import java.util.HashSet;
import java.util.Set;

/**
 * 快乐数
 */
public class Q202 {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while (n > 1) {
            set.add(n);
            int current = n;
            int sum = 0;
            while ( current != 0) {
               int temp = current % 10;
               sum += temp * temp;
               current = current / 10;
            }
            if (set.contains(sum)) {
                return false;
            }
            n = sum;
        }

        return n == 1;
    }
}
